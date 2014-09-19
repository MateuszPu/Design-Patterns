package com.abstracT.factory.design.pattern;
public class UFOBossEnemyShipFactory implements EnemyShipFactory
{

	public ESWeapon addESGun()
	{
		return new ESUFOBossGun();
	}

	public ESEngine addESEngine()
	{
		return new ESUFOBossEngine();
	}
}