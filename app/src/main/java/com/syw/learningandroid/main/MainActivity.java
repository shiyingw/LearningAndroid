package com.syw.learningandroid.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.syw.learningandroid.R;
import com.syw.learningandroid.camera.CameraFragment;
import com.syw.learningandroid.clickeffect.ClickEffectFragment;
import com.syw.learningandroid.fragment.LearningFragment;
import com.syw.learningandroid.friend.FriendFragment;
import com.syw.learningandroid.permission.PermissionFragment;
import com.syw.learningandroid.setting.SettingFragment;
import com.syw.learningandroid.transferpara.TransferParaFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyFragmentAdapter adapter = new MyFragmentAdapter(getDataList());

        recyclerView.setAdapter(adapter);
    }

    private List<FragmentModel> getDataList() {
        List<FragmentModel> list = new ArrayList<>();
        list.add(new FragmentModel("点击效果", ClickEffectFragment.class.getName()));
        list.add(new FragmentModel("申请权限", PermissionFragment.class.getName()));
        list.add(new FragmentModel("传递参数", TransferParaFragment.class.getName()));
        list.add(new FragmentModel("打开相机", CameraFragment.class.getName()));
        list.add(new FragmentModel("Fragment 学习", LearningFragment.class.getName()));
        list.add(new FragmentModel("学习RecyclerView", FriendFragment.class.getName()));
        list.add(new FragmentModel("设置", SettingFragment.class.getName()));
        return list;
    }

}
