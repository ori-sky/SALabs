package com.shockk.SALabs.unit2;

import java.util.List;

public class PostCodeTest
{
	public static void main(String[] args)
	{
		String[] formats =
			{
				"lddll",
				"ldddll",
				"llddll",
				"lldddll"
			};
		
		while(true)
		{
			FormatValidator fv = new FormatValidator(formats);
			String postcode = Input.getString("Postcode: ");
			
			if(fv.isValid(postcode)) System.out.println("valid");
			else System.out.println("invalid");

			String cont = Input.getString("Continue? (y/n): ");
			if(cont.equalsIgnoreCase("n")) break;
		}
	}
}