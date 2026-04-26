package com.java.arrayprograms;
//sorting array in ascending order a[i]<a[j]
//sorting array in descending order a[i]>a[j]
public class array_sorting {
	public static void main(String[] args) {
		int a[]= {10,4,2,7,9,3};
		int temp;
		for(int i=0; i<a.length;i++) { //One loop controls the number of passes.
			for(int j=0; j<a.length-1;j++) { //The inner loop compares elements and swaps them if needed
				if(a[i]<a[j]) {				//a.length-1 is used so we don't go outside the array index.
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nLargest element: "+ a[a.length-1]);
		System.out.println("Second Largest element: "+ a[a.length-2]);
		System.out.println("Smallest element: "+ a[0]);
		System.out.println("Second Smallest element: "+ a[1]);
	}
}
