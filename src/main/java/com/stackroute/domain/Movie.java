package com.stackroute.domain;

public class Movie {

   private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void display(){


        System.out.println("Actor name: "+actor.getName()+"\nAge : "+actor.getAge()+"\nGender: "+actor.getGender());
    }
}
