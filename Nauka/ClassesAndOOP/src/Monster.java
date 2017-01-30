
public class Monster {
    public final String TOMBSTONE = "Here Lies a dead monster";
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPos = 0;
    private int yPos = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public int getAttack()
    {
        return attack;
    }
    public int getMovement()
    {
        return movement;
    }
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }

    public Monster(int health, int attack, int movement)
    {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }

    //Default Contructor
    public Monster()
    {

    }

    public static void main(String args[])
    {
        Monster Frank = new Monster();
        System.out.println(Frank.attack);
    }
}
