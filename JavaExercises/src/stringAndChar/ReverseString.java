package stringAndChar;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String in;
		String in2 = "";
		int inLen;
		char ch = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		in = input.next();
		input.close();
		inLen = in.length();
		
		for (int i = (inLen - 1); i >= 0; i--){
			ch = in.charAt(i);			
			in2 += ch;
		}
		System.out.println("The reverse of String " + in + " is " + in2);

	}

}
