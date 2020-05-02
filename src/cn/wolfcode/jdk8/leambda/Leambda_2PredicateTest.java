package cn.wolfcode.jdk8.leambda;

import java.util.function.Predicate;

public class Leambda_2PredicateTest {
    public static void main(String[] args) {
        predicateTest1(str -> str.contains("H"));
        System.out.println("---------------------------");
        predicateTest2(str-> str.contains("W"),str ->str.contains("y"));
        System.out.println("---------------------------");
        predicateTest3(str -> str.contains("W"),str -> str.contains("H"));
        System.out.println("---------------------------");
        predicateTest4(str -> str.contains("X"), str-> str.contains("W"));
        System.out.println("---------------------------");
        predicateTest5(str-> str.contains("W"));
        System.out.println("---------------------------");


    }

    public static void predicateTest1(Predicate<String> predicate){
        boolean b1 = predicate.test("Hello World");
        System.out.println(b1);
    }

    public static void predicateTest2(Predicate<String> p1, Predicate<String> p2){
        boolean b1 = p1.test("Hello World");
        boolean b2 = p2.test("xy");
        if (b1 && b2){
            System.out.println("an");
        }
    }
    public static void predicateTest3(Predicate<String> p1, Predicate<String> p2){
        boolean b1 = p1.and(p2).test("Hello World");
        if (b1){
            System.out.println("既包含H也包含W");
        }
    }

    public static void predicateTest4(Predicate<String> p1, Predicate<String> p2){
        boolean b2 = p1.or(p2).test("Xy");
        if (b2){
            System.out.println("包含X或包含y");
        }
    }

    public static void predicateTest5(Predicate<String> p1){
        boolean b = p1.negate().test("xy");
        if (b){
            System.out.println("不包含W");
        }
    }


}
