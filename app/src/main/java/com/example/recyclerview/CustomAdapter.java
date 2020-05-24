package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private List<Parents> myData;
    private Context context;

    CustomAdapter(Context context, List<Parents> myData) {
        this.context=context;
        this.myData = myData;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(myData.get(position));
       Parents par=myData.get(position);
       holder.text1.setText(par.getText());
       holder.text2.setText(par.getText2());
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1,text2;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1=itemView.findViewById(R.id.text);
            text2=itemView.findViewById(R.id.text2);
        }
    }
}
