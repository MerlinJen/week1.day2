package week1.day2;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 1, 5, 4, 3, 8, 10, 2, 6, 9 };
		Arrays.sort(numArr);
		for (int i = 0; i <= numArr.length - 1; i++) {
			if (numArr[i] != (i + 1)) {
				System.out.println("The Missing Number is " + (i + 1));
				break;
			}

		}
	}
}