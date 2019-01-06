package com.company;

public class Main {

    public static void main(String[] args) {
        Members object1 = new Members();
        Members object2 = new Members("Ana");
        Members object3 = new Members(12);
        Members object4 = new Members("Ana", 12);

        object1.printValues();
        object2.printValues();
        object3.printValues();
        object4.printValues();

    }
}
