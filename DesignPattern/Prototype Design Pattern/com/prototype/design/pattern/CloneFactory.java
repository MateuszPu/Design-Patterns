package com.prototype.design.pattern;

public class CloneFactory
{
	public Animal getClone(Animal animalSample)
	{
		return animalSample.makeCopy();
	}
}
