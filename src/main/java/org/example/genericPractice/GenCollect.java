package org.example.genericPractice;
import java.util.ArrayList;
import java.util.List;
public class GenCollect <T> {


    T circle;

    public GenCollect(T circle) {
        this.circle = circle;

    }

    public void task() {
        if (circle instanceof String) {
            System.out.println("length of string: " + (((String) this.circle).length()));
        } else if (circle instanceof Integer) {
            System.out.println("This is integer value" + circle);

        }
    }

    public T getCircle() {
        return this.circle;
    }

    public static void main(String[] args) {
        GenCollect<String> gen = new GenCollect<>("hello");
        System.out.println(gen.getCircle());
        System.out.println(gen.circle.getClass().getName());   // will display java.lang.String


        GenCollect<Integer> gen1 = new GenCollect<>(14);
        System.out.println(gen1.getCircle());
        System.out.println(gen1.circle.getClass().getName());

        gen.task();
        gen1.task();
    }

}
//            private T data;
//
//            public GenCollect(T data) {
//                this.data = data;
//            }
//
//            public T getData() {
//                return data;
//            }
//
//            public static void main(String[] args) {
//                List<GenCollect<String>> list = new ArrayList<GenCollect<String>>();   //
//                GenCollect<String> obj1 = new GenCollect<String>("Hello");
//                GenCollect<String> obj2 = new GenCollect<String>("World");
//                list.add(obj1);
//                list.add(obj2);
//
//                for (GenCollect<String> obj : list) {
//                    System.out.println(obj.getData());
//                }
//            }

