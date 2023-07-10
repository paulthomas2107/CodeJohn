package com.pault.example;

public class InnerClassDemo {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        outer.hello();
        inner.bye();
    }
}

class OuterClass {
    int num = 6;
    public void hello() {
        System.out.println("Hello " + num);
        class LocalInnerClass {
            void stuff() {
                System.out.println("Doing stuff");
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.stuff();

    }
    public static class InnerClass {
        public void bye() {
            System.out.println("Bye");
        }
    }
}