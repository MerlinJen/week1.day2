package week1.day2;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = { 3, 2, 11, 4, 6, 7 }, numArr2 = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i <= numArr1.length - 1; i++) {
			for (int n = 0; n <= numArr2.length - 1; n++) {
				if (numArr1[i] == numArr2[n])
					System.out.println("The intersected number is " + numArr1[i]);

			}
		}

	}
}