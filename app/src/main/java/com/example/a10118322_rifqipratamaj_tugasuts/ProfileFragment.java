// Tanggal Pengerjaan : 1 Juni 2021
// NIM : 10118322
// Nama : Rifqi Pratama Juliansyah
// Kelas : IF-8

package com.example.a10118322_rifqipratamaj_tugasuts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);

    }
}
