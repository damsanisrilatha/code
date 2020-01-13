package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		
		String filename = "C:/Mimmy/code/src/collection2/ArrayList1.java";
		readAndCountFile(filename);
		
		
	}
	
	public static void readAndCountFile(String filename){
		File f = new File(filename);
		String line;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while((line = br.readLine())!=null){
				System.out.println(line);
				if(line.trim().equals("public static void main(String[] args) {")){
					System.out.println("##########MAIN FUNCTION FOUND######################");
				}
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
