package com.example.administrator.myapplication;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    boolean daulPane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masterFragment master=null;
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.frame);
        if(frameLayout!=null){
            daulPane=false;
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            master=(masterFragment)getFragmentManager().findFragmentByTag("MASTER");
            if(master!=null){
                master=new masterFragment();
                transaction.add(R.id.frame_master,master,"MASTER");
            }
            transaction.commit();
        }else {
            daulPane=true;
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            master=(masterFragment)getFragmentManager().findFragmentById(R.id.frame_master);
            if(master!=null){
                master=new masterFragment();
                transaction.add(R.id.frame_master,master);
            }

        }
    }
}
