import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Simplegame {

    public static void main(String args[])
    {
        Monster.buildBattleBorad();
        char[][] tempBattleBoard = new char[10][10];
        Monster[] MonsterArray = new Monster[4];
        MonsterArray[0] = new Monster(100,20,1,"Frank");
        MonsterArray[1] = new Monster(100,20,1,"George");
        MonsterArray[2] = new Monster(100,20,1,"Juan");
        MonsterArray[3] = new Monster(100,20,1,"Monstro");
        Monster.redrawBoard();

    }
}
