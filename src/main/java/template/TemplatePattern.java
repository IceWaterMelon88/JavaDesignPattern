package template;

public class TemplatePattern {

    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("superman");
        Monster slime = new Slime('A');
        superHero.attack(slime);
        superHero.setFlying(true);
    }
}
