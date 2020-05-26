package com.syw.learningandroid.transferpara;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.syw.learningandroid.R;
import com.syw.learningandroid.base.BaseFragment;

public class TransferParaFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_transfer_para;
    }

    @Override
    protected void initView(View view) {
        Intent intent = getActivity().getIntent();
        String friendBeanId = intent.getStringExtra("friend_bean_list_key");
        TextView textView = view.findViewById(R.id.tv_friend_bean);
        textView.setText("好友Id：" + friendBeanId);
    }
}
