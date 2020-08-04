package selinium.Screenshot;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class readDataXmlFile {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("‪‪‪‪C:\\Users\\Admin\\Desktop\\excelFileSelinium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 org.apache.poi.ss.usermodel.Sheet sh = w.getSheet("sheet1");
		 Row firstRow = sh.getRow(0);
		 int rowCount = ((org.apache.poi.ss.usermodel.Sheet) sh).getPhysicalNumberOfRows();
		 for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
				org.apache.poi.ss.usermodel.Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl);
			}
		}

	}

}
