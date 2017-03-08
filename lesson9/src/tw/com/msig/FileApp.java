package tw.com.msig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileApp {

	public static void main(String[] args) {
		File theFile = new File("c:\\1.txt");
		
		try {
			FileInputStream fis
				= new FileInputStream(theFile);
			int ch;
			while( (ch=fis.read()) != -1){
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
