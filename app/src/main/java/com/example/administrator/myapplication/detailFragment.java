package com.example.administrator.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class detailFragment extends Fragment {
    public static final String KEY_CITY_NAME="KEY_CITY_NAME";

    public detailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle=getArguments();
        if(bundle!=null&&bundle.containsKey(KEY_CITY_NAME)){
            showSelectedCityName(bundle.getString(KEY_CITY_NAME));

        }
    }

    private void showSelectedCityName(String cityname) {
        ((TextView)getView().findViewById(R.id.tv)).setText(cityname);
    }
}
