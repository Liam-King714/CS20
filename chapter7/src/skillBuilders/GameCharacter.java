package skillBuilders;

public class GameCharacter 
{
	//Declare instance variables
	private String name;
	private int health;
	
	//Default constructor
	public GameCharacter()
	{
		name = null;
		health = 0;
	}
	
	//Overload Constructor
	public GameCharacter(String charName, int startHealth)
	{
		name = charName;
		health = startHealth;
	}
	
	public void attack()
	{
		System.out.println(name + " attacks! Deals 10 damage.");
	}
	
	public void takeDamage(int damage)
	{
		health = health - damage;
		
		if(health < 0)
		{
			health = 0;
		}
		System.out.println(name + "'s health is now " + health);
	}
	
	public String getStatus()
	{
		return name + " has " + health + " health.";
	}

}
