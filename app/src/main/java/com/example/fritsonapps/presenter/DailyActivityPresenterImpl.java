package com.example.fritsonapps.presenter;

import com.example.fritsonapps.R;
import com.example.fritsonapps.model.DailyActivityModel;
import com.example.fritsonapps.view.DailyActivityView;

import java.util.ArrayList;
import java.util.List;


/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 29 April 2019
 */

public class DailyActivityPresenterImpl implements DailyActivityPresenter {

    private DailyActivityView dailyactivityView;

    private List<DailyActivityModel> activities = new ArrayList<>();

    public DailyActivityPresenterImpl(DailyActivityView dailyActivityView) {
        this.dailyactivityView = dailyActivityView;
        setData();
    }

    private void setData() {
        DailyActivityModel activity = new DailyActivityModel();
        activity.setIcon(R.drawable.ic_sleep);
        activity.setNamaActivity("Bangun Tidur");
        activity.setWaktuActivity("05.00");
        activities.add(activity);

        DailyActivityModel activity1 = new DailyActivityModel();
        activity1.setIcon(R.drawable.ic_shower);
        activity1.setNamaActivity("Mandi");
        activity1.setWaktuActivity("06.00");
        activities.add(activity1);

        DailyActivityModel activity2 = new DailyActivityModel();
        activity2.setIcon(R.drawable.ic_bus);
        activity2.setNamaActivity("Berangkat Kuliah");
        activity2.setWaktuActivity("06.30");
        activities.add(activity2);

        DailyActivityModel activity3 = new DailyActivityModel();
        activity3.setIcon(R.drawable.ic_book);
        activity3.setNamaActivity("Kuliah");
        activity3.setWaktuActivity("07.00");
        activities.add(activity3);

        DailyActivityModel activity4 = new DailyActivityModel();
        activity4.setIcon(R.drawable.ic_eat);
        activity4.setNamaActivity("Makan Siang");
        activity4.setWaktuActivity("11.00");
        activities.add(activity4);

        DailyActivityModel activity5 = new DailyActivityModel();
        activity5.setIcon(R.drawable.ic_bus);
        activity5.setNamaActivity("Pulang Kuliah");
        activity5.setWaktuActivity("17.30");
        activities.add(activity5);

        DailyActivityModel activity6 = new DailyActivityModel();
        activity6.setIcon(R.drawable.ic_eat);
        activity6.setNamaActivity("Makan Malam");
        activity6.setWaktuActivity("18.00");
        activities.add(activity6);

        DailyActivityModel activity7 = new DailyActivityModel();
        activity7.setIcon(R.drawable.ic_headphones);
        activity7.setNamaActivity("Dengar Musik");
        activity7.setWaktuActivity("18.30");
        activities.add(activity7);

        DailyActivityModel activity8 = new DailyActivityModel();
        activity8.setIcon(R.drawable.ic_game_controller);
        activity8.setNamaActivity("Bermain Game");
        activity8.setWaktuActivity("19.00");
        activities.add(activity8);

        DailyActivityModel activity9 = new DailyActivityModel();
        activity9.setIcon(R.drawable.ic_book);
        activity9.setNamaActivity("Mengerjakan Tugas");
        activity9.setWaktuActivity("20.00");
        activities.add(activity9);

        DailyActivityModel activity10 = new DailyActivityModel();
        activity10.setIcon(R.drawable.ic_sleep);
        activity10.setNamaActivity("Tidur");
        activity10.setWaktuActivity("23.00");
        activities.add(activity10);

    }

    @Override
    public void load() {
        dailyactivityView.onLoad(activities);
    }
}
