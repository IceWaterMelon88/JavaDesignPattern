package factory;

public class FactoryPattern {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product idCard1 = factory.createProduct("Park");
        Product idCard2 = factory.createProduct("Watermelon");
        Product idCard3 = factory.createProduct("Ice");
        idCard1.use();
        idCard2.use();
        idCard3.use();
    }
}
