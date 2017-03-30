package com.example.trinhnx.i_animate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trinhnx.i_animate.R;
import com.example.trinhnx.i_animate.api.ItemViewApi;
import com.example.trinhnx.i_animate.api.ItemViewImpl;
import com.example.trinhnx.i_animate.model.MediaItem;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by trinhnx on 3/30/2017.
 */
public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    private List<MediaItem> mediaItemList;
    private Context context;
    private ItemViewApi itemViewApi;

    public GalleryAdapter(Context context, List<MediaItem> mediaItemList) {
        this.context = context;
        this.mediaItemList = mediaItemList;
        itemViewApi = new ItemViewImpl();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view;
        if (MediaItem.VIEW_TYPE.TEXT.getValue() == viewType) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item, parent, false);
        } else if (MediaItem.VIEW_TYPE.IMAGE.getValue() == viewType) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        } else if (MediaItem.VIEW_TYPE.VIDEO.getValue() == viewType) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item, parent, false);
        } else {
            throw new IllegalArgumentException("Invalid type : " + viewType);
        }
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MediaItem data = mediaItemList.get(position);
        itemViewApi.bindDataIntoView(data, holder.view);
    }

    @Override
    public int getItemViewType(int position) {
        // There are 3 type of views (see Model)
        return mediaItemList.get(position).getType().getValue();
    }

    @Override
    public int getItemCount() {
        return mediaItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}
