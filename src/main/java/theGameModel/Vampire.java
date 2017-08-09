package theGameModel;

import java.util.Date;

public class Vampire extends Players
{
	int hemoglobinLevel;
	String clanName;
	boolean relationSlaves;
	
	
	public Vampire(String name, Date bornDate, int hemoglobinLevel, String clanName, boolean relationSlaves) 
	{
		super(name, bornDate, task);
		this.hemoglobinLevel = hemoglobinLevel;
		this.clanName = clanName;
		this.relationSlaves = relationSlaves;
	}

	public int getHemoglobinLevel() 
	{
		return hemoglobinLevel;
	}
	
	public void setHemoglobinLevel(int hemoglobinLevel) 
	{
		this.hemoglobinLevel = hemoglobinLevel;
	}
	
	public String getClanName() 
	{
		return clanName;
	}
	
	public void setClanName(String clanName) 
	{
		this.clanName = clanName;
	}
	
	public boolean isRelationSlaves() 
	{
		return relationSlaves;
	}
	
	public void setRelationSlaves(boolean relationSlaves) 
	{
		this.relationSlaves = relationSlaves;
	}
}
