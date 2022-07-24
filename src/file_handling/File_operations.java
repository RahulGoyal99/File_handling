
package file_handling;

import java.util.*;
import java.io.*;

public class File_operations {

//file creation
	
	void create_file() {
		File C = new File("New_File.txt");
		try {
			if(C.createNewFile()) {
				System.out.println("File created sucessfully: "+C.getName());
				System.out.println("File path: "+C.getAbsolutePath());
			}
			else {
				System.out.println("File Already Exist");
			}
		}
		catch(Exception e) {
			System.out.println("error: "+e);
		}
	}
	
//writing into file
	
	void write_file() {
		try {
			FileWriter W = new FileWriter("New_File.txt") ;
				W.write("This is first line");
				W.close();
				System.out.println("File Write successfull");
		}
		catch(Exception e)
		{
			System.out.println("error: " +e);
		}
		
	}
	
//reading file
	
	void read_file() {
		try {
			File R = new File("New_File.txt");
			Scanner read = new Scanner(R);
				while(read.hasNextLine()) {
					String Line = read.nextLine();
					System.out.println("Content is: "+Line);
				}
				read.close();
		}
		catch(Exception e) {
			System.out.println("error:"+e);
		}
	}
	
//appending file
	
	void append_file() {
		File M = new File("New_file.txt");
		String texttoAppend = "\nThis line is appended";
		//BufferedReader reader = null;
		//FileWriter writer = null;
		try {
			if(!M.exists()) {
				M.createNewFile();
			}
			FileWriter writer = new FileWriter(M.getName(),true);
			BufferedWriter reader = new BufferedWriter(writer);
			reader.write(texttoAppend);
			reader.close();
			System.out.println("File appended");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File_operations obj = new File_operations();
		obj.create_file();
		obj.write_file();
		obj.read_file();
		obj.append_file();
		
	}

}