package com.kr.kmaster;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kmaster.co.kr"));
        intent.setPackage("com.android.chrome");
        startActivity(intent);
    }
}
