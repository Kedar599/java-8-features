package GerericInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> c=(i)->{
            System.out.println(i);
        };
        c.accept(23);
    }
}
