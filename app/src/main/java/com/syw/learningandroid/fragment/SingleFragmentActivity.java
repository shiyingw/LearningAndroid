package com.syw.learningandroid.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.syw.learningandroid.R;

public class SingleFragmentActivity extends AppCompatActivity {

    public static final String FRAGMENT_NAME = "fragment_name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        Intent intent = getIntent();
        String fragmentName = intent.getStringExtra(FRAGMENT_NAME);
        Fragment fragment = getFragmentByName(fragmentName);

        // FragmentManager 开启事务
        getSupportFragmentManager().beginTransaction()
                // 将 fragment 替换到 fragment 容器（R.id.fragment_container）中
                .replace(R.id.fragment_container, fragment)
                // 提交事务
                .commit();
    }

    /**
     * 通过反射拿到 Fragment 对象
     *
     * @param fragmentName fragment 全路径
     * @return Fragment
     */
    private Fragment getFragmentByName(String fragmentName) {
        Fragment fragment = null;
        try {
            Class<?> aClass = Class.forName(fragmentName);
            fragment = (Fragment) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
        return fragment;
    }
}
