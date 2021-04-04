package observer;

public class DigitObsercer implements Observer{

    @Override
    public void update(int number) {
        System.out.println("number : " + number);
    }
}
