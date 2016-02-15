package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;
import org.sparky.model.keys.IndexerKey;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by lloyd on 15/02/2016.
 */
public class IndexerBlock extends Block {

    public IndexerBlock(IndexerKey key, List<Block> children, Map<Key, Rule> rules, Table table) {
        super(key, children, rules, table);
    }

    @Override
    public String getValue(Queue<String> pathBits, Configuration root) throws InvalidKeyException {
        throw new IllegalStateException("This method is not allowed to be called on a IndexerBlock");
    }

    public String getValue(String index, Queue<String> pathBits, Configuration root) throws InvalidKeyException {
        Integer tableIndex = Integer.valueOf(index);

        if(table.isIndexValid(tableIndex, root)){
            table.setRowIndex(tableIndex);

            try{
                return super.getValue(pathBits, root);
            } finally {
                table.clearRowIndex();
            }
        } else {
            throw new InvalidKeyException("Table Index Not Valid");
        }
    }
}
