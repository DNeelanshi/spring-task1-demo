package com.stackroute.domain;

public class Movie {

   //dependency actor with getter and setter
   private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

   //fetching avot details using actor.
    public void display(){


        System.out.println("Actor name: "+actor.getName()+"\nAge : "+actor.getAge()+"\nGender: "+actor.getGender());
    }
}
