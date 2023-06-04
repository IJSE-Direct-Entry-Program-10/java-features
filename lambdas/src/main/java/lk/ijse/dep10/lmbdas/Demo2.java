package lk.ijse.dep10.lmbdas;

public class Demo2 {

    public static void main(String[] args) {
//        BiFunction add = new BiFunction() {
//            @Override
//            public int calc(int x, int y) {
//                return x + y;
//            }
//        };
        java.util.function.BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        System.out.println(add.apply(10, 20));
        System.out.println(add.apply(30, 40));
        System.out.println(add.apply(50, 50));

        BiFunction myFun = (x, y) -> x * x + 2 * x + y;

        System.out.println(myFun.calc(5,5));
        System.out.println(myFun.calc(7,8));
        System.out.println(myFun.calc(2,2));
    }

    public static void add(BiFunction add){
        System.out.println(add.calc(20 , 30));
    }
}
