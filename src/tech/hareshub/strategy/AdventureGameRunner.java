package tech.hareshub.strategy;

public class AdventureGameRunner {
    public static void main(String[] args) {
        Character king = new King(new KnifeBehavior());
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
