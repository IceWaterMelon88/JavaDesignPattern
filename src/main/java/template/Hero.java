package template;

public abstract class Hero implements Character {

    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
