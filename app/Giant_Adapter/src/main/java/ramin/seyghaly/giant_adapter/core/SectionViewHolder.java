package ramin.seyghaly.giant_adapter.core;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import ramin.seyghaly.giant_adapter.models.Entity;


public class SectionViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder baseViewHolder;

    public SectionViewHolder(BaseViewHolder baseViewHolder, View itemView) {
        super(itemView);
        this.baseViewHolder = baseViewHolder;
    }

    public void bind(Entity item) {
        this.baseViewHolder.bindViewHolder(item, getAdapterPosition());
    }

}
