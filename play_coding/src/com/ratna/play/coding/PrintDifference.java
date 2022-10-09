package com.ratna.play.coding;

public class PrintDifference {
	
	private static int nextId;
	private int id;
	{
		id=nextId;
		nextId++;
	}
	
	public void display() {
		System.out.println("nextid ="+nextId+ ",id ="+id);
	}

	public static void main(String[] args) {
		PrintDifference pd = new PrintDifference();
		pd.display();
		System.out.print(2.0 - 1.1);
		System.out.print(", ");
		System.out.println(2.0f - 1.1f);
		double x = 100.0 / 3.0;
		System.out.println(String.format("%5.2f", x));
		int m= 2;
		{
			int n=3;
		}
//System.out.println("m= "+m+",n="+n);
		
	//	int a[];
		int a[]=new int[50];
		System.out.println(a.length);
		System.out.println(parseint("Hundered"));
	}
	
	public static int parseint(String s) {
		try {
			return Integer.parseInt(s);
		}
		finally {
			return 0;
		}
	}

}
