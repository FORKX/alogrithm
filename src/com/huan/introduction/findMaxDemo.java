package com.huan.introduction;

public class findMaxDemo {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Comparable  findMax( Comparable [] arr ){
		
		int maxIndex = 0;
		
		for( int i = 1; i < arr.length; i++){
			if( arr[i].compareTo( arr[maxIndex] ) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	
	public static void main(String[] args) {
		String [] st1 = {"jote", "Bob", "Bill", "Zeke"};
		String [] st2 = {"ZEBRA", "alligator", "crocodile"};
		System.out.println(findMax(st1));
		System.out.println(findMax(st2));
	}
	
	
}
