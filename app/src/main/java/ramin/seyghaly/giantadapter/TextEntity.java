package ramin.seyghaly.giantadapter;

import ramin.seyghaly.giant_adapter.models.Entity;

public class TextEntity extends Entity {

    private String text;

    public TextEntity(String text) {
        super(1);
        this.text = text;
    }

    public String getTitle() {
        return text;
    }
}
