package theGameModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Monster {
	
	protected Clan clan;
	
	protected String name;
	protected String bornDate;
	protected List<Task> tasks = new ArrayList<Task>();
	
	protected static int feedLevel;
	
	public int getFeedLevel() {
		
		return feedLevel;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getBornDate() {
		
		return bornDate;
	}
	public void setBornDate(String bornDate) {
		
		this.bornDate = bornDate;
	}
	
	public boolean executeTasks() {
		boolean hasPerformed = true;
		for(Task task : tasks) {
			
			hasPerformed &= task.execute();
		}
		return hasPerformed;
	}
	public boolean add(Monster monster) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setFeedLevel(int feedLevel) {
		
		Monster.feedLevel = feedLevel;
	}
}