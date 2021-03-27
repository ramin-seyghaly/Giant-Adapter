package ramin.seyghaly.giantadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ramin.seyghaly.giant_adapter.controller.GiantAdapter;
import ramin.seyghaly.giant_adapter.controller.GiantAdapterCellTypes;
import ramin.seyghaly.giant_adapter.models.Entity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Entity> entityList = new ArrayList<>();
        GiantAdapterCellTypes.getInstance().registerTypeViewHolder(1,Section.class);
        entityList.add(new TextEntity("1-test"));
        entityList.add(new TextEntity("2-test"));
        entityList.add(new TextEntity("3-test"));
        entityList.add(new TextEntity("4-test"));
        entityList.add(new TextEntity("5-test"));
        entityList.add(new TextEntity("6-test"));
        entityList.add(new TextEntity("7-test"));
        entityList.add(new TextEntity("8-test"));
        entityList.add(new TextEntity("9-test"));
        entityList.add(new TextEntity("10-test"));
        entityList.add(new TextEntity("11-test"));
        entityList.add(new TextEntity("12-test"));
        RecyclerView rc = findViewById(R.id.rc);
        rc.setLayoutManager(new LinearLayoutManager(this));
        GiantAdapter adapter = new GiantAdapter(entityList);
        rc.setAdapter(adapter);
    }
}