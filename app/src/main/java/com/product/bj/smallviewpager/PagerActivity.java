package com.product.bj.smallviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class PagerActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.height = 700;
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        this.getWindow().setAttributes(params);
    }
}
