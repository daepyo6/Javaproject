package algorithm2;

import java.util.Scanner;

public class textcheck {
	
	private static final int Alphabat = 26;

	public static void main(String[] args){
		int SIZE;
		int count = 0;
		int lowAlphabat[] = new int[Alphabat];
		int upAlphabat[] = new int[Alphabat];
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
			
			if((array[i] >= 'A')&&(array[i]<='Z')){
				int j = array[i] - 'A';
				upAlphabat[j]++;
			}else if((array[i] >= 'a')&&(array[i]<='z')){
				int j = array[i] - 'a';
				lowAlphabat[j]++;
			}
		}
		System.out.println("");
		for(int i = 0 ; i < Alphabat; ++i){
			if(upAlphabat[i]!=0 && upAlphabat[i] > 0 ){
				count++;
			}
			if(lowAlphabat[i]!=0 && lowAlphabat[i] > 0 ){
				count++;
			}
		}
		System.out.println(count);
		
		for(int i = 0 ; i < Alphabat; ++i){
			if(upAlphabat[i]!=0){
				System.out.println((char)('A'+i)+" : "+ upAlphabat[i]);
			}
		}
		
		for(int i = 0 ; i < Alphabat; ++i){
			if(lowAlphabat[i]!=0){
				System.out.println((char)('a'+i)+" : "+ lowAlphabat[i]);
			}
		}
	}
}
