package edu.hitsz.Props;

import edu.hitsz.application.Main;
import edu.hitsz.basic.FlyingObject;

/**
 * 回血道具
 * @author 200110501符悦泽
 */


public class CureProps extends FlyingObject {
    //Constructor
    public CureProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
        speedX = 0;
    }
    //Moving Method
//    @Override
//    public void forward(){
//        locationY += speedY;
//        // 判定 y 轴向下飞行出界
//        if (locationY >= Main.WINDOW_HEIGHT ) {
//            vanish();
//        }
//    }
}
