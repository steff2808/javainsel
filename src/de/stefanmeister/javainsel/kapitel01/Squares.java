package de.stefanmeister.javainsel.kapitel01;

// Listing 1.1, Seite 83

public class Squares 
{
	static int quadrat(int n)
	{
		return n * n;
	}

	static void ausgabe(int n)
	{
		for(int i = 1; i <= n; i = i + 1) 
		{
			String s = "Quadrat(" + i + ") = " + quadrat(i);
			System.out.println(s);
		}
	}


	public static void main(String[] args) 
	{
		ausgabe(30);
	}

}
