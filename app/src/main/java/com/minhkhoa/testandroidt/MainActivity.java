package com.minhkhoa.testandroidt;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView lstSV;
    sinhvienAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstSV = (ListView)findViewById(R.id.lstSinhVien);

        ArrayList<SinhVien> mangsinhvien = new ArrayList<>();

        mangsinhvien.add(0, new SinhVien("thai minh khoa",01));
        mangsinhvien.add(1,new SinhVien("quoc trong",02));
        mangsinhvien.add(2,new SinhVien("minh dy",03));

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference myRef = database.getReference("sinh vien");

        myRef.setValue(mangsinhvien);

        adapter = new sinhvienAdapter(this, mangsinhvien);
        lstSV.setAdapter(adapter);



    }
}
