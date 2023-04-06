package chapter04.oop3.abstracts;

import chapter04.oop3.interfaces.Running;
import chapter04.oop3.interfaces.Swimming;

/**
 * @author SDKany
 * @ClassName Bird
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description SwimmingBird抽象类，继承自Bird类，并实现Running, Swimming接口
 */
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
