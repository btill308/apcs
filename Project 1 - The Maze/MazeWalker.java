
/**
 * MazeWalker
 * Brandon Till
 */
public class MazeWalker
{
      public void walkMaze(MazeBot mazeBot) {
          while(mazeBot.canMoveForward() == true){
              mazeBot.moveForward();
            }
          if(mazeBot.canMoveForward() == false){
              mazeBot.turnLeft();
              if(mazeBot.canMoveForward() == false){
                  mazeBot.turnRight();
                  mazeBot.turnRight();
                }
                else{
                    while(mazeBot.canMoveForward() == true){
                         mazeBot.moveForward();
                   }
                }
            }
          if(mazeBot.didReachGoal() == true){
              mazeBot.signalSuccess();
            }
          else{
              mazeBot.signalError();
            }
        }
}