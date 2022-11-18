package example;

//Java Program to illustrate reading from FileReader 
//using BufferedReader 
import java.io.*;
import java.util.*; 
public class ReadFromFile2 
{ 
public static void main(String[] args)throws Exception 
{ 
// We need to provide file path as the parameter: 
// double backquote is to avoid compiler interpret words 
// like \test as \t (ie. as a escape sequence) 
File file = new File("C:\\Users\\jajit\\PycharmProjects\\pythonProjectex\\file.txt"); 

Scanner sc  = new Scanner(file);


//BufferedReader br = new BufferedReader(new FileReader(file)); 

//String st;
//int i;
//while (sc.hasNextLine()) 
// System.out.println(sc.nextLine()); 
} 
} 