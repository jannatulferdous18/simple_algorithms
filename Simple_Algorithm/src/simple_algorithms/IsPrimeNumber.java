package simple_algorithms;

/*Check whether given number is prime or not*/

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the input: ");
		int input = sc.nextInt();
		int m = input / 2;
		int flag = 0;
		if (input == 0 || input == 1) {
			flag = 1;
		} else {
			for (int i = 2; i <= m; i++) {
				if (input % i == 0) {
					flag = 1;
				}
			}
		}

		if (flag == 0) {
			System.out.println(input + " is a prime number");
		} else {
			System.out.println(input + " is not a prime number");
		}
	}

}
