package com.syw.learningandroid.clickeffect;

import android.view.View;
import android.widget.ImageView;

import com.syw.learningandroid.R;
import com.syw.learningandroid.base.BaseFragment;

public class ClickEffectFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_click_effect;
    }

    @Override
    protected void initView(View view) {
        ImageView imageView = view.findViewById(R.id.img_click_effect);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}
