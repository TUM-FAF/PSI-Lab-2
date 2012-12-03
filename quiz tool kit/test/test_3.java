import static org.junit.Assert.*;

import org.junit.Test;

import features.Create_File;
import features.Text_Editor;


public class test_3 {

	@Test
	public void test() {
		Text_Editor tester3 = new Text_Editor("Untitled-Notepad");
	    assertEquals("Result", "Text Editor Open", tester3.OpenTextEditor());
	}

}
