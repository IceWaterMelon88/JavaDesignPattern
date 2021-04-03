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

        Product idCard4 = IDCard.Factory.create("Park");
        Product idCard5 = IDCard.Factory.create("Watermelon");
        Product idCard6 = IDCard.Factory.create("Ice");
        idCard4.use();
        idCard5.use();
        idCard6.use();

    }
}
