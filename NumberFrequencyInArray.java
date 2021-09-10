package week1.day2;

public class NumberFrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int[] fr = new int[arr.length];
		int vis = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = vis;
				}
			}
			if (fr[i] != vis)
				fr[i] = count;
		}
		System.out.println("The frequency of the numbers in the array are:");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != vis)
				System.out.println(+arr[i] + " occured " + fr[i] + " times");
		}
	}
}
