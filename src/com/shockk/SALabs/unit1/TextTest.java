package com.shockk.SALabs.unit1;

public class TextTest
{
	public static void main(String[] args)
	{
		String input = null;
		
		while(input == null || !input.equalsIgnoreCase("no"))
		{
			input = Input.get_string("Input: ");
			String[] words = input.split(" ");
			
			for(String word : words)
			{
				System.out.println(word);
			}
			
			System.out.println(words.length);
		}
	}
}