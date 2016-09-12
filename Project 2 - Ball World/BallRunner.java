
/**
 * Brandon Till
 * BallRunner
 */
public class BallRunner{
   BallWorld ballWorld = new BallWorld(500, 500); 
   TGPoint entrancePoint = new TGPoint(0.0, 0.0);
   BallBot[] ballBotArray = new BallBot[8];
   public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, BallBot[] ballBotArrayLength){
      
   }
   public static void activity1(){
      BallWorld ballWorld = new BallWorld(500, 500);
      TGPoint startPoint = new TGPoint(0.0, 0.0);
      double startHeading = 0.0;
      int radius = 25;
      BallBot ballBot = new BallBot(ballWorld, startPoint, startHeading, radius);
      while(ballBot.getHeading() >= 0){
         if(ballBot.canMoveForward(ballWorld) == true){
            ballBot.moveForward();
         }
         else{
            ballBot.setHeading(ballBot.getHeading() + (90 + Math.random() * 360));
         }
         ballBot.setPixelsPerSecond(1000);
         ballBot.setColor(11);
         /**
          * 00 - black
          * 01 - blue
          * 02 - neon green
          * 03 - cyan
          * 04 - red
          * 05 - magenta
          * 06 - neon yellow
          * 07 - white
          * 08 - dark brown
          * 09 - dark tan
          * 10 - dark green
          * 11 - turquoise
          * 12 - light red
          * 13 - light purple
          * 14 - orange
          * 15 - dark gray
          * 16 - dark blue
          * 17 - light blue
          * 18 - green
          * 19 - different shade of blue
          * 20 - brown
          * 21 - purple
          * 22 - yellow
          * 23 - light gray
          * 24 - light brown
          * 25 - tan
          * 26 - light green
          * 27 - really light blue
          * 28 - light yellow
          * 29 - pink
          * 30 - slightly lighter neon green
          * 31 - olive green
          * 32 - black
          */
      }
   }
}
