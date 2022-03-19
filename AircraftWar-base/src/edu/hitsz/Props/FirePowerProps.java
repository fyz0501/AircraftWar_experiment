package edu.hitsz.Props;

import edu.hitsz.application.Main;
import edu.hitsz.basic.FlyingObject;

/**
 * 火力道具
 * @author 200110501符悦泽
 */

public class FirePowerProps extends FlyingObject {
    //Constructor
    public FirePowerProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
    //Moving method
//    @Override
//    public void forward(){
//        locationY += speedY;
//        // 判定 y 轴向下飞行出界
//        if (locationY >= Main.WINDOW_HEIGHT ) {
//            vanish();
//        }
//    }

}
