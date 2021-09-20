package CurrencyDenominationsMain;

import java.util.Scanner;

import CurrencyDenominations.CurrencyDenominations;
import MergeSort.MergeSortImplementation;

public class CurrencyDenominationsMain {

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int Denomination[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the currency denomination's value:");
			Denomination[i]=sc.nextInt();
		}
			//System.out.println("Enter the amount you want to pay:");
			//int amount=sc.nextInt();
			MergeSortImplementation mergesortimplementation=new MergeSortImplementation();
			mergesortimplementation.sort(Denomination, 0, Denomination.length-1);
			System.out.println("Enter the amount you want to pay:");
			int amount=sc.nextInt();
			//int[] no_of_notes=new int[Denomination.length];
			CurrencyDenominations currencydenominations=new CurrencyDenominations();
			int[] notes= new int[size];
			currencydenominations.notesCountImplementation(notes,amount);
			sc.close();
			}
	}