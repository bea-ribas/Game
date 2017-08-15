package theGameModel;

import java.util.HashSet;
import java.util.Set;

public class World {
	
	private Set<Human> humans = new HashSet<Human>();
	private Set<Monster> monsters = new HashSet<Monster>();
	
	public boolean killHuman(Human human) {
		
		return humans.remove(human);
	}
	
	public boolean createMonster(Monster monster) {
		
		return monster.add(monster);
	}

	public Set<Monster> getMonsters() {
		
		return monsters;
	}

	public void setMonsters(Set<Monster> monsters) {
		
		this.monsters = monsters;
	}
}