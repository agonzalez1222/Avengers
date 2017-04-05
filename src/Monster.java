
public class Monster 
{
	private int crewPersonhealth;
	private int damageDealtByInsaneCrewPerson;
	private int damageDealtByCultist;
	private int damageDealtByGug;
	private int damageDealtByGhast;
	private int damageDealtByMiGo;
	private int damageDealtByElder;
	private int damageDealtByShoggoth;
	private int damageDealtByGreatOne;
	private int damageTaken;
	
	protected int dealDamageForCrewPerson()
	{
		
		this.damageDealtByInsaneCrewPerson = (int)(Math.random() * 5 + 1);
		return this.damageDealtByInsaneCrewPerson;
	}
	 
	protected void takeDamage()
	{
		
	}
	
	protected int dealDamageByCultist()
	{
		this.damageDealtByCultist = (int)(Math.random() * 4 + 5);
		return this.damageDealtByCultist;
	}
	
	protected int dealDamageByGug()
	{
		this.damageDealtByGug = (int)(Math.random() * 7 + 4 );
		return this.damageDealtByGug;
	}
	
	protected int dealDamageByGhast()
	{
		this.damageDealtByGhast = (int)(Math.random() * 5  + 9 );
		return this.damageDealtByGhast;
	}
	
	protected int dealDamageByMiGo()
	{
		this.damageDealtByMiGo = (int)(Math.random() * 3 + 11 );
		return this.damageDealtByMiGo;
	}
	
	protected int dealDamageByElder()
	{
		this.damageDealtByElder = (int)(Math.random() * 6 + 10 );
		return this.damageDealtByElder;
	}
	
	protected int dealDamageByShoggoth()
	{
		this.damageDealtByShoggoth = (20);
		return this.damageDealtByShoggoth;
	}
	
	protected int dealDamageByGreatOne()
	{
		this.damageDealtByGreatOne = (30);
		return this.damageDealtByGreatOne;
	}
}
