package model;


import java.util.Date;

public class Article extends  TextElement{

    private Category category;
    private int rating;
    private String title;

    Article(long id, String nameUser, Date date, String body, Category category, int rating, String title) {
        super(id, nameUser, date, body);
        this.category = category;
        this.rating = rating;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
