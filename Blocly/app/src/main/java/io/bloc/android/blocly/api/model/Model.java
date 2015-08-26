package io.bloc.android.blocly.api.model;

/**
 * Created by Kevin on 8/25/2015.
 */
public abstract class Model {

    private final long rowId;

    public Model(long rowId) {
        this.rowId = rowId;
    }

    public long getRowId() {
        return rowId;
    }
}
