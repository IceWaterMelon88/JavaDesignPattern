package decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        new Scaffold(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new TextWidget("hello world")
                                        )
                                )
                        )
                )
        );
    }
}
