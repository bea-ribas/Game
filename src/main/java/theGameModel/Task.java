package theGameModel;

public abstract class Task {
	
	protected Human human;
	protected Monster monster;
	private String name;
	private String date;
	
	protected World world;
	
	public abstract boolean execute ();
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getDate() {
		
		return date;
	}
	
	public void setDate(String date) {
		
		this.date = date;
	}

	public Human getHuman() {
		
		return human;
	}

	public void setHuman(Human human) {
		
		this.human = human;
	}

	public Monster getMonster() {
		
		return monster;
	}

	public void setMonster(Monster monster) {
		
		this.monster = monster;
	}
	
}