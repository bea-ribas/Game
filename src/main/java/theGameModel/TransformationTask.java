package theGameModel;

public class TransformationTask extends Task{
	
	
	public boolean execute() {
		boolean successfull = world.killHuman(human) && world.createMonster(monster);
		return successfull;
	}

}