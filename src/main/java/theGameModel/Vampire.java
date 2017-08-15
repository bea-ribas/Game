package theGameModel;

import java.util.Set;

public class Vampire extends Monster{
	
	private final String food = "blood";
	
	private Set<Human> humansBitten;
	
	public VampireClan getClan() {
		
		return (VampireClan) super.clan;
	}
	
	public void setClan(VampireClan clan) {
		
		super.clan = clan;
	}
	
	public String getFood() {
		
		return food;
	}

	public Set<Human> getHumansBitten() {
		
		return humansBitten;
	}

	public void setHumansBitten(Set<Human> humansBitten) {
		
		this.humansBitten = humansBitten;
	}
	
	public boolean executeTasks() {
		boolean hasPerformed = true;
		for(Task task : tasks) {
			
			hasPerformed &= task.execute();
		}
		return hasPerformed;
	}
}