package com.example.memoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MemoAdapter extends RecyclerView.Adapter<MemoViewHolder> {
    private Context mContext;
    private List<MemoData> myMemoList;

    public MemoAdapter(Context mContext, List<MemoData> myMemoList) {
        this.mContext = mContext;
        this.myMemoList = myMemoList;
    }

    @Override
    public MemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.memo_item, parent, false);
        return new MemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MemoViewHolder holder, int position) {
        holder.memoTitle.setText(myMemoList.get(position).getMemoTitle());
        holder.memoDescription.setText(myMemoList.get(position).getMemoDescription());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MemoDetails.class);
                intent.putExtra("Title", myMemoList.get(holder.getAdapterPosition()).getMemoTitle());;
                intent.putExtra("Description", myMemoList.get(holder.getAdapterPosition()).getMemoDescription());
                intent.putExtra("Details", myMemoList.get(holder.getAdapterPosition()).getMemoDetails());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myMemoList.size();
    }
}

class MemoViewHolder extends RecyclerView.ViewHolder {
    TextView memoTitle;
    TextView memoDescription;
    CardView mCardView;

    public MemoViewHolder(View itemView) {
        super(itemView);

        memoTitle = itemView.findViewById(R.id.txtTitle);
        memoDescription = itemView.findViewById(R.id.txtDescription);

        mCardView = itemView.findViewById(R.id.cardView);
    }
}
