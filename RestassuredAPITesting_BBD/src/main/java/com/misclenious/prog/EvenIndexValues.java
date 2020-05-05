package com.misclenious.prog;

public class EvenIndexValues 
{
	
	public static void main(String[] args) 
	{
		int arr[] = {10,12,13,14,15,16,17,18,19};
		int length =arr.length;
		
		for(int i=0; i<=length-1; i++) {
			//System.out.println(arr[i]+" ");
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" ");
			}
			
		}
	
	}
}
