package com.syw.learningandroid.friend;

import android.view.View;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.syw.learningandroid.R;
import com.syw.learningandroid.R2;
import com.syw.learningandroid.base.BaseFragment;

import java.lang.reflect.Type;
import java.util.List;

import butterknife.BindView;

public class FriendFragment extends BaseFragment {
    @BindView(R2.id.friend_recycler_view)
    RecyclerView recyclerView;

    private FriendAdapter friendAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_friend;
    }

    @Override
    protected void initView(View view) {

        setTitle();

        friendAdapter = new FriendAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        //添加Android自带的分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(friendAdapter);
        // 设置数据
        friendAdapter.setFriendInfoList(getFriendInfoList());
        // 刷新数据
        friendAdapter.notifyDataSetChanged();
    }

    private void setTitle() {
        getActivity().setTitle("好友列表");
    }

    private List<FriendInfo> getFriendInfoList() {
        Type type = new TypeToken<List<FriendInfo>>() {
        }.getType();
        return new Gson().fromJson(FriendData.friendListJson, type);
    }
}
