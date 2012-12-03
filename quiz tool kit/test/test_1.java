import static org.junit.Assert.*;

import org.junit.Test;

import features.TextToPDF;


public class test_1 {

	@Test
	public void test() {
		TextToPDF tester = new TextToPDF();
	    assertEquals("Result", "File created in pdf", tester.FunctionTextToPDF("Text"));
	}

}
