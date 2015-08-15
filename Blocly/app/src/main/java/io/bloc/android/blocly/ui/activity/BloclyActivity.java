package io.bloc.android.blocly.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.ui.adapter.ItemAdapter;

/**
 * Created by Kevin on 7/26/2015.
 */

public class BloclyActivity extends AppCompatActivity {
private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blocly_activity);
        //TextView tv = (TextView) findViewById(R.id.myfavfeed);
        //tv.setText("ESPN");
       // Toast.makeText(this,
       // BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
        //        Toast.LENGTH_LONG).show();
        itemAdapter = new ItemAdapter();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);
    }
}












