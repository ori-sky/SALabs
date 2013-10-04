package com.shockk.SALabs.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormatValidator
{
	private List<String> formats;
	
	public FormatValidator(List<String> formats)
	{
		this.formats = formats;
	}
	
	public FormatValidator(String[] formats)
	{
		this.formats = new ArrayList<String>(Arrays.asList(formats));
	}
	
	public boolean isValid(String input)
	{
		String s = input.replaceAll(" ", "");
		
		for(String format : this.formats)
		{
			if(format.length() != s.length()) continue;
			
			for(int i=0; i<format.length(); ++i)
			{
				if(format.charAt(i) == 'l')
				{
					if(!Character.isLetter(s.charAt(i))) break;
				}
				else if(format.charAt(i) == 'd')
				{
					if(!Character.isDigit(s.charAt(i))) break;
				}
				
				if(i == format.length() - 1) return true;
			}
		}
		
		return false;
	}
}