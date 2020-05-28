package com.syw.learningandroid.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.syw.learningandroid.R;

import butterknife.OnClick;

class SettingViewHolder extends RecyclerView.ViewHolder {
    TextView settingIndexView;
    TextView settingNameView;
    TextView settingDescriptionView;
    ImageView settingReturnView;

    SettingViewHolder(@NonNull View itemView) {
        super(itemView);
        settingIndexView = itemView.findViewById(R.id.tv_number);
        settingNameView = itemView.findViewById(R.id.tv_menu_chinese);
        settingDescriptionView = itemView.findViewById(R.id.tv_menu_ds);
        settingReturnView = itemView.findViewById(R.id.ic_return);
    }



}
