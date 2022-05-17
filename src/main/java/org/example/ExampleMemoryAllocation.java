package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class ExampleMemoryAllocation {

    private ArrayList<String> arr;

    public void run() {
        arr = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            var data = UUID.randomUUID();
            arr.add(data.toString());
        }
    }
}
