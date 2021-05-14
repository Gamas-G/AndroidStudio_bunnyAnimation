package com.example.bunny_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    AnimationDrawable animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Animación");

        Button btn = (Button)findViewById(R.id.btn);
        Button btn2 = (Button)findViewById(R.id.btn2);
        ImageView image = (ImageView) findViewById(R.id.bunny_imageView);

        image.setBackgroundResource(R.drawable.animation_bunny);

        animation = (AnimationDrawable) image.getBackground();


        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn){
            animation.start();
        }
        else{
            animation.stop();
        }

    }
}