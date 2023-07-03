package Target.in;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of transactional days:");

		int nod = sc.nextInt();

		int[] earnings = new int[nod];

		System.out.println("Enter the transaction for " + nod + " Days");

		for (int i = 0; i < earnings.length; i++) {
			earnings[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(earnings));

		System.out.println("Enter the number of Targets:");

		int targets = sc.nextInt();

		Target tc = new Target();

		tc.targetCheck(earnings, targets);
		sc.close();

	}

}
