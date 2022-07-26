package com.lhm.ex_0722;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class PtoZActivity extends AppCompatActivity {

    ImageView iv_photo;
    PhotoViewAttacher attacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptoz);

        iv_photo = findViewById(R.id.iv_photo);

        //사진을 줌인, 줌아웃 하는 기능
        attacher = new PhotoViewAttacher(iv_photo);
        attacher.update();


    }
}