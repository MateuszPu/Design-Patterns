package com.builder.design.pattern;

import org.apache.log4j.Logger;

public class TestRobotBuilder
{
	final static Logger logger = Logger.getLogger(TestRobotBuilder.class);

	public static void main(String[] args)
	{
		RobotBuilder oldStyleRobote = new OldRobotBuilder();

		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobote);

		robotEngineer.makeRobot();

		Robot firstRobot = robotEngineer.getRobot();
		logger.debug(firstRobot.toString());
	}
}
