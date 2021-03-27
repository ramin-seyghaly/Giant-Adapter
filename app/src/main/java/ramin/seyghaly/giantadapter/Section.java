package ramin.seyghaly.giantadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;

import java.util.zip.Inflater;

import ramin.seyghaly.giant_adapter.core.BaseViewHolder;
import ramin.seyghaly.giant_adapter.models.Entity;

public class Section extends BaseViewHolder {

    private AppCompatTextView title;
    private View view;

    @Override
    public View onCreateView(ViewGroup parentView, int position) {
        view =  LayoutInflater.from(parentView.getContext()).inflate(R.layout.section_test, parentView, false);
        title = view.findViewById(R.id.title);
        return view;
    }

    @Override
    public void bind(Entity item, int position) {
        if (item instanceof TextEntity){
            TextEntity textEntity = (TextEntity) item;
            title.setText(textEntity.getTitle());
        }
    }
}
