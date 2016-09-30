
/**
 * Brandon Till
 * BallRunner
 */
public class BallRunner{ 
    TGPoint entrancePoint = new TGPoint();
    BallBot[] ballBotArray;
    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, BallBot[] ballBotArrayLength){
        BallBot[] ballBotArray = new BallBot[10];
    }
    public static void activity1(){
        BallWorld ballWorld = new BallWorld(1280, 800);
        TGPoint startPoint = new TGPoint(0.0, 0.0);
        double startHeading = 0.0;
        int radius = 45;
        BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
        while(ballBot.getHeading() >= 0){
            if(ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }
            else{
                ballBot.setHeading(ballBot.getHeading() + (Math.random() * 360));
            }
            ballBot.setPixelsPerSecond((int)(Math.random() * 1200));
            ballBot.setColor((int)(Math.random() * 32));
        }
    }
    public int freeBallBotIndex(){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return i;
            }
            else{
                return ballBotArray.length;
            }
        }
        return -1;
    }
}
