package tech.hareshub.strategy;

public class Knight extends Character{

    @Override
    public void fight() {
        System.out.println("knight is fighting..");
        this.weaponBehavior.useWeapon();
    }
}
