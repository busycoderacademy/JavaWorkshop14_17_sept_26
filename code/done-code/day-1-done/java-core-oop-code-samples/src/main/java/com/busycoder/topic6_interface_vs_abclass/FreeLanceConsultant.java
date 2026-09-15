package com.busycoder.topic6_interface_vs_abclass;

public class FreeLanceConsultant  implements Payable {
    private String name;
    private String invoice;

    public void payable() {
        System.out.println(name + " gets a fixed monthly salary.");
    }
}