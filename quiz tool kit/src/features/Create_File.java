package features;

import java.io.*;
 
public class Create_File
{
	
	public String FileOpen(String file) {
		File f1=new File(file);
       // File f2=new File("D:/a/2.txt");
 
       // String s;
 
        if(f1.exists())
        {

        	 return("File Exists");	
        }
            
            else
            {
                return("Not a File");
            }
        }
		
		
	//}
    public static void main(String []args)
    {
       
    	
    }
}