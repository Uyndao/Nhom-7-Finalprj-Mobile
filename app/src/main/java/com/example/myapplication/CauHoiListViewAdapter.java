package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class CauHoiListViewAdapter extends BaseAdapter {

    final ArrayList<CauHoi> listCauHoi;

    CauHoiListViewAdapter(ArrayList<CauHoi> listCauHoi) {
        this.listCauHoi = listCauHoi;
    }


    @Override
    public int getCount() {
        return listCauHoi.size();
    }

    @Override
    public Object getItem(int position) {
        return listCauHoi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listCauHoi.get(position).id;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewProduct;

        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.cauhoi_view, null);
        } else viewProduct = convertView;

        CauHoi cauHoi = (CauHoi) getItem(position);
        ((TextView) viewProduct.findViewById(R.id.textViewCauHoi)).setText(String.format("%d. %s", cauHoi.id, cauHoi.cauhoi));

        return viewProduct;
    }
}