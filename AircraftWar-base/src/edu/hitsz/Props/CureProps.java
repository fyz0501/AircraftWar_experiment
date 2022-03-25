package edu.hitsz.Props;

import edu.hitsz.application.Main;
import edu.hitsz.basic.FlyingObject;

/**
 * 回血道具
 * @author 200110501符悦泽
 */


public class CureProps extends FlyingObject {

    public static int increaseHp = 30;

    //Constructor
    public CureProps(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }
}
