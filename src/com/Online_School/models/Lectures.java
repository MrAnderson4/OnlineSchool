package com.Online_School.models;

import com.Online_School.models.Course;
import org.w3c.dom.css.Counter;

public class Lectures
    {
        public static int IDStatic;
       public int ID;
        public int CourseID;

        public final String CHEMISTRY = "Chemistry";
        public final String ATHLETICS = "Athletics";


        public void resultC () {
            System.out.println("The name of the course is: " + CHEMISTRY);
        }
        public void resultA () {
            System.out.println("The name of the course is: " + ATHLETICS);
        }

        public Lectures (int ID, int courseID){
        this.ID = ID;
        this.CourseID = courseID;
        ++IDStatic;
        }
        public void amountLec()
        {
            System.out.println(ID);
            System.out.println(IDStatic);
        }
    }

