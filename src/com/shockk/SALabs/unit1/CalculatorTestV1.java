package com.shockk.SALabs.unit1;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTestV1
{
	protected static List<IOperation> operations = new ArrayList<IOperation>();
	
	public static void main(String[] args)
	{
		operations.add(new AddOperation());
		operations.add(new SubtractOperation());
		operations.add(new MultiplyOperation());
		operations.add(new IntDivideOperation());
		operations.add(new FloatDivideOperation());
		
		boolean running = true;
		
		while(running)
		{
			System.out.println();
			System.out.println("0: quit");
			
			for(int i=0; i<operations.size(); ++i)
			{
				System.out.println((i + 1) + ": " + operations.get(i).toString());
			}
			
			Integer c = Input.get_int("Option: ");
			if(c == null) continue;
			
			switch(c)
			{
			case 0:
				running = false;
				break;
			default:
				int op = c - 1;
				if(op < 0 || op >= operations.size()) break;
				
				try
				{
					System.out.println("Result: " + operations.get(op).operate());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			}
		}
	}
}