package com.anonymous;

public class Anon {
	
	public static void main(String[] args) {
		
		Inherit i = new Inherit() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("The inherited text");
				
			}
			
		};
		
		i.test();
	}

}
