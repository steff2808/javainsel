package de.stefanmeister.javainsel.k17_nebenlaeufige_programmierung;

//Listing 17.1, Seite 955

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class L1701_DateCommand implements Runnable 
{

	@Override
	public void run()
	{
		Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
	}

}
