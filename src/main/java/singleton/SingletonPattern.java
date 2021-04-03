package singleton;

public class SingletonPattern {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1 == singleton2){
            System.out.println("같음");
        }else{
            System.out.println("다름");
        }
    }
}
