package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int len = arr.length;
		System.out.println("The length of the array is " + len);
		for (int i = 0; i < arr.length; i++) {
			for (int n = i + 1; n < arr.length; n++) {
				if (arr[i] == arr[n])
					System.out.println("The Duplicate Numbers are " + arr[i]);
			}
		}
	}
}
