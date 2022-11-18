package logicalprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortTextFile {

	public static void main(String[] args) throws Throwable {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jajit\\Downloads\\SortTextFile.txt"));
		
		ArrayList<String> list = new ArrayList<String>();
		
		String currentLine = br.readLine();
		
		while( currentLine != null )
		{
			list.add(currentLine); 
			
			currentLine = br.readLine();
		}

		System.out.println(list);	
		
		Collections.sort(list);
		
		Set<String> set = new HashSet<String>();
		
		for(String name : list)
		{
			set.add(name);
		}
		
		System.out.println(set);
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jajit\\Downloads\\SortTextFile.txt"));
		
		for(String str : list)
		{
			writer.write(str); 
			
			writer.newLine();
		}
		
		System.out.println(list);
	}

}
