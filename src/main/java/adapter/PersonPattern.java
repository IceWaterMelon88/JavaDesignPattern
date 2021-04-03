package adapter;

public class PersonPattern {

    public static void main(String[] args) {
        Person person = new Person("Park", 30);
        PersonAdapter adapter = new PersonAdapter(person);
        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());
    }
}
