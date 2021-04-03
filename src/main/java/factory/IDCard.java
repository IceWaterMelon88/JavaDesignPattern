package factory;

public class IDCard implements Product{
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "'s Use the owner's ID card.");
    }
}
