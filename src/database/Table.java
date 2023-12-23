/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String tableName;
    private List<Column> columns;
    private List<Row> rows;

    public Table(String tableName) {
        this.tableName = tableName;
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    public void addColumn(String columnName) {
        columns.add(new Column(columnName));
    }

    public void addRow(Row row) {
        if (row != null) {
            rows.add(row);
        }
    }

    public List<Row> getRows() {
        return rows;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public String getTableName() {
        return tableName;
    }
}
