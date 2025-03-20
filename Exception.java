package com.FebBatchException;

public class Exception {
	public static void main(String[] args) {
		try {
			int [] a = {1,2,3,4};
			System.out.println( a [6]);
			
		}catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Number will be out of box");
		}
								
		
	}

}
