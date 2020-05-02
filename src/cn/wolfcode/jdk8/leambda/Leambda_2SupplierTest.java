package cn.wolfcode.jdk8.leambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class Leambda_2SupplierTest {
    public static void main(String[] args) {
        //Suppleir >> 供给型接口 >> 无参有返
        supplierTest1(() -> "Hello World");

        supplierTest2(()->{
            int[] arr = {11, 22, 33, 44, 55};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

    public static void  supplierTest1(Supplier<String> stringSupplier){
        String str = stringSupplier.get();
        System.out.println(str);
    }

    public static void supplierTest2(Supplier<Integer> s){
        Integer max = s.get();
        System.out.println("最大值为:" + max);
    }
}
