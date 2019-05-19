package com.gzeinnumer.antrianpasientv2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.gzeinnumer.antrianpasientv2.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PasientActivity extends AppCompatActivity {

    @BindView(R.id.rv_no_antrian_pasient)
    RecyclerView rvNoAntrianPasient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasient);
        ButterKnife.bind(this);
    }
}
