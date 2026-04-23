package de.stefanmeister.javainsel.k17_nebenlaeufige_programmierung;

import java.time.LocalDateTime;
import java.util.stream.Stream;


//Listing 17.4, Seite 959

public class L1704_DateThread extends Thread
{
	L1704_DateThread() 
	{
		start();
	}

	@Override 
	public void run() 
	{
	    Stream.generate( LocalDateTime::now ).limit( 20 ).forEach( System.out::println );
    }
	
	public static void main(String args[])
	{
		new L1704_DateThread();
	}
}
