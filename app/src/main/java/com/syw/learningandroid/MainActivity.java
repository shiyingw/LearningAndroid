package com.syw.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.syw.learningandroid.camera.CameraActivity;
import com.syw.learningandroid.clickeffect.ClickEffectActivity;
import com.syw.learningandroid.permission.PermissionActivity;
import com.syw.learningandroid.transferpara.FriendBean;
import com.syw.learningandroid.transferpara.TransferParaActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonClickEffect = findViewById(R.id.btn_click_effect);
        buttonClickEffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(ClickEffectActivity.class);
            }
        });

        Button buttonRequirePermission = findViewById(R.id.btn_require_permission);
        buttonRequirePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(PermissionActivity.class);
            }
        });

        Button buttonTransferPara = findViewById(R.id.btn_transfer_para);
        buttonTransferPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransferParaActivity.class);
                String friendBeanId = getFriendId();
                // object to json
                intent.putExtra("friend_bean_list_key", friendBeanId);
                startActivity(intent);

            }
        });

        Button buttonCamera = findViewById(R.id.btn_open_camera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(CameraActivity.class);
            }
        });
    }

    private String getFriendId() {
        return "18";
    }

    private void openActivity(Class clazz){
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }
}
