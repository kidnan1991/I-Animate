package com.example.trinhnx.i_animate.model;

/**
 * Created by trinhnx on 3/30/2017.
 */
public class MediaItem {
    protected VIEW_TYPE type;

    public void setType(VIEW_TYPE type) {
        this.type = type;
    }

    public VIEW_TYPE getType() {
        return type;
    }

    public enum VIEW_TYPE {
        TEXT(1), IMAGE(2), VIDEO(3);
        private final int value;

        VIEW_TYPE(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


}
