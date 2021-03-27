package ramin.seyghaly.giant_adapter.controller;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ramin.seyghaly.giant_adapter.core.SectionViewHolder;
import ramin.seyghaly.giant_adapter.interfaces.OnAdapterItemClickListener;
import ramin.seyghaly.giant_adapter.models.Entity;


public class GiantAdapter extends RecyclerView.Adapter<SectionViewHolder> {

    private List<Entity> entities;
    private OnAdapterItemClickListener onAdapterItemClickListener;

    public GiantAdapter(List<Entity> entities) {
        this.entities = entities;
        setHasStableIds(true);
    }

    public int getItemViewType(int position) {
        return this.entities.get(position).getViewType();
    }

    @NonNull
    @Override
    public SectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return GiantAdapterCellTypes.getInstance()
                .getViewHolderFromEntityType(viewType)
                .setOnAdapterItemListener(onAdapterItemClickListener)
                .createViewHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionViewHolder holder, int position) {
        holder.bind(this.entities.get(position));
    }

    public long getItemId(int position) {
        return this.entities.get(position).getItemId();
    }

    public int getItemCount() {
        return this.entities.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).setRecycleChildrenOnDetach(true);
        }
    }

    public void setOnAdapterItemClickListener(OnAdapterItemClickListener onAdapterItemClickListener) {
        this.onAdapterItemClickListener = onAdapterItemClickListener;
    }

}
