package ramin.seyghaly.giant_adapter.interfaces;

import android.view.View;

import ramin.seyghaly.giant_adapter.core.BaseViewHolder;
import ramin.seyghaly.giant_adapter.models.Entity;


public interface OnAdapterItemClickListener<T> {
    void onAdapterItemClick(Entity entity, int position, BaseViewHolder holder, View view);
}