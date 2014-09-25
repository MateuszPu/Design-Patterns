package com.singleton.desing.pattern;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class ScrableTest
{
	final static Logger logger = Logger.getLogger(ScrableTest.class);

	public static void main(String[] args)
	{
		Singleton newInstance = Singleton.getInstance();

		logger.error("Instance 1 ID : " + System.identityHashCode(newInstance));

		logger.error(newInstance.getLetterList());

		LinkedList<String> playerOneTiles = newInstance.getTiles(7);

		logger.error("Player one :" + playerOneTiles);
		logger.error(newInstance.getLetterList());

		Singleton instanceTwo = Singleton.getInstance();
		logger.error("Instance 2 ID : " + System.identityHashCode(instanceTwo));
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		logger.error("Player two :" + playerTwoTiles );
		logger.error(newInstance.getLetterList());
	}
}
