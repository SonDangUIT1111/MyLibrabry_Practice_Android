package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecViews);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"Suzume no tojimari","Makoto Shinkai",1200,"https://upload.wikimedia.org/wikipedia/vi/thumb/5/51/Suzume_no_Tojimari.tiff/lossy-page1-640px-Suzume_no_Tojimari.tiff.jpg","Romance","Awesome"));
        adapter.setBooks(books);
    }
}