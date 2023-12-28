package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;

public class Activity6 extends AppCompatActivity {

    CauHoi cauHoi = new CauHoi();
    Vector<CauHoi> cauHoiVector;
    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6);
        Intent it6 = getIntent();
        int id_chitiet = it6.getIntExtra("Chi tiết", 0);
        cauHoiVector = cauHoi.KhoiTaoTatCa();

        TextView textView_cauhoi = findViewById(R.id.cauhoi6);
        Button text_dokho = findViewById(R.id.Dokho_6);
        TextView textView_luachon1 = findViewById(R.id.luachon1_6);
        TextView textView_luachon2 = findViewById(R.id.luachon2_6);
        TextView textView_luachon3 = findViewById(R.id.luachon3_6);
        TextView textView_luachon4 = findViewById(R.id.luachon4_6);
        TextView textView_dapan = findViewById(R.id.dapan_6);

        textView_cauhoi.setText(cauHoiVector.get(id_chitiet-1).cauhoi);

        if(cauHoiVector.get(id_chitiet-1).dokho == 1){
            text_dokho.setText("Khó");
            text_dokho.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        }
        else {
            text_dokho.setText("Dễ");
            text_dokho.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        }
        textView_luachon1.setText(cauHoiVector.get(id_chitiet-1).luachon1);
        textView_luachon2.setText(cauHoiVector.get(id_chitiet-1).luachon2);
        textView_luachon3.setText(cauHoiVector.get(id_chitiet-1).luachon3);
        textView_luachon4.setText(cauHoiVector.get(id_chitiet-1).luachon4);
        textView_dapan.setText("Đáp án đúng: " + cauHoiVector.get(id_chitiet-1).dapan);
    }
}