package com.shockk.SALabs.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input
{
	protected static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getString(String prompt)
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
	
	public static Character getChar(String prompt)
	{
		Character value = Input.getString(prompt).charAt(0);
		return value;
	}
	
	public static Double getDouble(String prompt)
	{
		Double value = Double.parseDouble(Input.getString(prompt));
		return value;
	}
	
	public static Integer getInt(String prompt)
	{
		Integer value = Integer.parseInt(Input.getString(prompt));
		return value;
	}
}