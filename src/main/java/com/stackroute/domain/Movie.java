package com.stackroute.domain;

public class Movie {

   private Actor actorr;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actorr +
                '}';
    }

    public Actor getActorr() {
        return actorr;
    }

    public void setActorr(Actor actorr) {
        this.actorr = actorr;
    }
}

