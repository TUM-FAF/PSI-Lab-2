import static org.junit.Assert.*;

import org.junit.Test;

import features.Create_File;
import features.MyClass;


public class test_2 {

	@Test
	public void test() {
		Create_File tester2 = new Create_File();
		    assertEquals("Result", "File Exists", tester2.FileOpen("D:/a/1.txt"));
	}

}
