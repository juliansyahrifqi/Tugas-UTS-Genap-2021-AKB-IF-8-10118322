package com.example.a10118322_rifqipratamaj_tugasuts;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView rv_catatan;
    private List<Catatan> catatanList;
    private CatatanInterface catatanInterface;
    private CatatanAdapter catatanAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        read();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rv_catatan = view.findViewById(R.id.rv_catatan);

        return view;
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
                        cursor.getString(3)
                );

                catatanList.add(catatan);
            } while(cursor.moveToNext());
        }

        catatanAdapter = new CatatanAdapter(catatanList);
        rv_catatan.setAdapter(catatanAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();

        read();
    }

    public void onClick(int position) {
        Catatan catatan = catatanList.get(position);
    }
}
