package tech.hareshub.strategy;

public class Troll extends Character{

    public Troll(WeaponBehavior behavior) {
        this.weaponBehavior = behavior;
    }

    @Override
    public void fight() {
        System.out.println("troll is fighting..");
        this.weaponBehavior.useWeapon();
    }
}
