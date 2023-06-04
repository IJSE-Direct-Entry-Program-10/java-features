package lk.ijse.dep10.lmbdas;

import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {
        Function<Integer, Integer> power = x -> x * x;
        System.out.println(power.apply(2));
        System.out.println(power.apply(5));
        System.out.println(power.apply(10));
        System.out.println(power.apply(15));
    }
}
