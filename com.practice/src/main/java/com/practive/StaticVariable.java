package com.practive;

public class StaticVariable {
	
	static int numberStatic = 10;
   
	
	public static void main(String[] args) {
		System.out.println(numberStatic);
		numberStatic =numberStatic + 20;
		 ValueChange valueChange = new ValueChange();
		
		try {
			valueChange.printvalue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}

class ValueChange{
		
	public void printvalue() {
		
		// value changed because static keyword is instance of class not object instance :::
		System.out.println(StaticVariable.numberStatic);

	}
}
