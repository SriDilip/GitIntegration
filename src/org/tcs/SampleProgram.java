package org.tcs;

public class SampleProgram {
	
	public void add(int a) {
		System.out.println(a);

	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		SampleProgram s = new SampleProgram();
		s.add(5);
		s.add(5, 10);
		s.add(10,10,10);
		
	}

}
