package com.shockk.SALabs.unit1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input
{
	protected static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static String get_string(String prompt)
	{
		String value = null;
		System.out.print(prompt);
		
		try
		{
			value = Input.input.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static Character get_char(String prompt)
	{
		Character value = null;
		
		try
		{
			value = Input.get_string(prompt).charAt(0);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static Double get_double(String prompt)
	{
		Double value = null;
		
		try
		{
			value = Double.parseDouble(Input.get_string(prompt));
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static Integer get_int(String prompt)
	{
		Integer value = null;
		
		try
		{
			value = Integer.parseInt(Input.get_string(prompt));
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
}