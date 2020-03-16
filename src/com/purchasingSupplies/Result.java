package com.purchasingSupplies;

import java.util.Arrays;
import java.util.List;


public class Result {
    public static void main(String[] args) {
        List<String> scenarios = Arrays.asList("8 4 2", "6 2 2");
        Result.maximumContainers(scenarios);
    }
    public static void maximumContainers(List<String> scenarios) {
        String delimiter = " ";

        for (String scenario : scenarios) {
            String[] values = scenario.split(delimiter);
            int n = Integer.parseInt(values[0]);
            int cost = Integer.parseInt(values[1]);
            int m = Integer.parseInt(values[2]);
            int containers = n / cost;

            if (containers / m > 0) {
                int x =containers / m;
                int y = containers % m;
                int z = x + y;
                containers = containers + x ;

                if (z >= m) {
                    containers = containers + (z / m);
                }
            }
            System.out.println(containers);
        }
    }


}
