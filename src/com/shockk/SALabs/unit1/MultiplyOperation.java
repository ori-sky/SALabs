package com.shockk.SALabs.unit1;

import com.shockk.SALabs.common.Input;

public class MultiplyOperation implements IOperation
{
	@Override
	public Object operate()
	{
		Double value = null;
		
		try
		{
			value = Input.getDouble("first: ") * Input.getDouble("second: ");
		}
		catch(Exception e) {}
		
		return value;
	}
	
	@Override
	public String toString()
	{
		return "multiply";
	}
}