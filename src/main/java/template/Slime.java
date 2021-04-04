package template;

public class Slime extends Monster{

    public Slime(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println(getName() + " " + character.getName() + " Attack!!");
    }

    @Override
    public String getName() {
        return "Slime" + getPrefix();
    }


}
