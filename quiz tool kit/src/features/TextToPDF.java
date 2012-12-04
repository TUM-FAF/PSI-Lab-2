package features;

import static org.junit.Assert.assertEquals;

import java.io.*;
import java.awt.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.*;
import java.util.zip.*;

public class TextToPDF{
	
	public String FunctionTextToPDF(String txt){
		try{
		      InputStreamReader in= new InputStreamReader(System.in);
		      BufferedReader bin= new BufferedReader(in);
		      System.out.println("Enter text:");
		        //String text=bin.readLine();
		        Document document = new Document(PageSize.A4, 36, 72, 108, 180);
		        PdfWriter.getInstance(document,new FileOutputStream("pdfFile.pdf"));
		        document.open();
		        document.add(new Paragraph(txt));
		        System.out.println("Text is inserted into pdf file");
		        document.close();
		    }catch(Exception e){}
	return("File created in pdf");	
	}
	
	
	
	
	
	
	
 /* public static void main(String arg[]){
    try{
     TextToPDF tester = new TextToPDF();
		    assertEquals("Result", "File created in pdf", tester.FunctionTextToPDF("Text"));
      InputStreamReader in= new InputStreamReader(System.in);
      BufferedReader bin= new BufferedReader(in);
      System.out.println("Enter text:");
        String text=bin.readLine();
        Document document = new Document(PageSize.A4, 36, 72, 108, 180);
        PdfWriter.getInstance(document,new FileOutputStream("pdfFile.pdf"));
        document.open();
        document.add(new Paragraph(text));
        System.out.println("Text is inserted into pdf file");
        document.close();
    }catch(Exception e){}
  }
*/} 