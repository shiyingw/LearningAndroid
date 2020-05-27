package com.syw.learningandroid.permission;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.syw.learningandroid.R;
import com.syw.learningandroid.R2;
import com.syw.learningandroid.base.BaseFragment;

import butterknife.OnClick;

public class PermissionFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_premission;
    }

    @Override
    protected void initView(View view) {

    }

    @OnClick(R2.id.btn_require_permission)
    protected void requirePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (getActivity().checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 10);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 10) {
            for (int grantResult : grantResults) {
                Toast.makeText(requireContext(), "grantResult: " + grantResult, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
