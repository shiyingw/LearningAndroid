package com.syw.learningandroid.clickeffect;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.syw.learningandroid.R;
import com.syw.learningandroid.R2;
import com.syw.learningandroid.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class ClickEffectFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_click_effect;
    }

    @Override
    protected void initView(View view) {

    }

    @OnClick(R2.id.img_click_effect)
    protected void back(View view) {
        getActivity().finish();
    }
}
