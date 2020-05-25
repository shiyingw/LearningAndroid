package com.syw.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.syw.learningandroid.clickeffect.ClickEffectActivity;
import com.syw.learningandroid.permission.PermissionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonClickEffect = findViewById(R.id.btn_click_effect);
        buttonClickEffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClickEffectActivity.class);
                startActivity(intent);
            }
        });

        Button buttonRequirePermission = findViewById(R.id.btn_require_permission);
        buttonRequirePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PermissionActivity.class);
                startActivity(intent);
            }
        });

    }
}
