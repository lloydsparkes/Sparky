package org.sparky.model.builders;

import org.sparky.model.*;
import org.sparky.model.keys.ConstantKey;
import org.sparky.model.keys.IndexerKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by lloyd on 17/10/2015.
 */
public class BlockBuilder {

    private String name;
    private VariableBuilder nameBuilder;
    private boolean isIndexer = false;

    private List<BlockBuilder> blocks = new ArrayList<>();
    private Map<String, Map<Boolean, EvaluatableBuilder>> rules = new HashMap<>();
    private TableBuilder table = null;

    public BlockBuilder withBlock(BlockBuilder block){
        blocks.add(block);
        return this;
    }

    public BlockBuilder withName(String name){
        this.name = name;
        return this;
    }

    public BlockBuilder withName(VariableBuilder variableBuilder){
        this.nameBuilder = variableBuilder;
        return this;
    }

    public BlockBuilder withIndexer(){
        isIndexer = true;
        return this;
    }

    public BlockBuilder withTable(TableBuilder table){
        this.table = table;
        return this;
    }

    public BlockBuilder withRule(boolean overrideFlag, String name, EvaluatableBuilder rule){
        if(!rules.containsKey(name)){
            rules.put(name, new HashMap<>());
        }

        rules.get(name).put(overrideFlag, rule);
        return this;
    }

    public Block build(Table parentTable) {
        Table t = table == null ? parentTable : table.build();

        List<Block> b = blocks.stream().map(bl -> bl.build(t)).collect(Collectors.toList());

        Map<Key, Rule> kvps = new HashMap<>();
        for(String key : rules.keySet()){

            Key k = new ConstantKey(key);
            Rule r = null;

            if(rules.get(key).size() > 1){
                r = rules.get(key).get(true).build();
            } else {
                r = rules.get(key).values().iterator().next().build();
            }
            kvps.put(k, r);
        }

        if(isIndexer){
            return new IndexerBlock(new IndexerKey(t), b, kvps, t);
        }

        return new Block(new ConstantKey(name), b, kvps, t);
    }
}
