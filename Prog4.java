package fppassignment;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a text: ");
		String input = sc.nextLine();
		
		for(int i = input.length()-1; i >= 0; --i){
			System.out.print(input.charAt(i));
		}	
	}
}