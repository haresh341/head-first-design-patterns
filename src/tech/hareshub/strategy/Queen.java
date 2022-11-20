package tech.hareshub.strategy;

public class Queen extends Character{
    public Queen(WeaponBehavior behavior) {
        this.weaponBehavior = behavior;
    }

    @Override
    public void fight() {
        System.out.println("queen is fighting..");
        this.weaponBehavior.useWeapon();
    }
}
