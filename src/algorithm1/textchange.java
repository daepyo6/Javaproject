package algorithm1;

import java.util.Scanner;

public class textchange {
	
	private static final int lowera = 97;
	private static final int lowerz = 122;
	private static final int upperA = 65;
	private static final int upperZ = 90;
	
	public static void main(String[] args){
		int SIZE;
		@SuppressWarnings("resource") // what is this?
		Scanner scan = new Scanner (System.in);
		SIZE = scan.nextInt();
		char array[] = new char[SIZE];
		
		for(int i = 0; i<SIZE; ++i){
			double selectLowUp = Math.random();
			double lowerValue = Math.random();
			double upperValue = Math.random();
			int lowUp = (int)(selectLowUp * 2);
			if (lowUp == 0){
				int lower = (int)(lowerValue * 26) + 97;
				array[i] = (char)lower;
			}else if(lowUp == 1){
				int upper = (int)(upperValue * 26) + 65;
				array[i] = (char)upper;
			}
			System.out.print(array[i]);
			
			int temp=array[i];
			if(temp>=upperA && temp<=upperZ){
				temp = temp+32;
			}else if(temp>=lowera && temp<=lowerz){
				temp = temp-32;
			}
			array[i] = (char)temp; 
		}
		System.out.println();
		for(int i = 0; i<SIZE; ++i){
			System.out.print(array[i]);
		}
	}
}
