/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import database.Table;
import database.Row;
public class Program {

    
    public static void main(String[] args) {
        
        // Tablomuzu oluşturuyoruz
        Table myTable = new Table("MyTable");

        // Satırları tabloya ekliyoruz
        myTable.addColumn("No");
        myTable.addColumn("Name");
        myTable.addColumn("Surname");

        // Sütunlara verileri atayıp tabloya ekliyoruz
        Row row1 = new Row();
        row1.addData("No", 123);
        row1.addData("Name", "Elifnur");
        row1.addData("Surname", "Demirezen");

        Row row2 = new Row();
        row2.addData("No", 456);
        row2.addData("Name", "Eda Nur");
        row2.addData("Surname", "Topdağ");

        Row row3 = new Row();
        row3.addData("No", 789);
        row3.addData("Name", "Deniz Ece");
        row3.addData("Surname", "Kışlalı");

        myTable.addRow(row1);
        myTable.addRow(row2);
        myTable.addRow(row3);

        // "No" satırındaki 2.sütunun değerini güncelliyoruz
        String columnNameToUpdate = "No";
        Object newValue = 345;
        int rowIndexToUpdate = 1;

        myTable.getRows().get(rowIndexToUpdate).setData(columnNameToUpdate, newValue);

        // Tablodan veri alıp yazdırıyoruz
        System.out.println("Table Name: " + myTable.getTableName());
        System.out.println("Columns: " + myTable.getColumns().toString());
        System.out.println("Rows: ");
        for (Row row : myTable.getRows()) {
            System.out.println( " No: " + row.get("No") +" Name: " + row.getData("Name") + " Surname: " + row.getData("Surname"));
        }
    }
    
    
}
