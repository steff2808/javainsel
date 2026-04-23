package de.stefanmeister.javainsel.k17_nebenlaeufige_programmierung;

//Listing 17.3, Seite 956

public class L1703_FirstThread
{

	public static void main(String[] args)
	{
		Thread t1 = new Thread(new L1701_DateCommand());
		t1.start();
		Thread t2 = new Thread(new L1702_CounterCommand());
		t2.start();

	}

}
