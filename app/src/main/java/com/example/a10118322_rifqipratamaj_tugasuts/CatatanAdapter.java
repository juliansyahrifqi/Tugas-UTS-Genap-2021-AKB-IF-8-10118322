// Tanggal Pengerjaan : 2 Juni 2021
// NIM : 10118322
// Nama : Rifqi Pratama Juliansyah
// Kelas : IF-8

package com.example.a10118322_rifqipratamaj_tugasuts;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class CatatanAdapter extends RecyclerView.Adapter {

    private List<Catatan> catatanList;

    public CatatanAdapter(List<Catatan> catatanList) {
        this.catatanList = catatanList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);

        return new CatatanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Catatan catatan = catatanList.get(position);

        ((CatatanViewHolder) holder).bindView(catatan);
    }

    @Override
    public int getItemCount() {
        return catatanList.size();
    }

    private class CatatanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tv_date;
        private TextView tv_title;
        private TextView tv_category;
        private TextView tv_description;

        public CatatanViewHolder(View itemView) {
            super(itemView);

            tv_date = (TextView) itemView.findViewById(R.id.tv_date);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_category = (TextView) itemView.findViewById(R.id.tv_category);
            tv_description = (TextView) itemView.findViewById(R.id.tv_description);

            itemView.setOnClickListener(this);
        }

        public void bindView(Catatan catatan) {
            tv_date.setText(catatan.getDate());
            tv_title.setText(catatan.getTitle());
            tv_category.setText(catatan.getCategory());
            tv_description.setText(catatan.getDescription());
        }

        @Override
        public void onClick(View view) {

        }
    }
}