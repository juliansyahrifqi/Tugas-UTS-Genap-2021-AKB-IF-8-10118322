package com.example.a10118322_rifqipratamaj_tugasuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page_slider);

        setupViewPagerItems();

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(viewPagerAdapter);
    }

    private void setupViewPagerItems() {
        List<ViewPagerItem> viewPagerItems = new ArrayList<>();

        ViewPagerItem firstSlider = new ViewPagerItem();
        firstSlider.setTitle("SELAMAT DATANG");
        firstSlider.setDescription("Ini adalah aplikasi Catatan Harian yang dibuat oleh 10118322 - Rifqi Pratama Juliansyah - IF8");
        firstSlider.setImage(R.drawable.ic_viewpager_awal);

        ViewPagerItem secondSlider = new ViewPagerItem();
        secondSlider.setTitle("TAMBAH DAN UBAH CATATAN");
        secondSlider.setDescription("Di aplikasi ini, kalian bisa melakukan penambahan catatan harian dan juga mengedit catatan harian kalian");
        secondSlider.setImage(R.drawable.ic_viewpager_dua);

        ViewPagerItem thirdSlider = new ViewPagerItem();
        thirdSlider.setTitle("HAPUS CATATAN");
        thirdSlider.setDescription("Selain bisa menambah dan mengubah catatan, di aplikasi ini juga kalian bisa menghapus catatan yang sudah tidak dibutuhkan");
        thirdSlider.setImage(R.drawable.ic_viewpager_tiga);

        viewPagerItems.add(firstSlider);
        viewPagerItems.add(secondSlider);
        viewPagerItems.add(thirdSlider);

        viewPagerAdapter = new ViewPagerAdapter(viewPagerItems);

    }
}