package chapter04.oop.abstracts;

import chapter04.oop.interfaces.Running;
import chapter04.oop.interfaces.Swimming;

public abstract class SwimmingBird extends Bird implements Running, Swimming {

    public SwimmingBird() {
    }

    public SwimmingBird(String name, int age) {
        super(name, age);
    }

    public void change(int pose1, int pose2){
        if(pose1 < 0 || pose1 > 2 || pose2 < 0 || pose2 > 2 || pose1 == pose2){
            // 什么都不做
        }else{
            System.out.print("这个" + this.getClass().getSimpleName() + "从");
            switch (pose1) {
                case 0: System.out.print("飞行姿态"); break;
                case 1: System.out.print("奔跑姿态"); break;
                case 2: System.out.print("游泳姿态"); break;
            }
            System.out.print("切换到了");
            switch (pose2) {
                case 0: System.out.println("飞行姿态"); break;
                case 1: System.out.println("奔跑姿态"); break;
                case 2: System.out.println("游泳姿态"); break;
            }
        }
    }
}
