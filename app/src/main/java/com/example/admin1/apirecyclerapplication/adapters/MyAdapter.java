package com.example.admin1.apirecyclerapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin1.apirecyclerapplication.R;
import com.example.admin1.apirecyclerapplication.models.FirstModel;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private ArrayList<FirstModel> arrayList;
    private Context context;

    public MyAdapter(ArrayList<FirstModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.recycle_api, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

       // FirstModel firstModel = arrayList.get(position);
        holder.txtRecycle.setText(arrayList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        if (arrayList.size() > 0 && arrayList != null){
            return arrayList.size();
        }
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtRecycle;

        public ViewHolder(View itemView) {
            super(itemView);

            txtRecycle = itemView.findViewById(R.id.txt_recycler);
        }
    }
}
