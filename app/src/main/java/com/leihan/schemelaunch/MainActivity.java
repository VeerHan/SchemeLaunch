package com.leihan.schemelaunch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 测试地址:www.erdian.net/m.html
        // <a href="znn://aa.bb:80/test?p=12&d=1">test</a>

        Intent intent = getIntent();
        Uri uri = intent.getData();
        System.out.println("scheme:" + intent.getScheme());
        if (uri != null) {
            System.out.println("host:" + uri.getHost());
            System.out.println("dataString:" + intent.getDataString());
            System.out.println("id:" + uri.getQueryParameter("d"));
            System.out.println("path:" + uri.getPath());
            System.out.println("path1:" + uri.getEncodedPath());
            System.out.println("queryString:" + uri.getQuery());
        }
    }
}
