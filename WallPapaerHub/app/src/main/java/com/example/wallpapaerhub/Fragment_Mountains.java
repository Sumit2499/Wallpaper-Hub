package com.example.wallpapaerhub;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_Mountains extends Fragment {
    RecyclerView recyclerView;
    Context context;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bikes,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        context=getContext();

        ArrayList<Models> arrayList = new ArrayList<>();
        arrayList.add(new Models("https://wallpapercave.com/wp/wp6587777.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp4975193.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168036.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168055.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp6474407.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp6896525.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168066.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp5298978.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp5791311.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168088.jpg"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168093.png"));
        arrayList.add(new Models("https://wallpapercave.com/wp/wp7168099.jpg"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1542224566-6e85f2e6772f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8bW91bnRhaW5zfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1508913449378-01b9b8174e46?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjd8fG1vdW50YWluc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1614597396930-cd6760b99f7c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzR8fG1vdW50YWluc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1615201427548-58316e349d8a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8ODd8fG1vdW50YWluc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1613929905911-96040610a54d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTA2fHxtb3VudGFpbnN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1613929905911-96040610a54d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTA2fHxtb3VudGFpbnN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1506318195885-cad052e78271?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTU1fHxtb3VudGFpbnN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1528825994654-33b2e6d5ac5c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTY3fHxtb3VudGFpbnN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        arrayList.add(new Models("https://images.unsplash.com/photo-1471978445661-ad6ec1f5ba50?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTc1fHxtb3VudGFpbnN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));


        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(arrayList,context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(recyclerAdapter);

        return view;

    }
}