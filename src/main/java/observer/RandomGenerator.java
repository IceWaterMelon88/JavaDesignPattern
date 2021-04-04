package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void execute(){
        Random random = new Random();
        int num = random.nextInt(50);
        observers.forEach(observer -> observer.update(num));
    }
}
