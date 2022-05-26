package com.caotuyen.btvn3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);

        userAdapter = new UserAdapter(getListUser());
        rcvData.setAdapter(userAdapter);
    }

    private List<User> getListUser() {


        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.imgfile,"Video"));

        list.add(new User(R.drawable.imgfile,"Android"));

        list.add(new User(R.drawable.imgfile,"Applock"));
        list.add(new User(R.drawable.imgfile,"Books"));

        list.add(new User(R.drawable.imgfile,"Map"));

        list.add(new User(R.drawable.imgfile,"Authenticate Using Google.."));

        list.add(new User(R.drawable.imgfile,"New folder"));

        list.add(new User(R.drawable.imgfile,"New folder1"));



        return list;

    }

}