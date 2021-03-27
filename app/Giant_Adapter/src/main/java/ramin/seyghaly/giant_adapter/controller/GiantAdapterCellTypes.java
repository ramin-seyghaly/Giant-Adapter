package ramin.seyghaly.giant_adapter.controller;

import java.util.HashMap;

import ramin.seyghaly.giant_adapter.core.BaseViewHolder;
import ramin.seyghaly.giant_adapter.core.DefaultViewHolder;
import ramin.seyghaly.giant_adapter.errors.GiantAdapterException;


public class GiantAdapterCellTypes {

    private static GiantAdapterCellTypes giantAdapterCellTypes;
    private HashMap<Integer,Class<? extends BaseViewHolder>> map;

    public static GiantAdapterCellTypes getInstance(){
        if (giantAdapterCellTypes == null){
            giantAdapterCellTypes = new GiantAdapterCellTypes();
        }
        return giantAdapterCellTypes;
    }

    private GiantAdapterCellTypes(){
        map = new HashMap<>();
    }

    public GiantAdapterCellTypes registerTypeViewHolder(int entityType, Class<? extends BaseViewHolder> baseViewHolder_class){
        if (!map.containsKey(entityType)) {
            map.put(entityType, baseViewHolder_class);
        }
        return this;
    }

    public BaseViewHolder getViewHolderFromEntityType(int entityType) {
        if (!map.containsKey(entityType)){
            throw new GiantAdapterException("TYPE (" + entityType + ") " + GiantAdapterException.IS_NOT_REGISTERED);
        }
        try {
            Class<? extends BaseViewHolder> clazz = map.get(entityType);
            if (clazz != null && map.containsKey(entityType)) {
                return (BaseViewHolder) clazz.newInstance();
            }else {
                throw new RuntimeException("Error");
            }
        } catch (Exception e) {
            try {
                return (BaseViewHolder) DefaultViewHolder.class.newInstance();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}
