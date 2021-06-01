package com.example.a10118322_rifqipratamaj_tugasuts;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatatanAdapter extends RecyclerView.Adapter<CatatanAdapter.CatatanViewHolder> {

    private List<Catatan> catatanList;

    public CatatanAdapter(List<Catatan> catatanList) {
        this.catatanList = catatanList;

    }

    @NonNull
    @Override
    public CatatanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items, null, false);
        return new CatatanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatatanViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return catatanList.size();
    }

    public class CatatanViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_date;
        private TextView tv_title;
        private TextView tv_description;

        public CatatanViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_date = itemView.findViewById(R.id.tv_date);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_description);
        }
    }
}
