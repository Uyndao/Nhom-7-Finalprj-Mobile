package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Vector;

public class Activity5 extends AppCompatActivity {

    CauHoi cauHoi = new CauHoi();
    Vector<CauHoi> CauHoiVector;
    ArrayList<CauHoi> listCauHoi;
    CauHoiListViewAdapter cauHoiListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);

        CauHoiVector = cauHoi.KhoiTaoTatCa();

        listCauHoi = new ArrayList<>(CauHoiVector);
        cauHoiListViewAdapter = new CauHoiListViewAdapter(listCauHoi);

        ListView listview_cauhoi = findViewById(R.id.listcauhoi);
        listview_cauhoi.setAdapter(cauHoiListViewAdapter);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoComplete_Chude);

        autoCompleteTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String newText = s.toString();
                if(newText.equals("Địa lý")) {
                    listCauHoi.clear();
                    listCauHoi.addAll(cauHoi.KhoiTaoDiaLy());
                    cauHoiListViewAdapter.notifyDataSetChanged();
                }

                else if(newText.equals("Lịch sử")) {
                    listCauHoi.clear();
                    listCauHoi.addAll(cauHoi.KhoiTaoLichSu());
                    cauHoiListViewAdapter.notifyDataSetChanged();
                }

                else if(newText.equals("Khoa học")) {
                    listCauHoi.clear();
                    listCauHoi.addAll(cauHoi.KhoiTaoKhoaHoc());
                    cauHoiListViewAdapter.notifyDataSetChanged();
                }

                else if(newText.equals("Nghệ thuật")) {
                    listCauHoi.clear();
                    listCauHoi.addAll(cauHoi.KhoiTaoNgheThuat());
                    cauHoiListViewAdapter.notifyDataSetChanged();
                }

                else {
                    listCauHoi.clear();
                    listCauHoi.addAll(cauHoi.KhoiTaoTatCa());
                    cauHoiListViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        listview_cauhoi.setOnItemClickListener((parent, view, position, id) -> {
            int id_cauhoi = listCauHoi.get(position).id;
            Intent it6 = new Intent(this, Activity6.class);
            it6.putExtra("Chi tiết", id_cauhoi);
            startActivity(it6);
        });

    }
}
