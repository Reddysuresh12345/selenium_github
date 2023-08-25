package GanricUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	public Object[][] readingMultipleData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		{
			File file=new File("./src/test/resources/data.xlsx");
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data=new Object[rowCount][cellCount];
			for(int row=0;row<rowCount;row++)
			{
				Row getRow=sheet.getRow(row);

				for(int cell=0;cell<getRow.getPhysicalNumberOfCells();cell++) {
					data[row][cell]=getRow.getCell(cell).toString();
				}
			}

		}

		return null;
	}
}


