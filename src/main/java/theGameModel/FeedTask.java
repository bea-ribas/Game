package theGameModel;

public class FeedTask extends Task{

	public boolean execute() {
		
		monster.setFeedLevel(monster.getFeedLevel() + 1);
		world.killHuman(human);
		return true;
	}
}
