package excelReader;

import java.io.*;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class W12_Day2_SH1 {
	
	 
	        public static void main(String[] args) throws Exception{
	                 
	                FileInputStream file= new FileInputStream(new File("ExcelSheet.xlsx"));
	                  
	                XSSFWorkbook inputWorkbook=new XSSFWorkbook(file);
	                  
	                XSSFSheet worksheet = inputWorkbook.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
	                
	                CellStyle style = inputWorkbook.createCellStyle();
	                style.setFillBackgroundColor(IndexedColors.RED.getIndex());
	                style.setFillPattern(FillPatternType.BIG_SPOTS);
	                
	                



	                
	                Cell cell = null; // declare a Cell object
	                
	                
	                cell = worksheet.getRow(1).getCell(1);   // Access the second cell in second row to update the value
	                cell.setCellValue("Null");
	                
	                cell = worksheet.getRow(1).getCell(2);   // Access the second cell in second row to update the value
	                cell.setCellStyle(style);
	                
	                cell = worksheet.getRow(2).getCell(2);   // Access the second cell in second row to update the value
	                cell.setCellStyle(style);
	                
	                cell = worksheet.getRow(0).getCell(0);   // Access the second cell in second row to update the value
	                cell.setCellStyle(style);
	                
	                file.close(); //Close the InputStream
	                 
	                FileOutputStream output_file =new FileOutputStream(new File("Modified_Output.xlsx"));  //Open FileOutputStream to write updates
	                  
	                inputWorkbook.write(output_file); //write changes
	                inputWorkbook.close();
	                output_file.close();  //close the stream    
	        }

		
	}

