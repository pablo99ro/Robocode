package MyFirstBot;

import java.awt.Color;

import robocode.*;
import robocode.util.Utils;

public class BotPRO extends AdvancedRobot {
    public void run() {
    	setBodyColor(Color.black);
    	setGunColor(Color.gray);
    	setBulletColor(Color.white);
    	setRadarColor(Color.red);
    	setScanColor(Color.cyan);
    	
    	turnRadarRightRadians(Double.POSITIVE_INFINITY);
    	
        do {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        } while (true);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double radarTurn = getHeadingRadians() + e.getBearingRadians() - getRadarHeadingRadians();
        setTurnRadarRightRadians(Utils.normalRelativeAngle(radarTurn));
    	fire(2);
    }
    
    public void onHitByBullet(HitByBulletEvent e) {
    	
    }
}