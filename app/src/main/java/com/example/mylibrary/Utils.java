package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> favouriteBooks;

    private Utils() {
        if (null == allBooks)
        {
            allBooks = new ArrayList<>();
            initData();
        }
        if (null == alreadyReadBooks)
        {
            alreadyReadBooks = new ArrayList<>();
        }
        if (null == wantToReadBooks)
        {
            wantToReadBooks = new ArrayList<>();
        }
        if (null == favouriteBooks)
        {
            favouriteBooks = new ArrayList<>();
        }
        if (null == currentlyReadBooks)
        {
            currentlyReadBooks = new ArrayList<>();
        }
    }

    private void initData(){
        allBooks.add(new Book(1,"Suzume no tojimari","Makoto Shinkai",1200,"https://upload.wikimedia.org/wikipedia/vi/thumb/5/51/Suzume_no_Tojimari.tiff/lossy-page1-640px-Suzume_no_Tojimari.tiff.jpg","Romance","Awesome"));
        allBooks.add(new Book(2,"Your name","Makoto Shinkai",1200,"https://static-01.daraz.com.bd/p/6bad19f2df7a55d366b5a342fea31c43.jpg","Romance","Awesome"));
    }

    public static Utils getInstance() {
        if (null != instance)
        {
            return instance;
        }
        else {
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getFavouriteBooks() {
        return favouriteBooks;
    }

    public static ArrayList<Book> getCurrentlyReadBooks() {
        return currentlyReadBooks;
    }


    public Book getBookById(int id)
    {
        for (Book b: allBooks)
        {
            if (b.getId() == id )
            {
                return b;
            }
        }
        return null;
    }

    public boolean addToAlreadyRead(Book book){
        return alreadyReadBooks.add(book);
    }
    public boolean addToWantToRead(Book book){
        return wantToReadBooks.add(book);
    }
    public boolean addToCurrentlyRead(Book book){
        return currentlyReadBooks.add(book);
    }
    public boolean addToFavouriteRead(Book book){
        return favouriteBooks.add(book);
    }
}
