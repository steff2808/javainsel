package de.stefanmeister.javainsel.k17_nebenlaeufige_programmierung;

import java.util.stream.IntStream;

//Listing 17.2, Seite 956

public class L1702_CounterCommand implements Runnable
{
	@Override
	public void run()
	{
		IntStream.range(0, 20).forEach(System.out::println);
	}

}
