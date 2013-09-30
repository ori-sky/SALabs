package com.shockk.SALabs.unit1;

public class FarmerTest
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println(" ________ ");
			System.out.println("|        |");
			System.out.println("| Farmer |");
			System.out.println("|________|");
			
			FarmerGame game = new FarmerGame();
			game.run();
			
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}