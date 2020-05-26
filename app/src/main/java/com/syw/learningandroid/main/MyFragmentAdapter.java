package com.syw.learningandroid.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.syw.learningandroid.R;
import com.syw.learningandroid.fragment.SingleFragmentActivity;

import java.util.List;

public class MyFragmentAdapter extends RecyclerView.Adapter<MyFragmentAdapter.ViewHolder> {

    private List<FragmentModel> dataList;

    public MyFragmentAdapter(List<FragmentModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate.inflate()
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FragmentModel fragmentModel = dataList.get(position);
        holder.bind(fragmentModel);
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    private void openFragment(Context context, String fragmentName) {
        Intent intent = new Intent(context, SingleFragmentActivity.class);
        intent.putExtra(SingleFragmentActivity.FRAGMENT_NAME, fragmentName);
        context.startActivity(intent);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private Button button;
        private FragmentModel mFragmentModel;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.button);
        }

        void bind(final FragmentModel fragmentModel) {
            this.mFragmentModel = fragmentModel;
            button.setText(fragmentModel.getButtonText());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openFragment(v.getContext(), mFragmentModel.getFragmentName());
                }
            });
        }
    }
}

