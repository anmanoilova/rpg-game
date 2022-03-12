package org.anmanoilova.theGame;

import java.util.UUID;

public class Orc {

    private UUID id;

    private Elf elf;

    private Integer health;

    private Integer armor;

    private Integer minDamage;

    private Integer maxDamage;

    public Orc(UUID id,Integer health, Integer armor, Integer minDamage, Integer maxDamage) {
        this.id = id;
        this.health = health;
        this.armor = armor;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;

    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public UUID getId() {
        return id;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getArmor() {
        return armor;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }


    public Integer getMinDamage() {
        return minDamage;
    }
}
