package com.shockk.SALabs.unit2;

import java.util.ArrayList;
import java.util.List;

import com.shockk.SALabs.common.Input;

public class Marks
{
	public static final int NUM_RESULTS = 6;
	
	protected List<Double> results = new ArrayList<Double>(Marks.NUM_RESULTS);
	
	public static double getAverage(double total)
	{
		return total / Marks.NUM_RESULTS;
	}
	
	public Marks()
	{
		for(int i=0; i<Marks.NUM_RESULTS;)
		{
			try
			{
				Double mark = Input.getDouble("Mark " + (i + 1) + ": ");
				this.results.add(mark);
				
				// i is only incremented if no error occurs
				++i;
			}
			catch(Exception e)
			{
				System.out.println("Invalid mark - please try again.");
			}
		}
	}
	
	public double get(int i)
	{
		return this.results.get(i);
	}
	
	public double getTotal()
	{
		double total = 0.0;
		
		for(int i=0; i<Marks.NUM_RESULTS; ++i)
		{
			total += this.get(i);
		}
		
		return total;
	}
	
	public double getAverage()
	{
		return Marks.getAverage(this.getTotal());
	}
	
	public void outputResults()
	{
		double total = 0.0;
		int fails = 0;
		
		for(int i=0; i<Marks.NUM_RESULTS; ++i)
		{
			total += this.get(i);
			if(this.get(i) < 40) ++fails;
		}
		
		double average = Marks.getAverage(total);
		
		System.out.println("Average: " + average);
		System.out.println("Fails: " + fails);
		
		switch(fails)
		{
			case 0:
				if(average >= 60)
				{
					System.out.println("merit");
					break;
				}
			case 1:
				if(average >= 40)
				{
					System.out.println("pass");
					break;
				}
			default:
				System.out.println("fail");
				break;
		}
	}
}