package com.huan.introduction;

public class RecursionDemo {

	public static void main(String[] args) {
		printOut(123765);
	}
	
	public static void printOut(int n){
		
		if( n >= 10 ){
			printOut(n/10);
			
		}
		System.out.println(n%10);
	}
}
