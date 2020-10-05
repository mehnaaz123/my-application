package com.example.memoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<MemoData> myMemoList;
    MemoData myMemoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myMemoList = new ArrayList<>();

        myMemoData = new MemoData("Saturday's To Do List", "All must be done by the end of the day Saturday! If you forget, consider yourself in big trouble!", " Walk the dog\n Wash the dishes\n Do the laundry\n Read a book");
        myMemoList.add(myMemoData);

        myMemoData = new MemoData("Directions to Lia's House", "Don't forget to tell Lia about the major upcoming project you were forewarned about!", " Turn left off Number St.\n Turn right near the grocery store\n Drive Straight 10 miles\n Turn left at Sheridan Rd.");
        myMemoList.add(myMemoData);

        myMemoData = new MemoData("Important Emails", "Read emails from Cathy and Luke", "Don't forget to acknowledge the emails and tell Luke that there is a meeting tom!");
        myMemoList.add(myMemoData);

        myMemoData = new MemoData("Grocery List", "Remember to buy these on your way from the dentist appointment on Thursday!", " Milk\n Bread\n Eggs\n Bagels\n Plastic Cups\n Noodles\n Coriander\n Oregano");
        myMemoList.add(myMemoData);

        myMemoData = new MemoData("Textbooks To Buy", "Order Sadaf's textbooks for her classes this semester", " https://www.amazon.ca/Canadian-Criminal-Justice-Curt-Griffiths/dp/0176529209\n\n https://www.wiley.com/en-us/Big+Java%3A+Late+Objects%2C+1st+Edition-p-9781119626152#:~:text=Big%20Java%3A%20Late%20Objects%2C%201st%20Edition%20%7C%20Wiley,first%20course%20in%20programming%20for%20computer%20science%20students.");
        myMemoList.add(myMemoData);

        MemoAdapter mAdapter = new MemoAdapter(MainActivity.this, myMemoList);
        mRecyclerView.setAdapter(mAdapter);

    }
}