package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 454;
		int temp = num;
		int i = 0;
		while (num != 0) {
			int rem = num % 10;
			i = i * 10 + rem;
			num = num / 10;
		}
		System.out.println("The Reversed Number is " + i);
		if (temp == i)
			System.out.println(temp + " is a Palindrome");
		else
			System.out.println(temp + " is not a Palindrome");
	}
}
