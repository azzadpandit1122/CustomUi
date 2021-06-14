package com.example.customui.Adapter;

import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.customui.MainActivity;
import com.example.customui.Model.itemModel;
import com.example.customui.R;
import com.example.customui.f1;

import java.util.ArrayList;

public class Adapter_menu_list_item_navigation extends RecyclerView.Adapter<Adapter_menu_list_item_navigation.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    int lastPosition = -1;
    public Adapter_menu_list_item_navigation(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        TextView rowZoneName;
        ImageView rowZoneImage;
        View row_view;

        public ViewHolder(View itemView) {
            super(itemView);
            rowZoneName = itemView.findViewById(R.id.textView3);
            rowZoneImage = itemView.findViewById(R.id.imageView2);
            row_view = itemView.findViewById(R.id.view);
            context = itemView.getContext();
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_menu_list_item_navigation, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.rowZoneName.setText(arrayList.get(position).getTitle());
        holder.rowZoneImage.setImageResource(arrayList.get(position).geticon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity)v.getContext();
                f1 demofregment = new f1();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,demofregment).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

