package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private ImageView imgBookImage;
    private TextView txtBookName, txtBookAuthor, txtBookPages, txtShortDiscription, txtLongDiscription;
    private Button btnAddToWantToRead, btnAddToAlreadyRead, btnAddToCurrentlyReading, btnAddToFavourite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();
        Book book = new Book(2,"Your name","Makoto Shinkai",1200,"https://static-01.daraz.com.bd/p/6bad19f2df7a55d366b5a342fea31c43.jpg","Romance","Awesome");

        setData(book);

    }

    private void setData(Book book)
    {
        txtBookName.setText(book.getName());
        txtBookAuthor.setText(book.getAuthor());
        txtBookPages.setText(String.valueOf(book.getPages()));
        txtShortDiscription.setText(book.getShortDesc());
        txtLongDiscription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap()
                .load(book.getImageUrl())
                .into(imgBookImage);
    }
    private void initViews(){
        imgBookImage = findViewById(R.id.imgBookImage);
        txtBookName = findViewById(R.id.txtBookName);
        txtBookAuthor = findViewById(R.id.txtBookAuthor);
        txtBookPages = findViewById(R.id.txtBookPages);
        txtShortDiscription = findViewById(R.id.txtShortDescription);

        btnAddToWantToRead = findViewById(R.id.btnAddToWantToRead);
        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToFavourite = findViewById(R.id.btnAddToFavourite);
    }
}