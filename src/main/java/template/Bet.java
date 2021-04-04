package template;

public class Bet extends Monster{

    public Bet(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println(getName() + " " + character.getName() + " Attack!!");
    }

    @Override
    public String getName() {
        return "Bet" + getPrefix();
    }

}
