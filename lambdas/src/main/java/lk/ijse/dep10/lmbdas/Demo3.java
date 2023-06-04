package lk.ijse.dep10.lmbdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo3 {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("ijse");
        print.accept("test");
        print.accept("something");

        BiConsumer<String, String> printSnakeCase = (x, y) -> System.out.println(x + "_" + y);

        printSnakeCase.accept("my", "customer");
        printSnakeCase.accept("hello", "ijse");
        printSnakeCase.accept("test", "something");
    }
}
