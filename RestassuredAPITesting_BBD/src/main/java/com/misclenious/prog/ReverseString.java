package com.misclenious.prog;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "ELEPHANT";
		int len=str.length();
		
		for(int i=0;i<=len-1;i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}
	}
}
