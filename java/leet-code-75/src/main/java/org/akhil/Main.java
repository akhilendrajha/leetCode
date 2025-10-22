package org.akhil;

import org.akhil.arrays.strings.MergeStringsAlternatively;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to solutions!");

        //problem 1 : merge strings alternatively
        String solution = MergeStringsAlternatively.mergeAlternately("forger","mother");
        System.out.println(solution);

    }
}