package cn.wolfcode.jdk8.leambda;

import cn.wolfcode.jdk8.interfaces.Swimmable;

public class Leambda_1Test02 {
    public static void main (String[] args){
        //leambda前
        goSwimming(new Swimmable() {
            public void swimming() {
                System.out.println("匿名内部类的游泳");
            }
        });

        goSwimming(() -> {
            System.out.println("Leambda表达式的游泳");
        });
    }
    public static void goSwimming(Swimmable s){
        s.swimming();
    }
}
