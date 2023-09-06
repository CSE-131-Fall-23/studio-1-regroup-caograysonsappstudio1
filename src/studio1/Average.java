package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("The first of two integers to be averaged?");
		int s0 = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int s1 = in.nextInt();
		double average = (s0 + s1)/2;
		System.out.println(average);
	}

}
