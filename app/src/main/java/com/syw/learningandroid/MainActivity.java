package com.syw.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.syw.learningandroid.camera.CameraFragment;
import com.syw.learningandroid.clickeffect.ClickEffectFragment;
import com.syw.learningandroid.fragment.LearningFragment;
import com.syw.learningandroid.fragment.SingleFragmentActivity;
import com.syw.learningandroid.permission.PermissionFragment;
import com.syw.learningandroid.transferpara.TransferParaFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClickEffect = findViewById(R.id.btn_click_effect);
        buttonClickEffect.setOnClickListener(this);


        Button buttonRequirePermission = findViewById(R.id.btn_require_permission);
        buttonRequirePermission.setOnClickListener(this);

        Button buttonTransferPara = findViewById(R.id.btn_transfer_para);
        buttonTransferPara.setOnClickListener(this);

        Button buttonCamera = findViewById(R.id.btn_open_camera);
        buttonCamera.setOnClickListener(this);

        Button buttonFragment = findViewById(R.id.btn_open_fragment);
        buttonFragment.setOnClickListener(this);
    }

    private String getFriendId() {
        return "18";
    }

    private void openFragment(String fragmentName) {
        Intent intent = new Intent(MainActivity.this, SingleFragmentActivity.class);
        intent.putExtra(SingleFragmentActivity.FRAGMENT_NAME, fragmentName);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_click_effect:
                openFragment(ClickEffectFragment.class.getName());
                break;
            case R.id.btn_require_permission:
                openFragment(PermissionFragment.class.getName());
                break;
            case R.id.btn_transfer_para:
                Intent intent = new Intent(MainActivity.this, SingleFragmentActivity.class);
                intent.putExtra(SingleFragmentActivity.FRAGMENT_NAME, TransferParaFragment.class.getName());
                String friendBeanId = getFriendId();
                // object to json
                intent.putExtra("friend_bean_list_key", friendBeanId);
                startActivity(intent);
                break;
            case R.id.btn_open_camera:
                openFragment(CameraFragment.class.getName());
                break;
            case R.id.btn_open_fragment:
                openFragment(LearningFragment.class.getName());
                break;
            default:
                break;

        }

    }
}
