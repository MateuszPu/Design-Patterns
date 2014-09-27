package com.builder.design.pattern;

public class OldRobotBuilder implements RobotBuilder
{
	private Robot robot;

	public OldRobotBuilder()
	{
		this.robot = new Robot();
	}

	@Override
	public void bulidRobotHead()
	{
		robot.setRobotHead("Head is tin");
	}

	@Override
	public void bulidRobotTorso()
	{
		robot.setRobotTorso("Torso is tin");
	}

	@Override
	public void bulidRobotArms()
	{
		robot.setRobotArms("Arms are tin");
	}

	@Override
	public void bulidRobotLegs()
	{
		robot.setRobotLegs("Legs are tin");
	}

	@Override
	public Robot getRobot()
	{
		return this.robot;
	}

}
