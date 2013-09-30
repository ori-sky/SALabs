package com.shockk.SALabs.unit1;

public class FarmerGame
{
	public enum Bank
	{
		Left,
		Right
	};
	
	public enum Entity
	{
		Fox,
		Chicken,
		Corn
	}
	
	private Bank farmer_bank = Bank.Left;
	private Bank[] entity_banks = new Bank[Entity.values().length];
	
	public FarmerGame()
	{
		for(int i=0; i<this.entity_banks.length; ++i)
		{
			this.entity_banks[i] = Bank.Left;
		}
	}
	
	public void print_state()
	{
		StringBuilder sb = new StringBuilder();
		this.get_entity_banks_sb(sb);
		
		if(sb.length() > 0) sb.insert(0, " with the ");
		
		System.out.println("You are at the edge of the " + this.farmer_bank.toString() + " river bank" + sb + ".");
	}
	
	public void get_entity_banks_sb(StringBuilder sb)
	{
		if(this.entity_banks.length > 0)
		{
			int i = 0;
			
			if(this.farmer_bank == this.entity_banks[i])
			{
				sb.append(Entity.values()[i]);
			}
			
			++i;
			
			while(i < this.entity_banks.length - 1)
			{
				if(this.farmer_bank == this.entity_banks[i])
				{
					sb.append(", " + Entity.values()[i]);
				}
				
				++i;
			}
			
			if(this.farmer_bank == this.entity_banks[i])
			{
				sb.append(" and " + Entity.values()[i]);
			}
		}
	}
}