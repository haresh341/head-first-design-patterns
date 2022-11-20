package tech.hareshub.strategy;

public class King extends Character{

    public King(WeaponBehavior behavior) {
        this.weaponBehavior = behavior;
    }

    @Override
    public void fight() {
        System.out.println("king is fighting..");
        this.weaponBehavior.useWeapon();
    }
}
