package cn.wolfcode.jdk8.leambda;

public class Leambda_1Test01 {
    public static void main (String[] args){
       new Thread(new Runnable() {
           public void run() {
               System.out.println("123");
           }
       }).start();

        new Thread(()-> System.out.println("123")).start();
    }
}
