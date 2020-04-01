package com.interview.workout;

public class Orange extends fruits {
	
	
	public static void main(String arg[]) {
		
		Orange or = new Orange();
		
		or.edibleitems();
		or.sweetfruit="Mango";
		
	}
	
	@Override
	void edibleitems() {
		// TODO Auto-generated method stub
		super.edibleitems();
		System.out.println("Green fruit is also edible");
	}

	@Override
	void nonedible() {
		// TODO Auto-generated method stub
		
	}
	
	
}

