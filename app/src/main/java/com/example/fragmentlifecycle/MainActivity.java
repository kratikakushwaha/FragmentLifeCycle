package com.example.fragmentlifecycle;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
      String tag="msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(tag,"is method onCreate");

        if(savedInstanceState==null){
            Fragment1 fragment1=new Fragment1();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.lay,fragment1);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(tag,"is method onAttachFragment ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(tag,"is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(tag,"is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(tag,"is method onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(tag,"is method on Restart");


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(tag,"is method onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(tag,"is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(tag,"is method onDestroy");
    }
}


