package com.example.tugaskelompokbarnesyandixiirpl3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskelompokbarnesyandixiirpl3.R;
import com.example.tugaskelompokbarnesyandixiirpl3.model.ListDB;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.UserViewHolder> {

    Context context;
    OnUserClickListener listener;

    List<ListDB> listPersonInfo;
    public RecyclerviewAdapter(Context context, List<ListDB> listPersonInfo, OnUserClickListener listener){
        this.context=context;
        this.listPersonInfo=listPersonInfo;
        this.listener=listener;
    }
    public interface OnUserClickListener{
        void onUserClick(ListDB currentPerson, String action);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row_item,parent,false);
        UserViewHolder userViewHolder=new UserViewHolder(view);

        return userViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, final int position){

        final ListDB currentPerson=listPersonInfo.get(position);
        holder.ctxtNomor.setText(currentPerson.getNomor());
        holder.ctxtAge.setText(currentPerson.getTanggal());
        holder.ctxtJenkel.setText(currentPerson.getJenis_kelamin());
        holder.ctxtAddress.setText(currentPerson.getAlamat());

    }

    @Override
    public int getItemCount() {
        return listPersonInfo.size();
    }
    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView ctxtAge,ctxtName,ctxtNomor,ctxtJenkel, ctxtAddress;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ctxtNomor=itemView.findViewById(R.id.);
            ctxtName=itemView.findViewById(R.id.txtName);
            ctxtAge=itemView.findViewById(R.id.txtC);
            ctxtJenkel=itemView.findViewById(R.id.txtD);
            ctxtAddress=itemView.findViewById(R.id.txtE);

        }
    }
}
