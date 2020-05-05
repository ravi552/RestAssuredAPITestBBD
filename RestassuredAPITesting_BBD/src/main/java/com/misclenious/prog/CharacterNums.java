package com.misclenious.prog;

public class CharacterNums {
	
	public static void main(String[] args) {
		String str = "ELEPHANT";
		int len=str.length();
		System.out.println();
		int num=0;
		
		for(int i=0;i<=len-1;i++) {
			//System.out.println(str.charAt(i));
			if(str.charAt(i)=='E') {
				num++;
			}
		}
		System.out.println("The character E "+" present : "+num+" times");
	}	
}
