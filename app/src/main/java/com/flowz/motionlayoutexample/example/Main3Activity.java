package com.flowz.motionlayoutexample.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.flowz.motionlayoutexample.MainActivity;
import com.flowz.motionlayoutexample.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Main3Activity extends AppCompatActivity {
    ImageView pic;
    ConstraintLayout parent_layout;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar bar = findViewById(R.id.bottom_app_bar);
        setSupportActionBar(bar);


        new MaterialAlertDialogBuilder(this)
                .setTitle("Alert")
                .setMessage("Do you really want to go?")
                .setPositiveButton("Yes", null)
                .setNegativeButton("No", null)
                .setIcon(R.drawable.ic_control_point_black_24dp)
                .show();


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
                        Toast.makeText(Main3Activity.this, "Title Clicked", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.edit:
                        Toast.makeText(Main3Activity.this, "edit Clicked", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.home:
                        Toast.makeText(Main3Activity.this, "Home Clicked", Toast.LENGTH_LONG).show();
                        break;
                }

                return false;
            }
        });
    }


}
