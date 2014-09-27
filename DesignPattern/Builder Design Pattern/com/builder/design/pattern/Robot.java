package com.builder.design.pattern;

public class Robot implements RobotPlan
{

	private String RobotHead;
	private String RobotTorso;
	private String RobotArms;
	private String RobotLegs;

	@Override
	public void setRobotHead(String head)
	{
		RobotHead = head;
	}

	public String getRobotHead()
	{
		return RobotHead;
	}

	@Override
	public void setRobotTorso(String torso)
	{
		RobotTorso = torso;
	}

	public String getRobotTorso()
	{
		return RobotTorso;
	}

	@Override
	public void setRobotArms(String arms)
	{
		RobotArms = arms;
	}

	public String getRobotArms()
	{
		return RobotArms;
	}

	@Override
	public void setRobotLegs(String legs)
	{
		RobotLegs = legs;
	}

	public String getRobotLegs()
	{
		return RobotLegs;
	}

	@Override
	public String toString()
	{
		return "Robot [RobotHead=" + RobotHead + ", RobotTorso=" + RobotTorso + ", RobotArms="
				+ RobotArms + ", RobotLegs=" + RobotLegs + "]";
	}

}
