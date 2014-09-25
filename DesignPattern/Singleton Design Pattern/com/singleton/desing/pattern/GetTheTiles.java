package com.singleton.desing.pattern;

import java.util.LinkedList;
import org.apache.log4j.Logger;

public class GetTheTiles implements Runnable
{
	final static Logger logger = Logger.getLogger(GetTheTiles.class);

	@Override
	public void run()
	{
		Singleton newInstance = Singleton.getInstance();

		logger.error("Instance ID : " + System.identityHashCode(newInstance));
		logger.error(newInstance.getLetterList());

		LinkedList<String> playerOneTiles = newInstance.getTiles(7);

		logger.error("Player one :" + playerOneTiles);
	}
}
