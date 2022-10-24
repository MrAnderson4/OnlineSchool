package com.Online_School.models;

public class Persons {
    //    Teachers
    public final String THE_TEACHER_OF_CHE = "Yulia Nicolaevna";
    public final String THE_TEACHER_OF_ATH = "Dmitro Sergiovich";
    public final String SPACE = " ";


    public void NameTeachers ()
    {
        System.out.println ("Teaching this course will be the teacher: " +
            THE_TEACHER_OF_CHE);
    }
    public void NameTeachersA ()
    {
        System.out.println ("Teaching this course will be the teacher: " +
                THE_TEACHER_OF_ATH);
    }
    public void Space()
    {
        System.out.println(SPACE);
        System.out.println("========================================");
        System.out.println(SPACE);
    }

}
