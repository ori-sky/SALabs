package com.shockk.SALabs.unit1;

public class SubtractOperation implements IOperation
{
	@Override
	public Object operate()
	{
		return Input.get_double("first: ") - Input.get_double("second: ");
	}
	
	@Override
	public String toString()
	{
		return "subtract";
	}
}