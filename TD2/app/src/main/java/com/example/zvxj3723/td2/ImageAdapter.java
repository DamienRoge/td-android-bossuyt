package com.example.zvxj3723.td2;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

/**
 * Created by ZVXJ3723 on 24/01/2017.
 */
public class ImageAdapter extends BaseAdapter {

    private int mGalleryItemBackground;
    private Context mContext;
    private Integer[] mImageIds = {
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.lollipop,
            R.drawable.nougat,
    };

    public ImageAdapter(Context c) {
        mContext = c;
        TypedArray a = mContext.obtainStyledAttributes(R.styleable.GalleryAndroid);
        mGalleryItemBackground = a.getResourceId(R.styleable.GalleryAndroid_android_galleryItemBackground, 0);
        a.recycle();
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(150, 170));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);

        return i;
    }
}
