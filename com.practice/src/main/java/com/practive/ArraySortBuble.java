package com.practive;

public class ArraySortBuble {
	
	public static void main(String[] args) {
		
		int [] sortInput = {10,99,1,4,5,5,7,9};
		
		
		//Compare the adjacent element to check which one is greater    
        for (int num : sortInput) {
            System.out.println(num);
        }
		for (int i = 0; i < sortInput.length-1; i++) {
			for (int j = 0; j < sortInput.length-i-1; j++) {
				if(sortInput[j]>sortInput[j+1]) {
					//If the greater element is present in left send it right
					int temp = sortInput[j];
					sortInput[j]=sortInput[j+1];
					sortInput[j+1]= temp;
						
				} 
				
			}
			
		}
		   // Print sorted array
        for (int num : sortInput) {
            System.out.println(num);
        }
		
		
	
		
		
	}

}
