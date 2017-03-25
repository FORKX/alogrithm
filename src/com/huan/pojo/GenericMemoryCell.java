package com.huan.pojo;

public class GenericMemoryCell <AnyType>{
	
	public AnyType read(){
		return storedValue;
	}
	
	public void  write(AnyType value){
		storedValue = value;
	}
	
	private AnyType storedValue;
}
