package com.syw.learningandroid.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.syw.learningandroid.R;

public class SingleFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        LearningFragment learningFragment = new LearningFragment();
        // FragmentManager 开启事务
        getSupportFragmentManager().beginTransaction()
                // 将 learningFragment 替换到 fragment 容器（R.id.fragment_container）中
                .replace(R.id.fragment_container, learningFragment)
                // 提交事务
                .commit();
    }
}
