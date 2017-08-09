package theGameModel;

import java.util.Date;

public class Werewolves extends Players
{
	int proteinLevel;
	String clanName;
	boolean relationSlaves;
	
	public Werewolves(String name, Date bornDate, int proteinLevel, String clanName, boolean relationSlaves) 
	{
		super(name, bornDate, task);
		this.proteinLevel = proteinLevel;
		this.clanName = clanName;
		this.relationSlaves = relationSlaves;
	}

	public int getProteinLevel() 
	{
		return proteinLevel;
	}
	
	public void setProteinLevel(int proteinLevel) 
	{
		this.proteinLevel = proteinLevel;
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
