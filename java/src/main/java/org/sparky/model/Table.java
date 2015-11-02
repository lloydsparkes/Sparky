package org.sparky.model;

import org.sparky.model.exceptions.InvalidColumnNameException;
import org.sparky.model.exceptions.InvalidKeyException;

import java.util.*;

/**
 * Implementation of a table
 *
 * Created by lloyd on 19/10/2015.
 */
public class Table {

    private Map<String, Integer> columns = new HashMap<>();
    private String[][] data;
    private Map<String, Filter> filters = new HashMap<>();

    private String[][] cachedFiltered;

    public Collection<String> valuesForColumn(String columnName, Configuration root) throws InvalidKeyException {
        if(haveFiltersChanged(root) || cachedFiltered == null){
            applyFilters(root);
        }

        if(columns.containsKey(columnName)){
            int columnIndex = columns.get(columnName);

            Set<String> values = new HashSet<>();

            for(int row = 0; row < cachedFiltered.length; row++){
                values.add(cachedFiltered[row][columnIndex]);
            }

            return values;
        } else {
            throw new InvalidColumnNameException(columnName);
        }
    }

    private void applyFilters(Configuration root) throws InvalidKeyException {
        Map<Integer, String> evaluatedFilters = new HashMap<>();
        for(String col : filters.keySet()){
            Filter fit = filters.get(col);
            Integer colIndex = columns.get(col);
            evaluatedFilters.put(colIndex, fit.getValue(root));
        }

        if(evaluatedFilters.size() == 0){
            cachedFiltered = data;
            return;
        }

        List<String[]> filteredRows = new ArrayList<>();
        for(int row = 0; row < data.length; row++){
            String[] values = data[row];
            boolean allowRow = true;
            for(Integer index : evaluatedFilters.keySet()){
                if(!values[index].equals(evaluatedFilters.get(index))){
                    allowRow = false;
                    break;
                }
            }
            if(allowRow){
                filteredRows.add(values);
            }
        }
        cachedFiltered = new String[filteredRows.size()][];
        filteredRows.toArray(cachedFiltered);
    }

    private boolean haveFiltersChanged(Configuration root) throws InvalidKeyException {
        for(Filter f : filters.values()){
            if(f.hasChanged(root)){
                return true;
            }
        }
        return false;
    }
}
