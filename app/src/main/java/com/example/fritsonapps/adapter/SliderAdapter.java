package com.example.fritsonapps.adapter;

import android.content.*;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.*;
import android.support.*;
import android.widget.*;

import com.example.fritsonapps.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slider_images = {
            R.drawable.about_self,
            R.drawable.headphones,
            R.drawable.controller
    };

    public String[] slider_heading = {
            "PROFILE",
            "FAVORITE MUSIC",
            "HOBBY & INTEREST"
    };

    public String[] slider_description = {
            "Welcome to Fritson Apps. In this application you can learn\n about me. Starting " +
                    "from my full name, date of birth, \n" +
                    "address and others stuff about my profile",
            "You can learn about my favorite music that I often listen \n to & what kind of " +
                    "music genre that I like and much more",
            "Also you can learn about what kind of activity I like to do\n in my spare time" +
                    " and much more about my hobby and interest"
    };


    @Override
    public int getCount() {
        return slider_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout, container, false);

        ImageView SliderImagesView = view.findViewById(R.id.SliderImageView);
        TextView SliderHeadings = view.findViewById(R.id.HeadingTextView);
        TextView SliderDescs = view.findViewById(R.id.DescTextView);

        SliderImagesView.setImageResource(slider_images[position]);
        SliderHeadings.setText(slider_heading[position]);
        SliderDescs.setText(slider_description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
