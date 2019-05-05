package com.example.fritsonapps.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fritsonapps.R;
import com.example.fritsonapps.adapter.DailyActivityAdapter;
import com.example.fritsonapps.model.DailyActivityModel;
import com.example.fritsonapps.presenter.DailyActivityPresenter;
import com.example.fritsonapps.presenter.DailyActivityPresenterImpl;
import com.example.fritsonapps.view.DailyActivityView;

import java.util.ArrayList;
import java.util.List;

/*
 Nama : Fritson Agung Julians Ayomi
 NIM  : 10116076
 Kelas: AKB-2
 Tanggal Pengerjaan : 29 April 2019
 */

public class DailyActivitySubFragment extends Fragment implements DailyActivityView {

    public View v;
    private RecyclerView recyclerDaily;
    private List<DailyActivityModel> activities = new ArrayList<>();
    private DailyActivityAdapter dailyActivityAdapter;
    private DailyActivityPresenter dailyActivityPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.daily_activity_fragment_sub, container, false);

        dailyActivityPresenter = new DailyActivityPresenterImpl(this);

        recyclerDaily = v.findViewById(R.id.recycler_view_daily);
        recyclerDaily.setLayoutManager(new LinearLayoutManager(this.getContext()));

        dailyActivityAdapter = new DailyActivityAdapter(activities);

        recyclerDaily.setAdapter(dailyActivityAdapter);

        dailyActivityPresenter.load();

        return v;
    }


    @Override
    public void onLoad(List<DailyActivityModel> activity) {
        activities.clear();
        activities.addAll(activity);

        dailyActivityAdapter.notifyDataSetChanged();
    }
}