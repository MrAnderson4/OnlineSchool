package com.Online_School;

public class Materials {
    public String TheTopicOfTheClass;
    public String Today_sHomework;


    public Materials(String Class_Topic, String Homework) {
        TheTopicOfTheClass = Class_Topic;
        Today_sHomework = Homework;
    }

    public void resultOfClass() {
        System.out.println("Today we went through the topic: " + TheTopicOfTheClass + ".");
        System.out.println("Today's homework is: " + Today_sHomework + ".");
    }


}
