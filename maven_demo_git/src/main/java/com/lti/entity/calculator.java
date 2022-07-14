package com.lti.entity;

public class calculator {
	
	public int add(int x,int y) {
		int result=x+y;
		return result;
	}
	
	public int sub(int x,int y) {
		int result=x>y?x-y:y-x;
		return result;
	}

}
