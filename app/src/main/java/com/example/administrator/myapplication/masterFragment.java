package com.example.administrator.myapplication;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class masterFragment extends ListFragment {
    private OnMasterSelectedLister listener=null;

    public masterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String[] cityAraay=new String[]{"1","2","3","4","5"};
        ListAdapter adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,cityAraay);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(listener!=null){
                    listener.onItemSelected(((TextView)view).getText().toString());
                }
            }
        });
    }

    public void setOnMasterSelectedLister(OnMasterSelectedLister lister){
        this.listener=lister;
    }
    public interface OnMasterSelectedLister{
        void onItemSelected(String cityname);
    }
}
