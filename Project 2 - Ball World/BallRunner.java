
/**
 * BallRunner
 * Brandon Till
 * 9/6/16
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint startPoint = new TGPoint(0.0, 0.0);
        BallBot ballBot = new BallBot(ballWorld, startPoint, 0.0, 15);
       while(ballBot.canMoveForward(ballWorld) == true){
          ballBot.moveForward();
       }
       if(ballBot.canMoveForward(ballWorld) == false){
          ballBot.getHeading();
          ballBot.setHeading(135.0);
       }
       while(ballBot.canMoveForward(ballWorld) == true){
          ballBot.moveForward();
       }
    }
}
