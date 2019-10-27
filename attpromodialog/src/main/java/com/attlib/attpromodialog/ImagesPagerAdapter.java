package com.attlib.attpromodialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.bumptech.glide.Glide;

public class ImagesPagerAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private AdDialogInfo[] mData;

    public ImagesPagerAdapter(Context context, AdDialogInfo[] data) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mData = data;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView itemView = (ImageView) mInflater.inflate(R.layout.item_image, container, false);
        if (mData != null)
            Glide.with(mContext).load(mData[position].getPromoImage()).into(itemView);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
