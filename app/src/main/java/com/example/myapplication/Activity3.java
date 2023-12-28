package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Vector;

public class Activity3 extends AppCompatActivity {

    Button traloiButton;
    TextView cauhoiText;
    RadioButton luachon1, luachon2, luachon3, luachon4;
    RadioGroup luachonGroup;
    CauHoi cauHoi = new CauHoi();
    int index = 0, diem = 0, socauhoiconlai = 5;
    Vector<CauHoi> cauHoiVector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        Intent it = getIntent();
        String chude = it.getStringExtra("Chủ đề");
        int dokho = it.getIntExtra("Độ khó", 0);
        if (chude.equals("Địa lý")) {
            cauHoiVector = cauHoi.KhoiTaoDiaLy();
        }
        else if (chude.equals("Lịch sử")) {
            cauHoiVector = cauHoi.KhoiTaoLichSu();
        }
        else if (chude.equals("Khoa học")) {
            cauHoiVector = cauHoi.KhoiTaoKhoaHoc();
        }
        else if (chude.equals("Nghệ thuật")) {
            cauHoiVector = cauHoi.KhoiTaoNgheThuat();
        }
        while (dokho != cauHoiVector.elementAt(index).dokho) {
            index++;
        }
        cauhoiText = findViewById(R.id.cauhoitext);
        luachonGroup = findViewById(R.id.luachon);
        luachon1 = findViewById(R.id.dapan1);
        luachon2 = findViewById(R.id.dapan2);
        luachon3 = findViewById(R.id.dapan3);
        luachon4 = findViewById(R.id.dapan4);
        traloiButton = findViewById(R.id.traloiButton);
        cauhoiText.setText(cauHoiVector.elementAt(index).cauhoi);
        luachon1.setText(cauHoiVector.elementAt(index).luachon1);
        luachon2.setText(cauHoiVector.elementAt(index).luachon2);
        luachon3.setText(cauHoiVector.elementAt(index).luachon3);
        luachon4.setText(cauHoiVector.elementAt(index).luachon4);
        traloiButton.setOnClickListener(view -> {
            String luachon = "";
            if (luachon1.isChecked()) {
                luachon = luachon1.getText().toString();
            } else if (luachon2.isChecked()) {
                luachon = luachon2.getText().toString();
            } else if (luachon3.isChecked()) {
                luachon = luachon3.getText().toString();
            } else {
                luachon = luachon4.getText().toString();
            }
            if (luachon.equals(cauHoiVector.elementAt(index).dapan)) {
                diem = diem + 1 + dokho;
                socauhoiconlai--;
                if(index<9&&socauhoiconlai>0){
                    index++;
                    cauhoiText.setText(cauHoiVector.elementAt(index).cauhoi);
                    luachon1.setText(cauHoiVector.elementAt(index).luachon1);
                    luachon2.setText(cauHoiVector.elementAt(index).luachon2);
                    luachon3.setText(cauHoiVector.elementAt(index).luachon3);
                    luachon4.setText(cauHoiVector.elementAt(index).luachon4);
                    luachonGroup.clearCheck();
                }
            }
            else{
                socauhoiconlai = 0;
            }
            if (socauhoiconlai == 0) {
                Intent it2 = new Intent(Activity3.this, Activity4.class);
                it2.putExtra("Chủ đề", chude);
                it2.putExtra("Độ khó", dokho);
                it2.putExtra("Điểm", diem);
                startActivity(it2);
                finish();
            }
        });
    }
}