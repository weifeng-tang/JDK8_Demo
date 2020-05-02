package cn.wolfcode.jdk8.leambda;

import cn.wolfcode.jdk8.interfaces.Smokeable;

public class Leambda_1Test03 {
    public static void main (String[] args){
        goSmoking(new Smokeable() {
            public int smokeing(String name) {
                return 5;
            }
        });

        goSmoking(name -> 10);

    }
    public static void goSmoking(Smokeable s){
        int num = s.smokeing("中华");
        System.out.println("返回值:" + num);
    }
}
