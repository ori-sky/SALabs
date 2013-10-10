package com.shockk.SALabs.unit2;

import com.shockk.SALabs.common.Input;

public class Name implements Comparable<Name>
{
	protected String forename;
	protected String surname;
	
	public Name()
	{
		this.forename = Input.getString("Forename: ");
		this.surname = Input.getString("Surname: ");
	}
	
	@Override
	public int compareTo(Name obj)
	{
		int result = this.forename.compareToIgnoreCase(obj.forename);
		return (result == 0) ? this.surname.compareToIgnoreCase(obj.surname) : result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Name)) return false;
		boolean result = this.forename.equalsIgnoreCase(((Name)obj).forename);
		return result ? this.surname.equalsIgnoreCase(((Name)obj).surname) : result;
	}
	
	@Override
	public String toString()
	{
		return this.forename + " " + this.surname;
	}
}