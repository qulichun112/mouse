import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ququ on 2017/3/27.
 */
public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream("D:\\student.xls");
            POIFSFileSystem fs = new POIFSFileSystem(stream);
            HSSFWorkbook book = new HSSFWorkbook(fs);
            HSSFSheet sheet = book.getSheetAt(0);
            HSSFRow row = sheet.getRow(0);
            List<String> list = new ArrayList<String>();
            int colums = row.getPhysicalNumberOfCells();
            for(int i=0;i<colums;i++){
                list.add(row.getCell(i).toString());
            }
            int rows = sheet.getLastRowNum();

        }catch (Exception e){

        }
    }
}
