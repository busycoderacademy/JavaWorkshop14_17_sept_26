package com.threads.session2.classical_threads;

 class Singleton {
     private static Singleton instance;

     public static Singleton getInstance() {
         if (instance == null) {        // 1st check
             synchronized (Singleton.class) {
                 if (instance == null) { // 2nd check
                     instance = new Singleton();
                 }
             }
         }
         return instance;
     }
 }
public class E_Singleton {
    public static void main(String[] args) {

    }
}
