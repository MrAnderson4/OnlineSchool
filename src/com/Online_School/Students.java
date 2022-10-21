package com.Online_School;

public class Students {
    //    Students
    public String NameOfStudent;
    public String SurnameOfStudent;
    int AgeOfStudent;
    int ID = 0;
    public Students (String name, String surname, int age) {
        NameOfStudent = name;
        SurnameOfStudent = surname;
        AgeOfStudent = age;
        ID++;
    }
        public void StudentsInfo () {
        System.out.println("Students present today" + ": ");
        System.out.println(NameOfStudent + " " + SurnameOfStudent + ", " +
                AgeOfStudent + " years old ");
    }
    public void StudentsInfoO ()
    {
        System.out.println(NameOfStudent + " " + SurnameOfStudent + ", " + AgeOfStudent + " years old ");
    }
}
