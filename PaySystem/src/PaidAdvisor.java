import java.util.Scanner;

public class PaidAdvisor extends person {

	public static void main(String[] args) {
		double regularPayRate = 25;
		double overtimePayRate = 37.5;
		double specialPayRate = 50.0;
		int hoursWorked = 0;
		int hoursSpecial = 0;
		double pay = 0;

		pay = calculatePay(regularPayRate, overtimePayRate, specialPayRate, hoursWorked, hoursSpecial);
		System.out.println("pay = " + pay);
	}

	public String toString() {
		return "pay";
	}

	static int calculatePay(double regularPayRate, double overtimePayRate, double specialPayRate, int hoursWorked,
			int specialHours) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the hours worked");
		int a = in.nextInt();
		System.out.println("How many hours have you worked for a special reason?");
		int b = in.nextInt();

		int regularHoursTotal = (a - b);
		int x = (int) (regularPayRate * a);
		int y = (int) ((int) (regularPayRate * 30) + (overtimePayRate * (regularHoursTotal - 30)));
		int z = (int) ((int) (regularPayRate * 30)
				+ (overtimePayRate * (regularHoursTotal - 30) + (specialPayRate * b)));

		if (a < 30)
			return x;
		if (a >= 30 && b == 0)
			return y;
		if (b >= 0)
			return z;
		return 0;
	}

	static int getPatRate(double regularPayRate) {
		return (int) regularPayRate;
	}

	static int getHoursWorked(int hoursWorked) {
		return hoursWorked;
	}

	static int setNameRateHours(String firstName, String lastName) {
		return 0;
	}
}