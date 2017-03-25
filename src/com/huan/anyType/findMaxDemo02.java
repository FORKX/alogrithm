package com.huan.anyType;

import java.util.Comparator;

public class findMaxDemo02 {

	public static<AnyType> AnyType findMax( AnyType [] arr, Comparator<? super AnyType > cmp){
		
		int maxIndex = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(cmp.compare(arr[i], arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		
		return arr[maxIndex];
	}
	
	public static void main(String[] args) {
		
		String [] arr = {"ZEBRA", "alligator", "crocodile" };
		System.err.println(findMax(arr, new CaseInsensitiveCompare()));
		
	}
}
