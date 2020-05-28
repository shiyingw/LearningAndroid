package com.syw.learningandroid.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.syw.learningandroid.R;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {
    private List<FriendInfo> friendInfoList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_friend_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FriendInfo friendInfo = friendInfoList.get(position);
        holder.bind(friendInfo);
    }

    @Override
    public int getItemCount() {
        return friendInfoList == null ? 0 : friendInfoList.size();
    }

    public void setFriendInfoList(List<FriendInfo> friendInfoList) {
        this.friendInfoList = friendInfoList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView userPhotoView;
            private TextView userNameView;
            private ImageView userCallView;
            private FriendInfo mFriendInfo;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                userPhotoView = itemView.findViewById(R.id.user_photo);
                userNameView = itemView.findViewById(R.id.user_name);
                userCallView = itemView.findViewById(R.id.iv_call);
            }

            void bind(FriendInfo friendInfo) {
                mFriendInfo = friendInfo;

                loadUserPhoto();

                setUserName();
            }

        private void setUserName() {
            userNameView.setText(mFriendInfo.getUser_name());
        }

        private void loadUserPhoto() {
            Glide.with(userPhotoView)
                    .load(FriendData.ServerUrl + mFriendInfo.getUser_photo())
                    .into(userPhotoView);
        }
    }
}
