package com.Algotithm;

public class BubbleShort {

	
	static void bubbluShort(int[] a){
		
		int temp = 0;
		int n = a.length;
		
		for(int i =0; i< n; i++){
			
			for(int j=1; j<n;j++){
				
				if (a[j-1]>a[j]) {
					
					temp = a[j-1];
					a[j-1] = a[j];
					a[j]=temp;
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] array= {12,2,5,2,9,1,6,0};
		
	
		for(int i:array){
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		bubbluShort(array);
		
		for(int i :array){
		
			System.out.print(i+" ");
		}
	    
	
	}
}
