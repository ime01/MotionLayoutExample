package com.flowz.motionlayoutexample.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.flowz.motionlayoutexample.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Main3Activity extends AppCompatActivity {
    CoordinatorLayout parent;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         parent = findViewById(R.id.parent_layout);

        BottomAppBar bar = findViewById(R.id.bottom_app_bar);
        setSupportActionBar(bar);


        new MaterialAlertDialogBuilder(this)
                .setTitle("Alert")
                .setMessage("Do you really want to go?")
                .setPositiveButton("Yes", null)
                .setNegativeButton("No", null)
                .setIcon(R.drawable.ic_control_point_black_24dp)
                .show();


//        ChangeBackgroundColourViewModel colour = new ChangeBackgroundColourViewModel();
        ChangeBackgroundColourViewModel colourViewModel = ViewModelProviders.of(this).get(ChangeBackgroundColourViewModel.class);

        final int background1 = colourViewModel.c1;
        final int background2 = colourViewModel.c2;
        final int background3 = colourViewModel.c3;



        bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main3Activity.this, "Bottom Appbar Clicked", Toast.LENGTH_LONG).show();
            }
        });

        bar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.title:
                        parent.setBackgroundColor(background1);
                        Toast.makeText(Main3Activity.this, "Title Clicked", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.edit:
                        parent.setBackgroundColor(background2);
                        Toast.makeText(Main3Activity.this, "edit Clicked", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.home:
                        parent.setBackgroundColor(background3);
                        Toast.makeText(Main3Activity.this, "Home Clicked", Toast.LENGTH_LONG).show();
                        break;
                }

                return false;
            }
        });
    }


}
