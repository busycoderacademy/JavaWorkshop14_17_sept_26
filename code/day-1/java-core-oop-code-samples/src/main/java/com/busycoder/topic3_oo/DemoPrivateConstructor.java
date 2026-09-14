package com.busycoder.topic3_oo;
class Foo{
    private static Foo instance=new Foo();
    private Foo() {
        System.out.println("dare to call me, i am private constructor");
    }
    public static Foo getInstance(){
        return instance;
    }
}

public class DemoPrivateConstructor {
    public static void main(String[] args) {
//        Runtime runtime = new Runtime();

        Foo foo = Foo.getInstance();
        Foo foo2 = Foo.getInstance();
        System.out.println(foo == foo2);
    }
}

