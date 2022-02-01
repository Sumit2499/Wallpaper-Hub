package com.example.wallpapaerhub;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_Bikes extends Fragment {
    RecyclerView recyclerView;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bikes, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        context=getContext();

        ArrayList<Models> arrayList = new ArrayList<>();
        arrayList.add(new Models("https://wallpapercave.com/wp/wp4843445.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4307456.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4843430.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4808071.jpg"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1608461688075-127d0f2deba2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NzJ8fG1vdG9yY3ljbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp4180461.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp8599272.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp9054528.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp2187939.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp4843400.jpg"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1609630875171-b1321377ee65?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8bW90b3JiaWtlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp8506403.jpg"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1588627541420-fce3f661b779?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bW90b3JjeWNsZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1591791423917-04af7edc8b0d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fG1vdG9yY3ljbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1590506995460-d0d9892b54da?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fG1vdG9yY3ljbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1604483067049-dedef5afb913?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzR8fG1vdG9yY3ljbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));




        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList, context);
        recyclerView.setAdapter(recyclerAdapter);

        return view;
    }

}