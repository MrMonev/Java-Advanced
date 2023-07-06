package Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {


    private String title; // Заглавие

    private int year; // Годината на издаване

    private List<String> authors; // списък с автори



    public Book(String title, int year, String... authors) {
        // Създаваме нова празна книга
        this.title = title;
        this.year = year;
        //[автори] -> {автори}
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
