package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, cal = 0, rem = 0, m = 0, i, quo = 0;
		int original = num;
		while (num > 0) {
			quo = num / 10;
			rem = num % 10;
			i = rem;
			if (i >= 0) {
				rem = i * i * i;
				cal = rem;
				num = quo;
				m = m + cal;
				if (m == original)
					System.out.println(original + " is an Armstrong Number");
			}
		}
	}
}
