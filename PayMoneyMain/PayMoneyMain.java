package PayMoneyMain;

import java.util.Scanner;

import PayMoney.PayMoney;

public class PayMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of transaction array:");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] transactions = new int[size];

		System.out.println("Enter the target to achieve:");
		int target = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter" + i + 1 + "element");
			transactions[i] = sc.nextInt();
		}

		PayMoney paymoney = new PayMoney();
		int no_of_days = paymoney.no_of_days(transactions, target);
		
		if (no_of_days == -1)
			System.out.println("Target is not achieved");
		else
			System.out.println("Target is achievable in:" + no_of_days);
		
		sc.close();
	}
}