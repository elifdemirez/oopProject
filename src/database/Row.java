/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.HashMap;
import java.util.Map;

public class Row {
   private Map<String, Object> rowData;

    public Row() {
        this.rowData = new HashMap<>();
    }

    public void addData(String columnName, Object value) {
        rowData.put(columnName, value);
    }

    public Object getData(String columnName) {
        return rowData.get(columnName);
    }

    public void setData(String columnName, Object value) {
        rowData.put(columnName, value);
    }

    public Object get(String columnName) {
        return rowData.get(columnName);
    }
}
