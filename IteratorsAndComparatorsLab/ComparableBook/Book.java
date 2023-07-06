package ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {


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

    @Override
    public int compareTo(Book otherBook) {
        //1. Sort -> Title
        //2  Sort -> Year

        // compareTo - от String, сравняваме два текста
        int resultTitle = this.title.compareTo(otherBook.getTitle());

        // 0 -> двата текста са едвакви
        // >0 -> ако първия е по рано по азбучен ред
        // <0 -> ако втория по рано по азбучен ред

        if(resultTitle == 0) {
            // двете книги са с еднакви заглавия
            resultTitle = Integer.compare(this.year, otherBook.year);
            // Integer.compare
            // 0 -> ако годините са еднакви
            // 1 -> първата > втората
            // -1 -> втората > първата
        }
        return resultTitle;
    }
}
