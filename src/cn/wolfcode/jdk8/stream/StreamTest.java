package cn.wolfcode.jdk8.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest {
    /**
     * forEach:遍历集合
     */
    @Test
    public  void test1() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "刘德华", "张学友", "黎明", "郭富城", "唐伟锋");
        list.stream().filter(s-> s.length()== 2).forEach(System.out::println);
    }

    /**
     * filter:过滤集合
     */
    @Test
    public void method1(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "刘德华", "张学友", "黎明", "郭富城", "唐伟锋");
        list.stream().filter(s->s.startsWith("唐")).forEach(System.out::println);
    }

    @Test
    public void test2() throws Exception {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "刘德华", "张学友", "黎明", "郭富城", "唐伟锋");
        long count = list.stream().count();
        System.out.println(count);
    }

    @Test
    public void test3() throws Exception {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "刘德华", "张学友", "黎明", "郭富城", "唐伟锋");
        list.stream().limit(3L).forEach(System.out::println);
    }

    @Test
    public void test4() throws Exception {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "刘德华", "张学友", "黎明", "郭富城", "唐伟锋");
        list.stream().skip(2).forEach(System.out::println);
    }



}
