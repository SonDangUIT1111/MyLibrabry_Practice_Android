package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {
    public static final String BOOK_ID_KEY = "bookId";

    private ImageView imgBookImage;
    private TextView txtBookName, txtBookAuthor, txtBookPages, txtShortDiscription, txtLongDiscription;
    private Button btnAddToWantToRead, btnAddToAlreadyRead, btnAddToCurrentlyReading, btnAddToFavourite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        Intent intent = getIntent();
        if (null != intent)
        {
            int bookId = intent.getIntExtra(BOOK_ID_KEY,-1);
            if(bookId != -1)
            {
                Book incomingBook = Utils.getInstance().getBookById(bookId);
                if (null != incomingBook){
                    setData(incomingBook);
                }
            }
        }

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