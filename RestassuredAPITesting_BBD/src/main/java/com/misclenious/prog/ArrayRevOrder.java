package com.misclenious.prog;

public class ArrayRevOrder {
	
	public static void main(String[] args) {
		int arr[] = {10,12,13,14,15,16,17,18,19};
		int length =arr.length;
		System.out.println("total length of array :->"+length);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}
}
