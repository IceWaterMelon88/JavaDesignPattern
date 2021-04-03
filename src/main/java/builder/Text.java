package builder;

import java.util.Arrays;

public class Text {

    private String text;

    public void getText() {
        System.out.println(text);
    }
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static class Builder{
        private String title;
        private String content;
        private String[] items;

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setContent(String content){
            this.content = content;
            return this;
        }

        public Builder setItems(String... items){
            this.items = items;
            return this;
        }

        public Text build(){
            Text text = new Text();
            StringBuffer sb = new StringBuffer();
            sb
                    .append("title : " ).append(title).append("\n")
                    .append("content : ").append(content).append("\n")
                    .append("items : ").append("\n");
            for (String item : items){
                sb.append(" - ").append(item).append("\n");
            }
            text.setText(sb.toString());
            return text;
        }

    }
}
