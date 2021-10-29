package com.training.interfaces;

public class ExampleClass implements SampleInterface,SampleInterfaceTwo{

	@Override
	public int size() {
		return 0;
	}
	public ExampleClass(){
		System.out.println(SampleInterface.super.getCount());
		getCount();
	}
	
	public static void main(String[] args) {
		
		ExampleClass example = new ExampleClass();
	}
//	@Override
//	public int getCount() {
//		return SampleInterface.super.getCount();
//	}
	@Override
	public void test() {
	System.out.println("this is test implementation");
		
	}
//	@Override
//	public int getCount() {
//		// TODO Auto-generated method stub
//		return SampleInterface.super.getCount();
//	}
	@Override
	public int getCount() {
	
		return SampleInterfaceTwo.super.getCount();
	}

}
