package io.drandarov.playground.jvm.java;

import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();

        stringVector.add("A");
        stringVector.add("C");
        stringVector.add("H");

        System.out.println(stringVector.get(1));
    }

}
