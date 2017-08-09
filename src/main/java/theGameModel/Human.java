package theGameModel;

import java.util.Date;

public class Human extends Players
{
	String orderName;


	public Human(String name, Date bornDate, boolean task, String orderName) 
	{
		super(name, bornDate, task);
		this.orderName = orderName;
	}

	public String getOrderName() 
	{
		return orderName;
	}

	public void setOrderName(String orderName) 
	{
		this.orderName = orderName;
	}
}
