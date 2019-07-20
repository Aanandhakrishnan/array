package array;

import java.util.Scanner;

public class charArray {
	char[] charactor = new char[5];
	char temp;
	Scanner sc = new Scanner(System.in);

	public void getInput() {
		for (char i = 0; i < 5; i++) {
			System.out.println("Enter a Charector :");

			charactor[i] = sc.next().charAt(0);

		}
	}

	public void ascending() {
		for (char i = 0; i < 5; i++) {
			 for (int j = i + 1; j < 5; j++) {
				if (charactor[i] > charactor[j]) {
					temp = charactor[i];
					charactor[i] = charactor[j];
					charactor[j] = temp;
				}
			}
			System.out.println(charactor[i]);

		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charArray ca = new charArray();
		ca.getInput();
		ca.ascending();

	}

}
