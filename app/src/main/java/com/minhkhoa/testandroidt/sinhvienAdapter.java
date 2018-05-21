package com.minhkhoa.testandroidt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class sinhvienAdapter extends BaseAdapter {

    Context context;
    List<SinhVien> arraySinhVien;
    LayoutInflater inflater;

    public sinhvienAdapter (Context context, List<SinhVien> sinhVienList){
        this.context = context;
        arraySinhVien = sinhVienList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return arraySinhVien.size();
    }

    @Override
    public Object getItem(int position) {
        return arraySinhVien.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item,null);

        TextView txtname = (TextView)convertView.findViewById(R.id.txtname);
        TextView txtid   = (TextView) convertView.findViewById(R.id.txtidsinhvien);

        txtname.setText(arraySinhVien.get(position).getNameSV());
        txtid.setText(arraySinhVien.get(position).getIdSV());

        return convertView;
    }
}
