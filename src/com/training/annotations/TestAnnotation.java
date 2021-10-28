package com.training.annotations;

import java.lang.reflect.Method;

public class TestAnnotation {

	

	public TestAnnotation() {
		
	}
	//override is a compile time annoatiion
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@TrainingAnno(id = 200, name = "chockalingam")
	public void setUp() {
		
	}
public static void main(String[] args) {

		try {
			Class classObj = Class.forName("com.training.annotations.TestAnnotation");
			Method[] declaredMethodsArray = classObj.getDeclaredMethods();
			for (Method method : declaredMethodsArray) {
				System.out.println(method);
				if(method.getName().indexOf("setUp")!=-1) {
					TrainingAnno annotation = method.getAnnotation(TrainingAnno.class);
					System.out.println(annotation.id());
					System.out.println(annotation.name());
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
