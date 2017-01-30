import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];
    public static void buildBattleBorad()
    {
        for(char[] row : battleBoard)
        {
            Arrays.fill(row,'*');

        }
    }

    public static void redrawBoard()
    {
        int k = 1;
        while (k <= 30)
        {
            System.out.print('-');
            k++;
        }
        System.out.println();
        for (int i = 0; i < battleBoard.length; i++)
        {
            for(int j = 0; j < battleBoard[i].length; j++)
            {
                System.out.print("|" + battleBoard[i][j] + "|");

            }
            System.out.println();

        }
        int z = 1;
        while (z <= 30)
        {
            System.out.print('-');
            z++;
        }
    }
    public final String TOMBSTONE = "Here Lies a dead monster";
    private int health = 500;
    private int attack = 20;
    private int movement = 2;

    private boolean alive = true;

    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPos = 0;
    public int yPos = 0;
    public static int numOfMonsters = 0;
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
    public boolean getAlive()
    {
        return alive;
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

    public Monster(int health, int attack, int movement, String name)
    {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;
        int maxXBoardSpace = battleBoard.length ;
        int maxYBoardSpace = battleBoard[0].length ;

        int randNumX, randNumY;
        do
        {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);

        }
        while(battleBoard[randNumX][randNumY] != '*');

        this.xPos = randNumX;
        this.yPos = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPos][this.xPos] = this.nameChar1;
        numOfMonsters++;
    }

    //Default Contructor
    public Monster()
    {
    numOfMonsters++;
    }

    public static void main(String args[])
    {

    }
}
