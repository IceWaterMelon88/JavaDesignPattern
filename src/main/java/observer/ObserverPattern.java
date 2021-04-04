package observer;

public class ObserverPattern {

    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator();
        
        Observer observer1 = new DigitObsercer();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for (int i = 0; i < number; i++) {
                System.out.print("=");
            }
            System.out.println();
        };
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);

        generator.execute();
        generator.execute();
    }
}
