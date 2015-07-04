package CT874_Assignment_7;

import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * An application that reads in a sentence from the user and outputs the sentence in upper and lowercase. 
 */
public class SentenceTokenizer {

	public static void main(String[] args) {
		StringTokenizer st;
		String s;int uppercase=0,lowercase=0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter a sentence ");
		s = s1.nextLine();
		System.out.println("Convert Result:");
		// toUpperCase and toLowercase are the methods available in String class
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		for (int k=0;k<s.length();k++)
		{
		if(Character.isUpperCase(s.charAt(k))) uppercase++;
		if((Character.isLowerCase(s.charAt(k)))) lowercase++;
		}
		System.out.println("Number of uppercase is"+uppercase);
		System.out.println("Number of lowercase is"+lowercase);
		// Instantiate StringTokenizer and split the Sentence with Space delimiter
		st = new StringTokenizer(s, " ");
		// Print all the tokens
		
		while (st.hasMoreTokens())
		{
			String sk=st.nextToken();
		//sk.replaceAll("[\\-\\+\\.\\^:,\"]","\\\"");
		sk.replace("\"","\\\"");
		
		System.out.println(sk);
	}
		String sss = "Caitlyn";
		System.out.println(sss.replace("\"","\\\""));
		
		s1.close();
	}

}
