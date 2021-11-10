package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CampusAdapter extends RecyclerView.Adapter<CampusAdapter.MyViewHolder> {

    public CampusAdapter(Context mContext, List<CampusModel> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    public Context mContext;
    public List<CampusModel> mList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_recycler_campus,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder._campusText.setText(mList.get(position).getCampus_name());
        holder._campusImage.setImageResource(mList.get(position).getCampus_image());

        if(!(position <= 1) ){
        holder._campusSpace.setVisibility(View.GONE);
        }

        holder.setListener(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView _campusImage;
        TextView _campusText,_campusSpace;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            _campusImage = itemView.findViewById(R.id.campus_img);
            _campusText = itemView.findViewById(R.id.campus_text);
            _campusSpace = itemView.findViewById(R.id.campus_areaSpace);
        }

        public void setListener(int position) {
            itemView.setOnClickListener(view -> {
                Intent i = new Intent(mContext, ViewImage.class);
                int itemPosition = getLayoutPosition();
                i.putExtra("position", itemPosition );
                i.putExtra("name", mList.get(position).getCampus_name());
                i.putExtra("image", mList.get(position).getCampus_image());
                mContext.startActivity(i);
            });
        }
    }
}
