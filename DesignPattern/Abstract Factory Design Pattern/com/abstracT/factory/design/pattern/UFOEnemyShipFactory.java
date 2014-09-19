package com.abstracT.factory.design.pattern;
public class UFOEnemyShipFactory implements EnemyShipFactory
{

	public ESWeapon addESGun()
	{
		return new ESUFOGun();
	}

	public ESEngine addESEngine()
	{
		return new ESUFOEngine();
	}
}