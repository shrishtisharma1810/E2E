package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellBase;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;



public class ReadWriteFromExcel {
	@Test
	public void ReadData() throws IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\ngsha\\Downloads\\SampleSheetForRW.xlsx");
	XSSFWorkbook ExcelFile=new XSSFWorkbook(file);
    XSSFSheet Sheet1=ExcelFile.getSheet("Sheet1");
    System.out.println(Sheet1.getRow(1).getCell(0).getStringCellValue());
    System.out.println(Sheet1.getRow(1).getCell(1).getStringCellValue());
    System.out.println(Sheet1.getRow(1).getCell(2).getStringCellValue());
    System.out.println(Sheet1.getRow(1).getCell(3).getStringCellValue());
    
    XSSFRow Sheet1Row=Sheet1.createRow(33);
    XSSFCell Sheet1Cell=Sheet1Row.createCell(0);
    Sheet1Cell.setCellValue("Sr. No");
    XSSFCell Sheet1Cell1=Sheet1Row.createCell(1);
    Sheet1Cell1.setCellValue("Name");
    
    for(int i=34;i<50;i++)
    {
    	XSSFRow Sheet1RowNew=Sheet1.createRow(i);
        XSSFCell Sheet1CellNew=Sheet1RowNew.createCell(0);
        Sheet1CellNew.setCellValue(i);
       
    }
    
    //XSSFRow Sheet1Row=Sheet1.createRow(50);
    //XSSFCell Sheet1Cell=Sheet1Row.createCell(3);
    //Sheet1Cell.setCellValue("Mobile Number");
    
    FileOutputStream file1= new FileOutputStream("C:\\Users\\ngsha\\Downloads\\SampleSheetForRW.xlsx");
    ExcelFile.write(file1);
    file1.close();
    
    System.out.println("Table2");
    System.out.println(Sheet1.getRow(2).getCell(5).getStringCellValue());
    System.out.println(Sheet1.getRow(2).getCell(6).getStringCellValue());
    System.out.println(Sheet1.getRow(2).getCell(7).getStringCellValue());
    System.out.println(Sheet1.getRow(2).getCell(9).getStringCellValue());
    
    XSSFSheet Sheet3=ExcelFile.getSheet("Sheet3");
    System.out.println(Sheet3.getRow(0).getCell(0).getStringCellValue());
    System.out.println(Sheet3.getRow(0).getCell(1).getStringCellValue());
    for(int i=1;i<23;i++)
    {
    	for(int j=0;j<2;j++)
    	{
    		System.out.println(Sheet3.getRow(i).getCell(j).getNumericCellValue());
    	}
    }
	}

	
}
