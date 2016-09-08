
/**
 * MazeWalker
 * Brandon Till
 */
public class MazeWalker
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }
      public void walkMaze(MazeBot mazeBot) {
        while(mazeBot.canMoveForward() == true){
              mazeBot.moveForward();
          if(mazeBot.canMoveForward() == false){
              mazeBot.turnLeft();
              if(mazeBot.canMoveForward() == false){
                  mazeBot.turnRight();
                  mazeBot.turnRight();
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