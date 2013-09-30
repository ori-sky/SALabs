package com.shockk.SALabs.unit1;

public class AddOperation implements IOperation
{
	@Override
	public Object operate()
	{
		Double value = null;
		
		try
		{
			value = Input.get_double("first: ") + Input.get_double("second: ");
		}
		catch(Exception e) {}
		
		return value;
	}
	
	@Override
	public String toString()
	{
		return "add";
	}
}