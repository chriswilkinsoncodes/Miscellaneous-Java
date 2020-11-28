//based on:
//https://github.com/sangnguyen2803/Java-Object-oriented-Programming/blob/
//main/01_HW_Exercise_Java/src/Homework_Java0101/HW_Exercise02_JavaCore.java

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int dec = Integer.parseInt(scanner.nextLine());
		int[] bin = new int[20];
		int index = 0;
		while (dec > 0) {
			bin[index++] = dec%2;    
			dec = dec/2;
		}
		for (int i = index-1; i >= 0; i = i - 1) {    
			System.out.print(bin[i]);
		}
		System.out.println();
		scanner.close();
		
	}

}