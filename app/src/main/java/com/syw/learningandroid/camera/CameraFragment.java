package com.syw.learningandroid.camera;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.syw.learningandroid.R;

import java.io.File;

public class CameraFragment extends Fragment {

    private Uri uri;
    private ImageView imageView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // android 7.0系统解决拍照的问题
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_camera,container,false);

        Button button = view.findViewById(R.id.btn_open_camera);
        imageView = view.findViewById(R.id.iv_photo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });
        return view;
    }

    private void openCamera() {
        // 新建文件夹
        File dir = new File(Environment.getExternalStorageDirectory() + "/LearningAndroid");
        dir.mkdirs();
        // 在文件夹中新建照片文件
        File file = new File(dir, "cache.jpg");
        uri = Uri.fromFile(file);
        // 调用系统相机
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // 将文件路径信息传递过去
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        // 启动相机 Activity
        startActivityForResult(intent, 10);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 收到回调
        if (requestCode == 10) {
            // 点击确定
            if (resultCode == Activity.RESULT_OK) {
                // 设置照片
                imageView.setImageURI(uri);
            }
            // 点击取消
            else {
                Toast.makeText(requireContext(), "取消了", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
