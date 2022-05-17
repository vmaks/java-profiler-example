package org.example;

import java.util.ArrayList;

public class ExampleMemoryLeak {

    private ArrayList<ArrayList<Long>> arr;

    public void run() {
        arr = new ArrayList<>();
        while (true) {
            arr.add(new ArrayList<>(10_000_000));
        }
    }
}
