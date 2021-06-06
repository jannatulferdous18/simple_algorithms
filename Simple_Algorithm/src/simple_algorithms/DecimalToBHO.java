package simple_algorithms;

public class DecimalToBHO {

	private static void toBinary(int decimal) {
		int[] binary_array = new int[100];
		int index = 0;
		int count = 0;
		while (decimal > 0) {
			binary_array[index++] = decimal % 2;
			decimal = decimal / 2;
			count++;
		}
		System.out.print("Binary of 28 is: ");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(binary_array[i] + " ");
		}
	}

	private static void toOctal(int decimal) {
		int[] octal_array = new int[100];
		int index = 0;
		int count = 0;
		while (decimal > 0) {
			octal_array[index++] = decimal % 8;
			decimal = decimal / 8;
			count++;
		}
		System.out.print("\nOctal of 28 is: ");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(octal_array[i]);
		}
	}

	private static void toHexaDecimal(int decimal) {
		char[] hex_array = new char[100];
		int index = 0;
		int count = 0;
		while (decimal > 0) {
			int remainder = decimal % 16;
			if (remainder < 10) {
				hex_array[index++] = (char) (remainder + 48);
			} else {
				hex_array[index++] = (char) (remainder + 55);
			}
			decimal = decimal / 16;
			count++;
		}
		System.out.print("\nHexadecimal of 28 is: ");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(hex_array[i]);
		}
	}

	public static void main(String[] args) {
		int decimal = 28;
		toBinary(decimal);
		toOctal(decimal);
		toHexaDecimal(decimal);
	}

}
