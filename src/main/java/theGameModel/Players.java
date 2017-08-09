package theGameModel;

import java.util.Date;

public class Players 
{
	String name;
	Date bornDate;
	static boolean task;
	Date taskDate;
	
	
	public Players(String name, Date bornDate, boolean task) 
	{
		super();
		this.name = name;
		this.bornDate = bornDate;
		Players.task = task;
		
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Date getBornDate() 
	{
		return bornDate;
	}
	
	public void setBornDate(Date bornDate) 
	{
		this.bornDate = bornDate;
	}
	public boolean isTask() 
	{
		return task;
	}

	public void setTask(boolean task) 
	{
		Players.task = task;
	}

	public Date getTaskDate() 
	{
		return taskDate;
	}

	public void setTaskDate(Date taskDate) 
	{
		this.taskDate = taskDate;
	}	
}