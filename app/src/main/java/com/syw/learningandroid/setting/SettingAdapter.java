package com.syw.learningandroid.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.syw.learningandroid.R;

import java.util.List;

public class SettingAdapter extends RecyclerView.Adapter<SettingViewHolder> {

    private List<SettingInfo> settingInfoList;

    private View.OnClickListener returnClickListener;

    @NonNull
    @Override
    public SettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_setting_item, parent, false);
        SettingViewHolder settingViewHolder = new SettingViewHolder(view);
        return settingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SettingViewHolder holder, int position) {
        SettingInfo settingInfo = settingInfoList.get(position);
        holder.settingNameView.setText(settingInfo.getSettingName());
        holder.settingIndexView.setText(String.valueOf(position));
        holder.settingDescriptionView.setText(settingInfo.getSettingDescription());
        holder.settingReturnView.setOnClickListener(returnClickListener);
    }

    @Override
    public int getItemCount() {
        return settingInfoList == null ? 0 : settingInfoList.size();
    }

    public void setSettingInfoList(List<SettingInfo> settingInfoList) {
        this.settingInfoList = settingInfoList;
        notifyDataSetChanged();
    }

    public void addSettingInfo(SettingInfo settingInfo) {
        this.settingInfoList.add(settingInfo);
        notifyDataSetChanged();
    }

    public void setReturnClickListener(View.OnClickListener returnClickListener) {
        this.returnClickListener = returnClickListener;
    }
}
