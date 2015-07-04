package CT874_Assignment_7;

import java.util.Scanner;


/**
 * To compare the strings for equality
 *
  */
class StringComapre{

    /**
     * Returns true if both the strings are equal other wise false
     *
     * @param s1,s2  The Strings to be compared.
     */
	public static boolean compareString(String s1,String s2){
		if(s1.equals(s2)){
			return true;
		}
		return false;
	}
}
public class StringCompareTest {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String s1,s2;
	boolean b;
	//Read the strings from user
	System.out.println("Please enter first string ");
	s1 = s.next();
	System.out.println("Please enter second string ");
	s2 = s.next();
	// call the method to check the equality
	b = StringComapre.compareString(s1,s2);
	if(b)
	System.out.println("Strings "+s1 +" & "+s2 +" are equal");
	else
		System.out.println("Strings "+s1 +" & "+s2 +" are not equal");
	s.close();
	}
	

}
