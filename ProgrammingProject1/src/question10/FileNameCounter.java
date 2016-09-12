package question10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileNameCounter {

	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Asking for file name
		System.out.println("Please enter a file name: ");
		String fileName = keyboard.nextLine();
		
		//To read file and set up a counter
		int counter = 0;
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		try 
		{
		    while ((line = reader.readLine()) != null) 
		    {
		    	StringTokenizer words = new StringTokenizer(line); 
		    	while(words.hasMoreTokens()) 
		    	{ 
		    		//Counting the words
		    		counter++;
		    		words.nextToken(); 
		    	}    
		    }
		    System.out.println(counter);
		} 
		catch(FileNotFoundException e)  
		{} 
		finally 
		{
		    reader.close();
		}
		//Getting this to work was a nightmare
	}

}
