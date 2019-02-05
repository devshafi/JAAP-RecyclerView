package com.recyclerview.recyclerview.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.recyclerview.recyclerview.R;
import com.recyclerview.recyclerview.adapter.UserAdapter;
import com.recyclerview.recyclerview.model.User;
import com.recyclerview.recyclerview.utils.UserData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvUser;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        rvUser = findViewById(R.id.rvUser);
        ArrayList<User> userArrayList = UserData.generateUserList();
        userAdapter = new UserAdapter(this,userArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        //StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,VERTICAL);

//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
//        rvUser.addItemDecoration(dividerItemDecoration);
        rvUser.setLayoutManager(linearLayoutManager);
        rvUser.setAdapter(userAdapter);





    }
}
