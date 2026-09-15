package com.busycoder.example10_generic_class_methods1;

class MyObject {

    Object myObject;

    public Object getMyObject() {
        return myObject;
    }

    public void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
}

public class A_NeedOfGenClass {
    public static void main(String[] args) {
        MyObject o = new MyObject();

    }
}