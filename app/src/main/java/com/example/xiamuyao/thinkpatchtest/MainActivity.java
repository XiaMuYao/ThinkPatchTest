package com.example.xiamuyao.thinkpatchtest;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_version = findViewById(R.id.tv_version);
        tv_version.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer.parseInt("11m3");

            }
        });
        try {
            tv_version.setText(getCode()+"我修复了bug");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getCode() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = getPackageManager()
                .getPackageInfo(getPackageName(), 0);
        //获取APP版本versionName
        String versionName = packageInfo.versionName;
        //获取APP版本versionCode
        int versionCode = packageInfo.versionCode;
        return versionName + versionCode;
    }
}
