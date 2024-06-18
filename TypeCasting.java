package com.trainingmug.java;

public class TypeCasting {
    public static void main(String[] args) {
        byte age;
        age = 30;
        int ageValue;
        ageValue = (int)age;


        float value;
        value = 23.2565f;
        int intValue;
        intValue = (int)value;
        System.out.println(intValue);


        ageValue = 130;
        age = (byte) ageValue;
        System.out.println("Age : " + age); //-126(data lossed)

    }


}
