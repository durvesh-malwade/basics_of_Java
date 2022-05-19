package com.durvesh.interfaces;

import com.durvesh.access.A;

public class subclass extends A {

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass sub = new subclass(10,"kunal");
        System.out.println(sub.num);
    }
}
