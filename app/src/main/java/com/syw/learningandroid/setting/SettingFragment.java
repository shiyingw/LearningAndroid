package com.syw.learningandroid.setting;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.syw.learningandroid.R;
import com.syw.learningandroid.R2;
import com.syw.learningandroid.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class SettingFragment extends BaseFragment {

    @BindView(R2.id.recycler_view)
    RecyclerView recyclerView;
    private SettingAdapter settingAdapter;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getActivity().finish();
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_setting;
    }

    @Override
    protected void initView(View view) {
        settingAdapter = new SettingAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(settingAdapter);
        settingAdapter.setSettingInfoList(SettingData.getSettingInfoList());
        settingAdapter.setReturnClickListener(listener);
    }


    @OnClick(R2.id.button)
    protected void click() {
        settingAdapter.addSettingInfo(new SettingInfo("1","2"));
    }


}
