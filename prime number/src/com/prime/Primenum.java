package com.prime;

import java.util.Scanner;

public class Primenum {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int i;
		for ( i = 2; i < a; i++) {
			if (a % i == 0)
				break;
		}
		if (a == i)
			System.out.println("this is a prime number");

		else
			System.out.println("this is not a prime number");

	}

}
