package com.yedam.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileExe2 {
	
	public static void main(String[] args) {

		try {
			Reader reader = new FileReader("c:/temp/student.txt");
			BufferedReader breader = new BufferedReader(reader);
			Writer writer = new FileWriter("c:/temp/student2.txt");
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			while (true) {
			
				String line = breader.readLine();
				if (line != null) {
					String[] strAry = line.split(" ");
					System.out.printf("이름: %s, 영어: %s, 수학: %s\n",
							strAry[0], strAry[1], strAry[2]);
				} else {
					break;
				}
			}
			
			breader.close();
			reader.close();
			bwriter.close();
			writer.close();
			
			System.out.println("eop");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
