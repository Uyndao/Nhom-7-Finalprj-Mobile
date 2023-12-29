package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    Button hoanthanhbutton, choilaibutton, chiasebutton;
    TextView diemtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        Intent it = getIntent();
        String chude = it.getStringExtra("Chủ đề");
        int dokho = it.getIntExtra("Độ khó", 0);
        int diem = it.getIntExtra("Điểm", 0);

        hoanthanhbutton = findViewById(R.id.hoanthanh);
        choilaibutton = findViewById(R.id.choilai);
        chiasebutton = findViewById(R.id.chiase);
        diemtext = findViewById(R.id.diem);
        diemtext.setText(Integer.toString(diem / (dokho +1)));
        hoanthanhbutton.setOnClickListener(v -> {
            Intent it1 = new Intent(Activity4.this, Activity1.class);
            it1.putExtra("Total Score", Integer.toString(diem));
            startActivity(it1);
            finish();
        });
        choilaibutton.setOnClickListener(v -> {
            Intent it2 = new Intent(Activity4.this, Activity3.class);
            it2.putExtra("Chủ đề", chude);
            it2.putExtra("Độ khó", dokho);
            startActivity(it2);
            finish();
        });
        chiasebutton.setOnClickListener(v -> {
            String s = "Bạn đã đạt được " + diem + " điểm!";
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, s);
            sendIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(sendIntent, null);
            startActivity(shareIntent);
        });
    }
}