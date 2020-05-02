package cn.wolfcode.jdk8.leambda;

import java.util.function.Function;

public class Leanbda_2FunctionTest {
    public static void main(String[] args) {
        functionTest1(str-> str + " World");

        functionTest2(str -> Integer.valueOf(str));

        System.out.println("-----------------------------------");

        functionTest3(str -> Integer.valueOf(str), integer -> integer + 500);

        System.out.println("-----------------------------------");

        functiontTest4(str ->  str.toUpperCase());


    }

    public static void functionTest1(Function<String, String> function){
        String str = function.apply("Hello");
        System.out.println(str);
    }

    public static void functionTest2(Function<String, Integer> function){
        Integer integer = function.apply("20");
        System.out.println(integer + 500);
    }

    public static void functionTest3(Function<String, Integer> f1, Function<Integer, Integer> f2) {
        Integer integer = f1.andThen(f2).apply("20");
        System.out.println(integer);
    }






    public static void functiontTest4(Function<String, String> f1){
        String str = f1.apply("afhldhfasdfh");
        System.out.println(str);
    }
}
