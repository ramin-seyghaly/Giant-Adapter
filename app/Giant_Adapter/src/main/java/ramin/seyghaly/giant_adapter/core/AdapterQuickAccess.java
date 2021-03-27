package ramin.seyghaly.giant_adapter.core;

import android.widget.ImageView;

import androidx.annotation.DrawableRes;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.Target;



public class AdapterQuickAccess {

    public void loadImageUrl(String url, ImageView imageView) {
        loadImageUrl(url,imageView,false);
    }

    public void loadImageUrl(String url, ImageView imageView,boolean isCircleCrop) {
        if (url != null) {
            if (isCircleCrop){
                Glide.with(imageView.getContext())
                        .load(url).dontAnimate()
                        .override(Target.SIZE_ORIGINAL)
                        .skipMemoryCache(true)
                        .thumbnail(0.3f)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .circleCrop()
                        .into(imageView);
            }else {
                Glide.with(imageView.getContext())
                        .load(url).dontAnimate()
                        .override(Target.SIZE_ORIGINAL)
                        .thumbnail(0.3f)
                        .skipMemoryCache(true)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .into(imageView);
            }
        }
    }

    public void loadImageResource(@DrawableRes Integer resId, ImageView imageView) {
        loadImageResource(resId,imageView,false);
    }

    public void loadImageResource(@DrawableRes Integer resId, ImageView imageView, boolean isCircleCrop) {
        if (resId != null) {
            if (isCircleCrop){
                Glide.with(imageView.getContext())
                        .load(resId).dontAnimate()
                        .override(Target.SIZE_ORIGINAL)
                        .thumbnail(0.3f)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .skipMemoryCache(true)
                        .circleCrop()
                        .into(imageView);
            }else {
                Glide.with(imageView.getContext())
                        .load(resId).dontAnimate()
                        .override(Target.SIZE_ORIGINAL)
                        .thumbnail(0.3f)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .skipMemoryCache(true)
                        .into(imageView);
            }
        }
    }

}