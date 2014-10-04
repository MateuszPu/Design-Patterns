package com.prototype.design.pattern;

import org.apache.log4j.Logger;

public class TestCloning
{
	final static Logger logger = Logger.getLogger(TestCloning.class);
	public static void main(String[] args)
	{
		CloneFactory animalMaker = new CloneFactory();

		Sheep test1 = new Sheep();

		Sheep clonedSheep = (Sheep) animalMaker.getClone(test1);

		logger.debug(test1);

		logger.debug(clonedSheep);

		logger.debug("test1: " + System.identityHashCode(System.identityHashCode(test1)));
		
		logger.debug("clone: " + System.identityHashCode(System.identityHashCode(clonedSheep )));

	}

}
