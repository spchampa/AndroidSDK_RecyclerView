package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        // need to create an adapter for the recycler view

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Steve Champ", "steve@gmail.com", "https://i.pinimg.com/originals/32/34/eb/3234ebe4bf8fd04402c540d912ee8fdd.jpg"));
        contacts.add(new Contact("Joe Cobbles", "joe@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/e/e5/Joe_Biden_%2848554137807%29.jpg"));
        contacts.add(new Contact("Samantha Jones", "sam@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Samantha_At_The_Irumbu_Thirai_Trailer_Launch.jpg/800px-Samantha_At_The_Irumbu_Thirai_Trailer_Launch.jpg"));
        contacts.add(new Contact("Marty McFly", "marty@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/a/a2/Mosrod_Profile_Picture.jpg"));
        contacts.add(new Contact("Tammy Globber", "tammy@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/a/a2/Mosrod_Profile_Picture.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}