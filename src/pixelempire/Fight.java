/*
 * [Fight.java]
 * Author: Daniel Yun
 * Date created: Jan.3
 * Purpose: Interface to be implemented by characters that can fight
 */
package pixelempire;

//Interface Fight
public interface Fight {

    //MoveForward method, takes in previous movement
    public void moveForward(double lastMovement);
    //CheckForRedEnemy, takes in map object and coordinates
    public int checkForRedEnemy(Map map, int y, int x);
    //CheckForBlueEnemy, takes in map object and coordinates
    public int checkForBlueEnemy(Map map, int y, int x);
}
