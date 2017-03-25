package com.huan.introduction;

import com.huan.pojo.GenericMemoryCell;

public class BoxingDemo {
	
	public static void main(String[] args) {
		//java 1.5
		GenericMemoryCell<Integer>  m = new GenericMemoryCell<Integer>();
		
		//java 1.7
		//GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
		m.write(11);
		int val = m.read();
		
		System.out.println(val);
		
	}
}
