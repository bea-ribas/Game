package theGameModel;

import java.util.HashSet;
import java.util.Set;

public class VampireClan extends Clan{
	
	private Set <Vampire> vampires = new HashSet<Vampire>();

	public Set <Vampire> getVampires() {
		
		return vampires;
	}

	public void setVampires(Set <Vampire> vampires) {
		
		this.vampires = vampires;
	}
}