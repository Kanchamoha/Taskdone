package org.pro;

public class Company {
public static void main(String[] args) {
	int []ar = new int[5];
	ar[0]=20;
	ar[1]=10;
	ar[2]=50;
	ar[3]=30;
	ar[4]=40;
	for (int i = 0; i < ar.length; i++) {
		for (int j = i+1; j < ar.length; j++) {
			if(ar[i]<ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				
			}
		}
	}
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	}
}
