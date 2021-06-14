package com.example.customui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Toast;

import com.example.customui.Adapter.Adapter_menu_list_item_navigation;
import com.example.customui.Model.itemModel;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    LinearLayoutManager layoutManager;
    RecyclerView Menu_List_item_Navigation;
    Adapter_menu_list_item_navigation nav_adapter;
    ArrayList<itemModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        //close or open toggel

        navigationView.setItemIconTintList(null);// null color or icon navigation
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                setNavigationView(navigationView);
                switch (item.getItemId()) {

                }
                drawerLayout.closeDrawers();
                return true;
            }
        });

        Menu_List_item_Navigation = findViewById(R.id.list);

        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();
        itemModel.setTitle("Software");
        itemModel.seticon(R.drawable.ic_icon);

        itemModel itemMode1 = new itemModel();
        itemMode1.setTitle("Design");
        itemMode1.seticon(R.drawable.ic_icon);

        itemModel itemMode2 = new itemModel();
        itemMode2.setTitle("Design");
        itemMode2.seticon(R.drawable.ic_icon);

        itemModel itemMode3 = new itemModel();
        itemMode3.setTitle("Design");
        itemMode3.seticon(R.drawable.ic_icon);

        itemModel itemMode4 = new itemModel();
        itemMode4.setTitle("Design");
        itemMode4.seticon(R.drawable.ic_icon);

        itemModel itemMode5 = new itemModel();
        itemMode5.setTitle("Design");
        itemMode5.seticon(R.drawable.ic_icon);

        itemModel itemMode6 = new itemModel();
        itemMode6.setTitle("Design");
        itemMode6.seticon(R.drawable.ic_icon);

        itemModel itemMode7 = new itemModel();
        itemMode7.setTitle("Design");
        itemMode7.seticon(R.drawable.ic_icon);

        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);
        arrayList.add(itemMode4);
        arrayList.add(itemMode5);
        arrayList.add(itemMode6);
        arrayList.add(itemMode7);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        Menu_List_item_Navigation.setLayoutManager(layoutManager);
        Menu_List_item_Navigation.setHasFixedSize(true);
        nav_adapter = new Adapter_menu_list_item_navigation(this, arrayList);
        Menu_List_item_Navigation.setAdapter(nav_adapter);

    }


    private void setNavigationView(NavigationView navigationView) {
        if (navigationView != null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
            if (navigationMenuView != null) {
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Toast.makeText(this, "", id + Toast.LENGTH_SHORT).show();
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


}