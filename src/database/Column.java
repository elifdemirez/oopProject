/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.List;


public class Column {
    private String name;
    private List<Object> values;

    public Column(String name) {
        this.name = name;
        this.values = new ArrayList<>();
    }

    public void addValue(Object value) {
        values.add(value);
    }

    public List<Object> getValues() {
        return values;
    }

    public String getName() {
        return name;
    }
}
