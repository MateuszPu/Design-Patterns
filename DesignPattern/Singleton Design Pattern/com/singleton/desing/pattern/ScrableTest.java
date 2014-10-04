package com.singleton.desing.pattern;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class ScrableTest
{
	final static Logger logger = Logger.getLogger(ScrableTest.class);

	public static void main(String[] args)
	{
		Singleton newInstance = Singleton.getInstance();

		logger.debug("Instance 1 ID : " + System.identityHashCode(newInstance));

		logger.debug(newInstance.getLetterList());

		LinkedList<String> playerOneTiles = newInstance.getTiles(7);

		logger.debug("Player one :" + playerOneTiles);
		logger.debug(newInstance.getLetterList());

		Singleton instanceTwo = Singleton.getInstance();
		logger.debug("Instance 2 ID : " + System.identityHashCode(instanceTwo));

		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		logger.debug("Player two :" + playerTwoTiles);
		logger.debug(newInstance.getLetterList());
	}
}
