package cn.wolfcode.jdk8.leambda;

import java.util.function.Consumer;

public class Leambda_2ConsumerTest {
    //Consumer >> 消费型接口 >> 有参无返
    public static void main(String[] args) {
        consumerTest1(name -> System.out.println(name.toLowerCase()));

        consumerTest2(integer->{
            int i = integer.intValue();
            System.out.println("xy:" + (i + 500));
        });
    }

    public static void consumerTest1(Consumer<String> consumer){
        consumer.accept("你好世界!");
    }

    public static void consumerTest2(Consumer<Integer> consumer){
        consumer.accept(20);
    }
}
