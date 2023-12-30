package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.materialswitch.MaterialSwitch;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    ArrayList<ChuDe> listChuDe;
    ChuDeListViewAdapter chuDeListViewAdapter;
    ListView listViewChuDe;
    MaterialSwitch doKho;
    int dokho = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent it1 = getIntent();
        int diemtong = it1.getIntExtra("Total Score", 0);
        TextView ac2_score_view = findViewById(R.id.ac2_score);
        if (Integer.toString(diemtong).equals("1") || Integer.toString(diemtong).equals("0"))
            ac2_score_view.setText(Integer.toString(diemtong) + " pt");
        else ac2_score_view.setText(Integer.toString(diemtong) + " pts");

        //Khoi tao ListProduct
        listChuDe = new ArrayList<>();
        listChuDe.add(new ChuDe(R.drawable.anhdialy, "Địa lý", "Các câu hỏi về các vùng đất, địa hình, dân cư trên trái đất"));
        listChuDe.add(new ChuDe(R.drawable.anhlichsu, "Lịch sử", "Các câu hỏi về sự khiên trong lịch sử"));
        listChuDe.add(new ChuDe(R.drawable.anhkhoahoc, "Khoa học", "Các câu hỏi về định luật, cách vận hành của thế giới tự nhiên"));
        listChuDe.add(new ChuDe(R.drawable.anhnghethuat, "Nghệ thuật", "Các câu hỏi về nghệ thuật"));

        chuDeListViewAdapter = new ChuDeListViewAdapter(listChuDe);

        listViewChuDe = findViewById(R.id.listchude);
        listViewChuDe.setAdapter(chuDeListViewAdapter);

        doKho = findViewById(R.id.do_kho);

        listViewChuDe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChuDe chuDe = (ChuDe) chuDeListViewAdapter.getItem(position);
                if (doKho.isChecked()) {
                    dokho = 1;
                } else {
                    dokho = 0;
                }
                Intent it = new Intent(Activity2.this, Activity3.class);
                it.putExtra("Chủ đề", chuDe.name);
                it.putExtra("Độ khó", dokho);
                it.putExtra("Total Score", diemtong);
                startActivity(it);
                finish();
            }
        });

        Button dsch = findViewById(R.id.dschButton);
        dsch.setOnClickListener(v -> {
            Intent it5 = new Intent(this, Activity5.class);
            startActivity(it5);
        });
    }
}