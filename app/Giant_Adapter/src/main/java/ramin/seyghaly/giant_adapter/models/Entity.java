package ramin.seyghaly.giant_adapter.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

public class Entity implements Parcelable {

    public int cellType;

    public Entity(int cellType){
        this.cellType = cellType;
    }

    public void setCellType(int cellType) {
        this.cellType = cellType;
    }

    public int getViewType() {
        return cellType;
    }

    public long getItemId() {
        return ((long) this.hashCode()) << 31;
    }

    protected Entity(Parcel in) {
        cellType = in.readInt();
    }

    public static final Creator<Entity> CREATOR = new Creator<Entity>() {
        @Override
        public Entity createFromParcel(Parcel in) {
            return new Entity(in);
        }

        @Override
        public Entity[] newArray(int size) {
            return new Entity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(cellType);
    }

    public String toJson(){
        return new Gson().toJson(this);
    }

}
