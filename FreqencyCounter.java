package com.codegnan.Arrays;

public class FreqencyCounter {

	public static void main(String[] args) {
int[] array= {1,2,3,2,1,4,3,5,1};
boolean[] processed=new boolean[array.clone().length];
for(int i=0;i<array.length; i++) {
	if(processed[i]) {
		continue;
	}
	int count=1;

for(int j=i+1; j<array.length;j++) {
	if(array[j]==array[i]) {
		count++;
		processed[j]=true;
		
	}
}
System.out.println(array[i]+ " Occurs "+ count+" times ");
	}
	}
	}
