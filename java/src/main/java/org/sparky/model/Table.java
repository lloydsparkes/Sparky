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
    public static final String INDEX_KEY = "$$";

    private Map<String, Integer> columns = new HashMap<>();
    private String[][] data;
    private Map<String, Filter> filters = new HashMap<>();

    private String[][] cachedFiltered;
    private Integer currentRow = null;

    public Table(Map<String, Integer> columns, String[][] data, Map<String, Filter> filters) {
        this.columns = columns;
        this.data = data;
        this.filters = filters;
    }

    /**
     * Indexes Run 1..n not 0..n
     * @param tableIndex
     * @param root
     * @return
     * @throws InvalidKeyException
     */
    public boolean isIndexValid(Integer tableIndex, Configuration root) throws InvalidKeyException {
        if(haveFiltersChanged(root) || cachedFiltered == null){
            applyFilters(root);
        }

        return ((tableIndex-1) <= cachedFiltered.length && tableIndex >= 0);
    }

    public void setRowIndex(Integer rowIndex){
        currentRow = rowIndex-1;
    }

    public void clearRowIndex(){
        currentRow = null;
    }

    public List<String> valuesForColumn(String columnName, Configuration root) throws InvalidKeyException {
        if(haveFiltersChanged(root) || cachedFiltered == null){
            applyFilters(root);
        }

        int firstRow = currentRow == null ? 0 : currentRow;
        int maxRow = currentRow == null ? cachedFiltered.length : currentRow + 1;

        if(columnName.equals(INDEX_KEY)){
            List<String> indexes = new ArrayList<>();
            for(int row = firstRow; row < maxRow; row++){
                indexes.add(Integer.toString(row+1));
            }
            return indexes;
        }

        if(columns.containsKey(columnName)){
            int columnIndex = columns.get(columnName);

            Set<String> values = new HashSet<>();

            for(int row = firstRow; row < maxRow; row++){
                values.add(cachedFiltered[row][columnIndex]);
            }

            return new ArrayList<>(values);
        } else {
            throw new InvalidColumnNameException(columnName);
        }
    }

    public String valueForColumn(String columnName, Configuration root) throws InvalidKeyException {
        List<String> values = valuesForColumn(columnName, root);

        if(values.size() == 1){
            return values.get(0);
        }
        throw new InvalidKeyException(String.format("Query for '%s' Column returned either 0 or > 1 value.", columnName));
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
