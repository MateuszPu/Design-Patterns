package com.prototype.design.pattern;

import org.apache.log4j.Logger;

public class Sheep implements Animal
{
	final static Logger logger = Logger.getLogger(Sheep.class);
	public Sheep()
	{
		logger.debug("sheep is made");
	}

	public Animal makeCopy()
	{
		logger.debug("sheep is being made");

		Sheep sheepObject = null;

		try
		{
			sheepObject = (Sheep) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

		return sheepObject;
	}

	public String toString()
	{
		return "test something in sheep class";
	}
}
