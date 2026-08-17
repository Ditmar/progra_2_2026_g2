package com.game;

public class Damage {
    private Double genRandom;
    private Double damage;
    public Damage(Double genRandom, Double damage) {
        this.genRandom = genRandom;
        this.damage = damage;
    }
    public Double getDamage() {
        return damage;
    }
    public Double getGenRandom() {
        return genRandom;
    }
}
