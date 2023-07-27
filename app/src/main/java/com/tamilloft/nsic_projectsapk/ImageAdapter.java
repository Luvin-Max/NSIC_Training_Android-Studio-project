package com.tamilloft.nsic_projectsapk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    public Integer[] image = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four
    };

    public ImageAdapter(Context c) {
        context = c;
    }

    public int getCount() {
            return image.length;
}

    @Override
    public Object getItem(int position) {
        return image[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return  imageView;
    }
}

