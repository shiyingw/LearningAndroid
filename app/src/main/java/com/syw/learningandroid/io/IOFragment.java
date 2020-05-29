package com.syw.learningandroid.io;

import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;

import com.syw.learningandroid.R;
import com.syw.learningandroid.R2;
import com.syw.learningandroid.base.BaseFragment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import butterknife.BindView;
import butterknife.OnClick;

public class IOFragment extends BaseFragment {
    @BindView(R2.id.tv_info)
    EditText editText;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_io;
    }

    @Override
    protected void initView(View view) {
        editText.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @OnClick(R2.id.btn_in)
    protected void setInfo() {
        new Thread(){
            @Override
            public void run() {
                File file = new File(Environment.getExternalStorageDirectory(), "/io_practice.txt");
                try {
                    FileInputStream inputStream = new FileInputStream(file);
                    int len;
                    StringBuilder builder = new StringBuilder();
                    while ((len = inputStream.read()) != -1) {
                        builder.append(((char) len));
                    }
                    editText.setText(builder.toString());
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @OnClick(R2.id.btn_out)
    protected void getInfo() {
        File file = new File(Environment.getExternalStorageDirectory(), "/io_practice.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(editText.getText().toString().getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
