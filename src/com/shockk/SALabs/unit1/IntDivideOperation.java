package com.shockk.SALabs.unit1;

import com.shockk.SALabs.common.Input;

public class IntDivideOperation implements IOperation
{
	@Override
	public Object operate()
	{
		Integer value = null;
		
		try
		{
			value = Input.getInt("first: ") / Input.getInt("second: ");
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