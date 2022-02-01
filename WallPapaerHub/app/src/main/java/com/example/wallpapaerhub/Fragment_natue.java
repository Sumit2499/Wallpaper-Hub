package com.example.wallpapaerhub;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_natue extends Fragment {
    RecyclerView recyclerView;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bikes, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        context = getContext();

        ArrayList<Models> arrayList = new ArrayList<>();
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4908257.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4697602.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4908151.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7166433.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp4801693.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/dwp1x/wp2419351.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168121.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168022.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168025.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp5633692.jpg"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1540206395-68808572332f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fG5hdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60  "));
        arrayList.add(new Models("https://images.unsplash.com/photo-1547036967-23d11aacaee0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mzl8fG5hdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1513836279014-a89f7a76ae86?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDZ8fG5hdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1533038590840-1cde6e668a91?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NjZ8fG5hdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1579033461380-adb47c3eb938?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTV8fG5hdHVyZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1472396961693-142e6e269027?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTEwfHxuYXR1cmV8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1541617219835-3689726fa8e7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTE3fHxuYXR1cmV8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1622914845616-92f1775ce47d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTI1fHxuYXR1cmV8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1507908708918-778587c9e563?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTU2fHxuYXR1cmV8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60"));



        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList, context);
        recyclerView.setAdapter(recyclerAdapter);


        return view;
    }
}