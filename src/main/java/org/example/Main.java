package org.example;

import javax.xml.namespace.QName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Second commit!");

        Cat firstCat = new Cat("Барс", "бежевый", 2);
        Cat secondCat = new Cat("Мурзик", "белый", 3);


        System.out.println("данные первого кота:" + firstCat.getName() + ", " + firstCat.getColor() + ", " + firstCat.getAge());

        System.out.println("данные 2-го кота:" + secondCat.getName() + ", " + secondCat.getColor() + ", " + secondCat.getAge());
    }


}