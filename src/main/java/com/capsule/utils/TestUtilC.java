package com.capsule.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.capsule.base.TestBaseC;

public class TestUtilC extends TestBaseC {

	public static long Page_Load_Time = 30;
	public static long Implicity_Time = 10;
	
	
	

	 public static String Test_Sheet_Path="C:\\Users\\Admin\\eclipse-workspace\\CapsuleTestAutomation\\src\\main\\java\\com\\capsule\\testdata\\TestData.xlsx";
		
	 static Workbook book;
		static Sheet sheet;
		
	   public static Object[][] GetTestData(String sheetName) throws IOException{
		   
		   FileInputStream file=null;
		   
		   try {
			file=new FileInputStream(Test_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		   try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
  		   sheet=book.getSheet(sheetName);
		   
  		   Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		   
		   for(int i=0;i<sheet.getLastRowNum();i++) //0
		   {
			   for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			   {
				   data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			   }
		   }
		   
		   return data;
}
		
	   public  void takeScreenshotAtEndOfTest(String methodname )
	   {
		  File fls= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try {
			FileUtils.copyFile(fls, new File("C:\\Users\\Admin\\eclipse-workspace\\CapsuleTestAutomation\\ScreenShots"+methodname+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	   }
	
}
