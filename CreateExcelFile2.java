package excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile2 {

	public static void main(String[] args) throws IOException 
	{
		// Locate path and file of input excel.
		File inputFile=new File("sample-xlsx-file.xlsx");
		FileInputStream file=new FileInputStream(inputFile);
		XSSFWorkbook inputWorkbook=new XSSFWorkbook(file);
		int TotalinputSheet=inputWorkbook.getNumberOfSheets();
		System.out.println("Input sheetCount: "+TotalinputSheet);
		
		// Locate path and file of output excel.
		File outputFile=new File("Copied_File.xlsx");
		FileOutputStream Outputfile=new FileOutputStream(outputFile);
		
		// Creating workbook for output excel file.
		XSSFWorkbook outputWorkbook=new XSSFWorkbook();
		
		// Creating sheets with the same name as appearing in input file.
		for(int n=0;n<TotalinputSheet;n++) 
                { 
                  XSSFSheet inputSheet=inputWorkbook.getSheetAt(n); 
                  String inputSheetName=inputWorkbook.getSheetName(n); 
                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 

                 // Create and call method to copy the sheet and content in new workbook. 
                 copySheet(inputSheet,outputSheet); 
                }

               // Write all the sheets in the new Workbook(testData_Copy.xlsx) using FileOutStream Object
               outputWorkbook.write(Outputfile); 
              // At the end of the Program close the FileOutputStream object. 
               Outputfile.close(); 
               inputWorkbook.close();
               outputWorkbook.close();
         @SuppressWarnings("unused")
		String Vaibhav_P; 
	}

           public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
           { 
              int Totalrows=inputSheet.getLastRowNum(); 
              System.out.println(Totalrows+" rows in inputsheet "+inputSheet.getSheetName()); 
               
                int currentRowIndex=0; if(Totalrows>0)
		{
			Iterator<Row> rowIterator=inputSheet.iterator();
			while(rowIterator.hasNext())
			{
				int currentCellIndex=0;
				Iterator<Cell> cellIterator=rowIterator.next().cellIterator();
				while(cellIterator.hasNext())
				{
				// Creating new Row, Cell and Input value in the newly created sheet. 
					String cellData=cellIterator.next().toString();
					if(currentCellIndex==0)
						outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					else
						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					currentCellIndex++;
				}
				currentRowIndex++;
			}
			System.out.println((currentRowIndex)+" rows added to outputsheet "+outputSheet.getSheetName());
			System.out.println();
		}
	}
}

