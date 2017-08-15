package theGameModel;

import java.util.Set;

public class Werewolf extends Monster{
	
	private final String food = "meet";
	
	private Set<Human> humansTransformed;
	
	public WerewolfClan getClan() {
		
		return (WerewolfClan) super.clan;
	}
	
	public void setClan(WerewolfClan clan) {
		
		super.clan = clan;
	}
	
	public Set<Human> getHumansTransformed() {
		
		return humansTransformed;
	}
	
	public void setHumansTransformed(Set<Human> humansTransformed) {
		
		this.humansTransformed = humansTransformed;
	}
	
	public String getFood() {
		
		return food;
	}	
}