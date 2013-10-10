package com.shockk.SALabs.unit2;

import com.shockk.SALabs.common.Input;

public class NameTest
{
	public static void main(String[] args)
	{
		while(true)
		{
			Name name1 = new Name();
			Name name2 = new Name();
			
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(name1.equals(name2));
			
			int result = name1.compareTo(name2);

			if(result == 0)     System.out.println("equals");
			else if(result > 0) System.out.println("greater than");
			if(result < 0)      System.out.println("less than");
			
			String cont = Input.getString("Continue? (y/n): ");
			if(cont.equalsIgnoreCase("n")) break;
		}
	}
}