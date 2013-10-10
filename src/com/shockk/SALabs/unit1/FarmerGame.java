package com.shockk.SALabs.unit1;

import com.shockk.SALabs.common.Input;

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
	
	public boolean run()
	{
		for(;;)
		{
			this.print_state();
			this.print_options();
			if(this.process_input()) return false;
			if(this.check_fail()) break;
			if(this.check_win()) break;
		}
		
		return true;
	}
	
	public void print_state()
	{
		StringBuilder sb = new StringBuilder();
		this.get_entity_banks_sb(sb);
		
		if(sb.length() > 0) sb.insert(0, " with the ");
		
		System.out.println();
		System.out.println("You are at the edge of the " + this.farmer_bank.toString() + " river bank" + sb + ". What do you do?");
	}
	
	public void print_options()
	{
		System.out.println("0: Give up.");
		System.out.println("1: Cross the river to the " + toggle_bank(this.farmer_bank) + " bank.");
		
		int n = 2;
		
		for(int i=0; i<this.entity_banks.length; ++i)
		{
			if(this.farmer_bank == this.entity_banks[i])
			{
				System.out.println(n++ + ": " + "Take the " + Entity.values()[i] + " across the river to the " + toggle_bank(this.farmer_bank) + " bank.");
			}
		}
	}
	
	public boolean process_input()
	{
		Integer input = null;
		
		try
		{
			input = Input.getInt("> ");
		}
		catch(Exception e) {}
		
		if(input == null) return false;
		
		if(input == 0)
		{
			System.out.println("You gave up.");
			return true;
		}
		else if(input == 1)
		{
			this.farmer_bank = toggle_bank(this.farmer_bank);
			return false;
		}
		
		int n = 2;
		
		for(int i=0; i<this.entity_banks.length; ++i)
		{
			if(this.farmer_bank == this.entity_banks[i])
			{
				if(n++ == input)
				{
					this.farmer_bank = toggle_bank(this.farmer_bank);
					this.entity_banks[i] = toggle_bank(this.entity_banks[i]);
					return false;
				}
			}
		}

		System.out.println("Invalid option.");
		return false;
	}
	
	public boolean check_fail()
	{
		for(int i=0; i<this.entity_banks.length-1; ++i)
		{
			if(this.entity_banks[i] == this.entity_banks[i + 1] && this.entity_banks[i] != this.farmer_bank)
			{
				System.out.println("You failed! The " + Entity.values()[i] + " ate the " + Entity.values()[i + 1] + "!");
				return true;
			}
		}
		
		return false;
	}
	
	public boolean check_win()
	{
		for(int i=0; i<this.entity_banks.length; ++i)
		{
			if(this.entity_banks[i] == Bank.Left) return false; 
		}
		
		StringBuilder sb = new StringBuilder();
		this.get_entity_banks_sb(sb);
		System.out.println("You won! The " + sb + " made it across the river to the " + Bank.Right + " bank!");
		return true;
	}
	
	public Bank toggle_bank(Bank bank)
	{
		return bank == Bank.Left ? Bank.Right : Bank.Left;
	}
	
	public void get_entity_banks_sb(StringBuilder sb)
	{
		int n = 0;
		
		for(int i=this.entity_banks.length-1; i>=0; --i)
		{
			if(this.farmer_bank == this.entity_banks[i])
			{
				switch(n++)
				{
				case 0:
					sb.insert(0, Entity.values()[i]);
					break;
				case 1:
					sb.insert(0, Entity.values()[i] + " and ");
					break;
				default:
					sb.insert(0, Entity.values()[i] + ", ");
					break;
				}
			}
		}
	}
}