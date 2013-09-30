package com.shockk.SALabs.unit1;

public class IntDivideOperation implements IOperation
{
	@Override
	public Object operate()
	{
		Integer value = null;
		
		try
		{
			value = Input.get_int("first: ") / Input.get_int("second: ");
		}
		catch(Exception e) {}
		
		return value;
	}
	
	@Override
	public String toString()
	{
		return "integer division";
	}
}