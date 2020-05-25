package com.syw.learningandroid.transferpara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.syw.learningandroid.R;

public class TransferParaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_para);
        Intent intent = getIntent();
        String friendBeanId = intent.getStringExtra("friend_bean_list_key");
        TextView textView = findViewById(R.id.tv_friend_bean);
        textView.setText("好友Id：" + friendBeanId);

    }
}
