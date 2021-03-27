package ramin.seyghaly.giant_adapter.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

import ramin.seyghaly.giant_adapter.interfaces.OnAdapterItemClickListener;
import ramin.seyghaly.giant_adapter.models.Entity;


public abstract class BaseViewHolder extends AdapterQuickAccess {

    private OnAdapterItemClickListener onAdapterItemClickListener;
    private View itemView;
    private int position;

    public abstract View onCreateView(ViewGroup parentView, int position);

    public abstract void bind(Entity item, int position);

    public final SectionViewHolder createViewHolder(ViewGroup viewGroup, int viewType) {
        this.itemView = onCreateView(viewGroup, viewType);
        return new SectionViewHolder(this, this.itemView);
    }

    private Drawable createPlaceHolder(Context context) {
        Bitmap bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(-2039584);
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public final void bindViewHolder(Entity item, int position) {
        this.position = position;
        bind(item, position);
    }

    public void onEvent(Entity entity, BaseViewHolder holder, View view) {
        if (entity != null && onAdapterItemClickListener != null) {
            onAdapterItemClickListener.onAdapterItemClick(entity,position, holder, view);
        }
    }

    public final BaseViewHolder setOnAdapterItemListener(OnAdapterItemClickListener onAdapterItemClickListener) {
        this.onAdapterItemClickListener = onAdapterItemClickListener;
        return this;
    }

}
