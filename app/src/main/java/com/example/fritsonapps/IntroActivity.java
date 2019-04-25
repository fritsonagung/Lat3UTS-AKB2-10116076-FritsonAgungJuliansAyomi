package com.example.fritsonapps;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import com.example.fritsonapps.adapter.SliderAdapter;

public class IntroActivity extends AppCompatActivity {

    private ViewPager SlideViewPager;
    private LinearLayout DotsSlider;
    private SliderAdapter sliderAdapter;
    private TextView[] Dots;
    private Button NextButton;
    private Button BackButton;
    private int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        SlideViewPager = findViewById(R.id. ViewPagerSlider);
        DotsSlider = findViewById(R.id. LinearSliderDot);
        NextButton = findViewById(R.id.buttonNext);
        BackButton = findViewById(R.id.buttonBack);

        sliderAdapter = new SliderAdapter(this);
        SlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        SlideViewPager.addOnPageChangeListener(viewListener);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( NextButton.getText() == "Finish"){
                    startActivity(new Intent(IntroActivity.this, MainActivity.class));
                }
                else{
                    SlideViewPager.setCurrentItem(currentPage + 1);
                }
            }
        });

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SlideViewPager.setCurrentItem(currentPage - 1);
            }
        });
    }

    public void addDotsIndicator(int position){
        Dots = new TextView[3];
        DotsSlider.removeAllViews();

        for (int i = 0; i < Dots.length; i++){
            Dots[i] = new TextView(this);
            Dots[i].setText(Html.fromHtml("&#8226;"));
            Dots[i].setTextSize(35);
            Dots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            DotsSlider.addView(Dots[i]);
        }

        if (Dots.length > 0){
            Dots[position].setTextColor(getResources().getColor(R.color.colorHotPink));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);

            currentPage = i;

            if(i == 0){
                NextButton.setEnabled(true);
                BackButton.setEnabled(false);
                BackButton.setVisibility(View.INVISIBLE);

                NextButton.setText("Next");
                BackButton.setText("");
            }
            else if (i == Dots.length - 1){
                NextButton.setEnabled(true);
                BackButton.setEnabled(true);
                BackButton.setVisibility(View.VISIBLE);

                NextButton.setText("Finish");
                BackButton.setText("Back");
            }
            else{
                NextButton.setEnabled(true);
                BackButton.setEnabled(true);
                BackButton.setVisibility(View.VISIBLE);

                NextButton.setText("Next");
                BackButton.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
