package theGameModel;

import java.util.HashSet;
import java.util.Set;

public class WerewolfClan extends Clan {
	
	private Set<Werewolf> werewolves = new HashSet<Werewolf>();

	public Set<Werewolf> getWerewolves() {
		
		return werewolves;
	}

	public void setWerewolves(Set<Werewolf> werewolves) {
		
		this.werewolves = werewolves;
	}
}

