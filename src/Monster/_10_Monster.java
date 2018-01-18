/*
package Monster;
import org.apache.commons.lang3.ArrayUtils;

*/
/**
 * Created by auk on 09.05.17.
 *//*

public class _10_Monster {

    public static void main(String[] args) {

        _08_MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        //ObjectName[] Monsters = new ObjectName[4];

        _08_MonsterTwo[] Monsters = new _08_MonsterTwo[4];

        Monsters[0] = new _08_MonsterTwo();

        //_08_MonsterTwo(int health, int attack, int movement, String name);

        Monsters[0] = new _08_MonsterTwo(1000,20,1,"Frank");
        Monsters[1] = new _08_MonsterTwo(500,40,2,"Drac");
        Monsters[2] = new _08_MonsterTwo(1000,20,1,"Paul");
        Monsters[3] = new _08_MonsterTwo(1000,20,1,"George");

        _08_MonsterTwo.redrawBoard();


        for(_08_MonsterTwo m : Monsters){
            if(m.getAlive()){
                int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
                m.moveMonster(Monsters, arrayItemIndex);
            }
        }

        _08_MonsterTwo.redrawBoard();

    }
}
*/
