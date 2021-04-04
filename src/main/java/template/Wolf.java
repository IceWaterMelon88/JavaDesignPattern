package template;

public class Wolf extends Monster{

    public Wolf(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println(getName() + " " + character.getName() + " Attack!!");
    }

    @Override
    public String getName() {
        return "Wolf" + getPrefix();
    }

}
