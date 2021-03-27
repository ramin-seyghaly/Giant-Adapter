package ramin.seyghaly.giant_adapter.errors;

import androidx.annotation.Nullable;

public class GiantAdapterException extends RuntimeException {

    public static final String IS_NOT_REGISTERED = "is not registered";

    public GiantAdapterException(String message) {
        super(message);
    }

}
