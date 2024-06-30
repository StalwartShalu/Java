package src.ReverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("----------Reverse a String----------");
		System.out.println("Original String: ");
		String input = sc.nextLine();
		StringBuilder str = new StringBuilder();
		str.append(input);
		System.out.println("Reverse String: " +str.reverse());	
	
		
	}

}
