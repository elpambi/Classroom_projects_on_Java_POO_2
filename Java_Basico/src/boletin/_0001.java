package boletin;

public class _0001 {
	public static void main(String[] args) {
		int count = 0;

		for (char letter = 'A'; letter <= 'Z'; letter++) {
		  int value = letter - 'A' + 1; // Calculate the numeric value (A=1, B=2, ..., Z=26)
		  
		  if (value % 2 == 0) { // Check if the numeric value is even
		      count++;
		  }
		}

		System.out.println("Number of letters with an even numeric value: " + count);
	}
}
