package com.example.trinhnx.i_animate.api;

import android.view.View;

import com.example.trinhnx.i_animate.model.MediaItem;

/**
 * Created by trinhnx on 3/30/2017.
 */
public interface ItemViewApi {
    /**
     * Provide an interface to set the item into view
     * @param mediaItem
     * @param view
     */
    void bindDataIntoView(MediaItem mediaItem, View view);
}
