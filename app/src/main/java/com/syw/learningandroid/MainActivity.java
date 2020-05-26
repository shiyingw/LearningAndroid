package com.syw.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.syw.learningandroid.camera.CameraFragment;
import com.syw.learningandroid.clickeffect.ClickEffectFragment;
import com.syw.learningandroid.fragment.LearningFragment;
import com.syw.learningandroid.fragment.SingleFragmentActivity;
import com.syw.learningandroid.permission.PermissionFragment;
import com.syw.learningandroid.transferpara.TransferParaFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonClickEffect = findViewById(R.id.btn_click_effect);
        buttonClickEffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(ClickEffectFragment.class.getName());
            }
        });

        Button buttonRequirePermission = findViewById(R.id.btn_require_permission);
        buttonRequirePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(PermissionFragment.class.getName());
            }
        });

        Button buttonTransferPara = findViewById(R.id.btn_transfer_para);
        buttonTransferPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleFragmentActivity.class);
                intent.putExtra(SingleFragmentActivity.FRAGMENT_NAME, TransferParaFragment.class.getName());
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
                openFragment(CameraFragment.class.getName());
            }
        });

        Button buttonFragment = findViewById(R.id.btn_open_fragment);
        buttonFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(LearningFragment.class.getName());
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

    private void openFragment(String fragmentName){
        Intent intent =new Intent(MainActivity.this, SingleFragmentActivity.class);
        intent.putExtra(SingleFragmentActivity.FRAGMENT_NAME, fragmentName);
        startActivity(intent);

    }
}
