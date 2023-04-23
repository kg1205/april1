package iostreams;

import java.io.FileInputStream;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class readexcel {
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("D:\\library\\eclipse\\workspace\\seleniumautomation\\src\\TestNg\\read1.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("sheet1");
	  System.out.println(s.getCell(0,0).getContents());
	  System.out.println(s.getCell(0,1).getContents());
  }
}
