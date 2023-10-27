package main.model;

public class Review {

    private String text;

    @Override
    public String toString() {
        return "Review{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
