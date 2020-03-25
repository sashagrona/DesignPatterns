package my.patterns;

import my.patterns.facade.TextFacade;

public class Main {

    public static void main(String[] args) {
        System.out.println(TextFacade.compress("This is text"));
    }
}
