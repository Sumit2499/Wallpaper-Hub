package com.example.wallpapaerhub;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Fragment_car extends Fragment {
    RecyclerView recyclerView;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bikes, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        context=getContext();



        ArrayList<Models> arrayList = new ArrayList<>();
        arrayList.add(new Models("https://images.pexels.com/photos/6640212/pexels-photo-6640212.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        arrayList.add(new Models("https://images.pexels.com/photos/10182596/pexels-photo-10182596.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        arrayList.add(new Models("https://images.pexels.com/photos/9845404/pexels-photo-9845404.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        arrayList.add(new Models("https://images.pexels.com/photos/6732611/pexels-photo-6732611.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        arrayList.add(new Models("https://images.pexels.com/photos/7395326/pexels-photo-7395326.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        arrayList.add(new Models("https://images.pexels.com/photos/7394782/pexels-photo-7394782.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        arrayList.add(new Models("https://images.pexels.com/photos/9845371/pexels-photo-9845371.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1516298252535-cf2ac5147f9b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8c3BvcnRzJTIwY2FyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1625231334168-35067f8853ed?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fHNwb3J0cyUyMGNhcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1542362567-b07e54358753?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fHNwb3J0cyUyMGNhcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1614610767572-89b84742a2f8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzB8fHNwb3J0cyUyMGNhcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1535063130681-0fe292a3524b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NzZ8fHNwb3J0cyUyMGNhcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1628883714122-3b6ffeaf8f65?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8ODd8fHNwb3J0cyUyMGNhcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1606222742864-7c09da77e0ca?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTAzfHxzcG9ydHMlMjBjYXJ8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1623658432592-5826662b3547?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1588296713236-dbd3e3c69a45?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTE3fHxzcG9ydHMlMjBjYXJ8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));



        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList, context);
        recyclerView.setAdapter(recyclerAdapter);

        return view;
    }
}