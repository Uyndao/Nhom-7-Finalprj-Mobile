package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ChuDeListViewAdapter extends BaseAdapter {

    final ArrayList<ChuDe> listChuDe;

    ChuDeListViewAdapter(ArrayList<ChuDe> listChuDe) {
        this.listChuDe = listChuDe;
    }

    @Override
    public int getCount() {
        return listChuDe.size();
    }

    @Override
    public Object getItem(int position) {
        return listChuDe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listChuDe.get(position).anh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.chude_view, null);
        } else viewProduct = convertView;

        ChuDe chuDe = (ChuDe) getItem(position);
        ((TextView) viewProduct.findViewById(R.id.name)).setText(chuDe.name);
        ((TextView) viewProduct.findViewById(R.id.mota)).setText(String.format(chuDe.mota));
        ((ImageView) viewProduct.findViewById(R.id.anh)).setImageResource(chuDe.anh);

        return viewProduct;
    }
}