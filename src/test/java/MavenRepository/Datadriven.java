package MavenRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
    private static final String NumberToTextConvert = null;

	public ArrayList<String> getdata(String TestCasename) throws IOException {
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C://Users//amanpreet kaur//Desktop//excelvalue1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheet=workbook.getNumberOfSheets();
		for(int i=0;i<sheet;i++)
		{
		    if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
		    {
		    XSSFSheet sheet1=workbook.getSheetAt(i);
		    Iterator<Row> rows=sheet1.iterator();
		    Row firstrow=rows.next();
		    Iterator<Cell> ce=firstrow.cellIterator();
		    int k=0;
		    int column=0;
		    while(ce.hasNext())
		    {
		    Cell value=ce.next();
		         if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
		         {
		         column=k;	
		         }
		    k++;
		    }
		    System.out.println(column);
		    while(rows.hasNext())
		    {
		    	Row r=rows.next();
		    	if(r.getCell(column).getStringCellValue().equalsIgnoreCase(TestCasename))
		    	{
		    		Iterator<Cell> cellvalue=r.cellIterator();
		    		while(cellvalue.hasNext())
		    		{
		    		Cell cellvariable= cellvalue.next();
		    		if(cellvariable.getCellType()==CellType.STRING)
		    		{
		    			a.add(cellvariable.getStringCellValue());
		    		}
		    		else
		    		{
		    		a.add(NumberToTextConverter.toText(cellvariable.getNumericCellValue()));
		    		}
		    		}
		    	}
		    }
		   
	   }
	}
		return a;
	}
}
 