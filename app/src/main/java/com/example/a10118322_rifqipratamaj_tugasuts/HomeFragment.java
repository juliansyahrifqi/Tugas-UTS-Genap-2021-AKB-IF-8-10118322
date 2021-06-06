// Tanggal Pengerjaan : 1 Juni 2021
// NIM : 10118322
// Nama : Rifqi Pratama Juliansyah
// Kelas : IF-8

package com.example.a10118322_rifqipratamaj_tugasuts;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class HomeFragment extends Fragment {

    private List<Catatan> catatanList;
    private CatatanInterface catatanInterface;
    private CatatanAdapter catatanAdapter;
    private RecyclerView rv_catatan;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        rv_catatan = (RecyclerView) view.findViewById(R.id.rv_catatan);

        read();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv_catatan.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        read();
    }

    private void read() {
        catatanList = new ArrayList<>();

        catatanInterface = new CatatanImp(getActivity().getApplicationContext());

        Cursor cursor = catatanInterface.read();
        if(cursor.moveToFirst()) {
            do {
                Catatan catatan = new Catatan(
                        cursor.getString(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)
                );

                catatanList.add(catatan);
            } while(cursor.moveToNext());
        }

        catatanAdapter = new CatatanAdapter(catatanList);
        rv_catatan.setAdapter(catatanAdapter);
    }

}