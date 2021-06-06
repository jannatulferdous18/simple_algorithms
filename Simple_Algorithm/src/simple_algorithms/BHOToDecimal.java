package simple_algorithms;

public class BHOToDecimal {

	public static void binaryToDecimal(int binary_value) {
		int temp = binary_value;
		int remainder;
		int base = 1;
		int decimal_value = 0;
		while (temp > 0) {
			remainder = temp % 10;
			temp = temp / 10;
			decimal_value += (base * remainder);
			base = base * 2;
		}
		System.out.println("Decimal of " + binary_value + " is: " + decimal_value);
	}

	public static void octalToDecimal(int octal_value) {
		int temp = octal_value;
		int remainder;
		int base = 1;
		int decimal_value = 0;
		while (temp > 0) {
			remainder = temp % 10;
			temp = temp / 10;
			decimal_value += (base * remainder);
			base = base * 8;
		}
		System.out.println("Decimal of " + octal_value + " is: " + decimal_value);
	}

	public static void hexToDecimal(String hex_value) {
		int base = 1;
		int decimal_value = 0;
		for (int i = hex_value.length() - 1; i >= 0; i--) {
			if (hex_value.charAt(i) >= '0' && hex_value.charAt(i) <= '9') {
				decimal_value += (hex_value.charAt(i) - 48) * base;

			} else if (hex_value.charAt(i) >= 'A' && hex_value.charAt(i) <= 'F') {
				decimal_value += (hex_value.charAt(i) - 55) * base;
			}
			base = base * 16;
		}
		System.out.println("Decimal of " + hex_value + " is: " + decimal_value);
	}

	public static void main(String[] args) {
		binaryToDecimal(1010);
		hexToDecimal("1A");
		octalToDecimal(1907);
	}

}
