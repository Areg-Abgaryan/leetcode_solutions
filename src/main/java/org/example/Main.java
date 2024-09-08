/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example;

import org.example.demo.DemoArrayProblems;
import org.example.demo.DemoIntegerProblems;
import org.example.demo.DemoListProblems;
import org.example.demo.DemoMapProblems;
import org.example.demo.DemoSetProblems;
import org.example.demo.DemoStringProblems;
import org.example.demo.DemoTreeProblems;

public class Main {

    public static void main(String[] args) {
        DemoIntegerProblems.demo();
        DemoStringProblems.demo();
        DemoArrayProblems.demo();
        DemoListProblems.demo();
        DemoSetProblems.demo();
        DemoMapProblems.demo();
        DemoTreeProblems.demo();
    }
}