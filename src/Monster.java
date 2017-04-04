
public class Monster 
{
	private int health;
	private  int damageDealt;
	private int damageTaken;
	
	protected int dealDamage()
	{
		
		this.damageDealt = (int)(Math.random() * 5 + 1);
		return this.damageDealt;
	}
	 
	protected void takeDamage()
	{
		
	}
	
}
