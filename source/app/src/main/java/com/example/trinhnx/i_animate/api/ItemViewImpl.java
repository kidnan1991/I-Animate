package com.example.trinhnx.i_animate.api;

import android.view.View;

import com.example.trinhnx.i_animate.model.MediaItem;

/**
 * Created by trinhnx on 3/30/2017.
 */
public class ItemViewImpl implements ItemViewApi {
    @Override
    public void bindDataIntoView(MediaItem mediaItem, View view) {
        switch ((mediaItem.getType())) {
            case IMAGE:

                break;
            case TEXT:
                break;
            case VIDEO:
                break;
            default:
                throw new IllegalArgumentException("Invalid type of media");
        }
    }
}
