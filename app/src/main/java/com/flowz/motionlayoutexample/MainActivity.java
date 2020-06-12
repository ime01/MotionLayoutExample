package com.flowz.motionlayoutexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.flowz.motionlayoutexample.example.Main2Activity;
import com.flowz.motionlayoutexample.example.Main3Activity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ImageView pic;
    ConstraintLayout parent_layout;
    TextView title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_layout);



        pic = findViewById(R.id.header_image);
        parent_layout = findViewById(R.id.parent_layout);
        title = findViewById(R.id.title);

        Snackbar clickPic = Snackbar.make(parent_layout,"Slide down click image to open VieModel example", Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar1 =    Snackbar.make(parent_layout, "Slide down click title to open Material Design example", Snackbar.LENGTH_LONG);
                snackbar1.show();
            }
        });

        clickPic.show();



        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openViewModelExmple = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(openViewModelExmple);
            }
        });

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openViewModelExmple = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(openViewModelExmple);
            }
        });
//
    }


}
