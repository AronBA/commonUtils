package dev.aronba.commonutils;

import dev.aronba.commonutils.string.Text;

public class Main {
    public static void main(String[] args) {


        Text text = new Text("Hello World! \n this is line 2 \n this is line 3");

        System.out.println(text.getLine(2).getWord(3));

    }
}
