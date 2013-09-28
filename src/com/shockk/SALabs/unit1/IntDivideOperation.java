package com.shockk.SALabs.unit1;

public class IntDivideOperation implements IOperation
{
	@Override
	public Object operate()
	{
		return Input.get_int("first: ") / Input.get_int("second: ");
	}
	
	@Override
	public String toString()
	{
		return "integer division";
	}
}