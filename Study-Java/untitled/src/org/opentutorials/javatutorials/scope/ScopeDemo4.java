package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
    static void a() {
        String title = "Coding Everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
    }
}
