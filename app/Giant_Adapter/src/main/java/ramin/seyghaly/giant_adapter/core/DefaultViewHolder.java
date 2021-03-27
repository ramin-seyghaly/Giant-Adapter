package ramin.seyghaly.giant_adapter.core;

import android.view.View;
import android.view.ViewGroup;

import ramin.seyghaly.giant_adapter.models.Entity;


public class DefaultViewHolder extends BaseViewHolder {

    @Override
    public View onCreateView(ViewGroup viewGroup, int position) {
        return new View(viewGroup.getContext());
    }

    @Override
    public void bind(Entity item, int position) {

    }

}
