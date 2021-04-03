package builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Text text = new Text.Builder()
                .setTitle("Hello")
                .setContent("Content")
                .setItems("item1", "item2", "item3")
                .build();
        text.getText();
    }

}
