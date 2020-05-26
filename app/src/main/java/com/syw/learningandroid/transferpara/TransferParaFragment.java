package com.syw.learningandroid.transferpara;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.syw.learningandroid.R;

public class TransferParaFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transfer_para, container, false);

        Intent intent = getActivity().getIntent();
        String friendBeanId = intent.getStringExtra("friend_bean_list_key");
        TextView textView = view.findViewById(R.id.tv_friend_bean);
        textView.setText("好友Id：" + friendBeanId);

        return view;
    }
}
