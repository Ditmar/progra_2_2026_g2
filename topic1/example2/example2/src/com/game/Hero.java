package com.game;

public class Hero {
    private Double damage;
    private Double maxDamage;
    private Double minDamage;
    public Hero(Double maxDamage, Double minDamage) {
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
    }
    public Damage generateDamage() { 
        Double seek = Math.random();
        this.damage = seek * this.maxDamage + this.minDamage;
        this.damage = (double)Math.round(Math.min(damage, 100.0));
        Damage damage = new Damage(seek, this.damage);
        return damage;
    }
}
