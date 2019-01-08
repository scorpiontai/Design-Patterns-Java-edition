package com.alexbeard;

import com.alexbeard.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.perfomQuack();
        mallardDuck.perfomFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.perfomFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perfomFly();
    }
}
