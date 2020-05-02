package cn.wolfcode.jdk8.leambda.method;

import org.junit.Test;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LeambdaMethod {
    /**
     * 对象::方法
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        Date now = new Date();
//        Supplier<Long> sul = ()->{
              //now对象调用getTime方法
//            return now.getTime();
//        };
        Supplier<Long> supplier = now::getTime;
        Long aLong = supplier.get();
        System.out.println("time:" + aLong);
    }

    /**
     * 类名::方法
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
//        Supplier<Long> supplier = ()->{
//            //类名调用currentTimeMillis方法
//          return System.currentTimeMillis();
//        };
        Supplier<Long> supplier = System::currentTimeMillis;
        Long aLong = supplier.get();
        System.out.println("time:" + aLong);
    }

    /**
     * 类名::实例方法
     * 注意:实际上将第一个参数作为方法的调用者
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {

//        Function<String, Integer> function = (String str)->{
//            return str.length();
//        };

        Function<String, Integer> function = String::length;
        Integer length = function.apply("xy");
        System.out.println(length);
    }

    /**
     * 类名::无参构造器
     * @throws Exception
     */
    @Test
    public void test4() throws Exception {
//        Supplier<User> supplier = ()->{
//            return new User();
//        };
        Supplier<User> supplier = User::new;

        User user = supplier.get();
        System.out.println(user);
    }

    /**
     * 类名::有参构造器
     * @throws Exception
     */
    @Test
    public void test5() throws Exception {
        BiFunction<String, String, User> bf = User::new;
        User user = bf.apply("xy", "W");
        System.out.println(user);
    }





}
