package com.shockk.SALabs.unit1;

public class FarmerTest
{
	public static void main(String[] args)
	{
		System.out.println(" ________ ");
		System.out.println("|        |");
		System.out.println("| Farmer |");
		System.out.println("|________|");
		
		FarmerGame game = new FarmerGame();
		
		for(boolean running=true; running==true;)
		{
			game.print_state();
			game.print_options();
			game.process_input();
		}
	}
}