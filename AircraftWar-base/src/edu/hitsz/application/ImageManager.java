package edu.hitsz.application;


import edu.hitsz.Props.BombProps;
import edu.hitsz.Props.CureProps;
import edu.hitsz.Props.FirePowerProps;
import edu.hitsz.aircraft.*;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 综合管理图片的加载，访问
 * 提供图片的静态访问方法
 *
 * @author hitsz
 */
public class ImageManager {

    /**
     * 类名-图片 映射，存储各基类的图片 <br>
     * 可使用 CLASSNAME_IMAGE_MAP.get( obj.getClass().getName() ) 获得 obj 所属基类对应的图片
     */
    private static final Map<String, BufferedImage> CLASSNAME_IMAGE_MAP = new HashMap<>();

    public static BufferedImage BACKGROUND_IMAGE;
    public static BufferedImage HERO_IMAGE;
    public static BufferedImage HERO_BULLET_IMAGE;
    public static BufferedImage ENEMY_BULLET_IMAGE;
    public static BufferedImage MOB_ENEMY_IMAGE;
    public static BufferedImage BOMBPROPS_IMAGE;
    public static BufferedImage CUREPROPS_IMAGE;
    public static BufferedImage FIREPOWERPROPS_IMAGE;
    public static BufferedImage EliteEnemyAircraft_IMAGE;

    static {
        try {

            BACKGROUND_IMAGE = ImageIO.read(new FileInputStream("src/images/bg.jpg"));

            HERO_IMAGE = ImageIO.read(new FileInputStream("src/images/hero.png"));
            MOB_ENEMY_IMAGE = ImageIO.read(new FileInputStream("src/images/mob.png"));
            HERO_BULLET_IMAGE = ImageIO.read(new FileInputStream("src/images/bullet_hero.png"));
            ENEMY_BULLET_IMAGE = ImageIO.read(new FileInputStream("src/images/bullet_enemy.png"));
            BOMBPROPS_IMAGE = ImageIO.read(new FileInputStream("src/images/prop_bomb.png"));
            CUREPROPS_IMAGE = ImageIO.read(new FileInputStream("src/images/prop_blood.png"));
            FIREPOWERPROPS_IMAGE = ImageIO.read(new FileInputStream("src/images/prop_bullet.png"));
            EliteEnemyAircraft_IMAGE = ImageIO.read(new FileInputStream("src/images/elite.png"));

            CLASSNAME_IMAGE_MAP.put(HeroAircraft.class.getName(), HERO_IMAGE);
            CLASSNAME_IMAGE_MAP.put(MobEnemy.class.getName(), MOB_ENEMY_IMAGE);
            CLASSNAME_IMAGE_MAP.put(HeroBullet.class.getName(), HERO_BULLET_IMAGE);
            CLASSNAME_IMAGE_MAP.put(EnemyBullet.class.getName(), ENEMY_BULLET_IMAGE);
            CLASSNAME_IMAGE_MAP.put(BombProps.class.getName(),BOMBPROPS_IMAGE);
            CLASSNAME_IMAGE_MAP.put(CureProps.class.getName(),CUREPROPS_IMAGE);
            CLASSNAME_IMAGE_MAP.put(FirePowerProps.class.getName(),FIREPOWERPROPS_IMAGE);
            CLASSNAME_IMAGE_MAP.put(EliteEnemyAircraft.class.getName(),EliteEnemyAircraft_IMAGE);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static BufferedImage get(String className){
        return CLASSNAME_IMAGE_MAP.get(className);
    }

    public static BufferedImage get(Object obj){
        if (obj == null){
            return null;
        }
        return get(obj.getClass().getName());
    }

}
