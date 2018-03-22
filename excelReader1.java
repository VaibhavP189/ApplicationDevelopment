package excelProjectTestbed;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReader1 {
    public static final String SAMPLE_XLSX_FILE_PATH = "sample-xlsx-file.xlsx";

    
    public static void main(String[] args) throws IOException, InvalidFormatException {
    	
        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

        /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */

        // 1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
            int noOfRows = sheet.getLastRowNum();
            System.out.println("Number of Rows are " + "" + noOfRows);
            }



        /*
           ==================================================================
           Iterating over all the rows and columns in a Sheet (Multiple ways)
           ==================================================================
        */
        
        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        int noOfColumns=0;
        
        while (rowIterator.hasNext()) {
            Row row =(Row) rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                         
            }
            System.out.println();

            noOfColumns=row.getLastCellNum();
            //System.out.println("Number of Columns are ******* " + "" + noOfColumns);
        }
        
        int noOfRows = sheet.getLastRowNum();
        System.out.println("Number of Rows are " + "" + noOfRows);
        System.out.println("Number of Columns are " + "" + noOfColumns);
        
        
        
        
                
     // Getting the Sheet at index zero
        Sheet sheet1 = workbook.getSheetAt(1);
        System.out.println("\n\nName of Sheet:"+ sheet1);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter1 = new DataFormatter();

        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator1 = sheet1.rowIterator();
        int noOfColumns1=0;
        
        while (rowIterator1.hasNext()) {
            Row row =(Row) rowIterator1.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter1.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                         
            }
            System.out.println();

            noOfColumns1=row.getLastCellNum();
            //System.out.println("Number of Columns are ******* " + "" + noOfColumns);
        }
        
        int noOfRows1 = sheet1.getLastRowNum();
        System.out.println("Number of Rows are " + "" + noOfRows1);
        System.out.println("Number of Columns are " + "" + noOfColumns1);
        
        
        
        
        
     // Getting the Sheet at index zero
        Sheet sheet11 = workbook.getSheetAt(2);
        System.out.println("\n\nName of Sheet:"+ sheet11);
        
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter11 = new DataFormatter();

        // You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator11 = sheet11.rowIterator();
        int noOfColumns11=0;
        
        while (rowIterator11.hasNext()) {
            Row row =(Row) rowIterator11.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter11.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                         
            }
            System.out.println();

            noOfColumns11=row.getLastCellNum();
            //System.out.println("Number of Columns are ******* " + "" + noOfColumns);
        }
        
        int noOfRows11 = sheet11.getLastRowNum();
        System.out.println("Number of Rows are " + "" + noOfRows11);
        System.out.println("Number of Columns are " + "" + noOfColumns11);
        // Closing the workbook
        workbook.close();
    }
}