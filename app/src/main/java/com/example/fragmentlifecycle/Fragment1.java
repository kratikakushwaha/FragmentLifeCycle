package com.example.fragmentlifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Fragment1 extends Fragment {

 String tag="msg";

    @Override
    public void onAttach(Context context) {
        Log.i(tag,"1 is method onAttach");
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(tag,"1 is method onCreate");
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(tag,"1 is method onCreateView");
        return inflater.inflate(R.layout.fragment_fragment1,container,false) ;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(tag,"1 is method onActivityCreated");
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        Log.i(tag,"1 is method onStart");
        super.onStart();

    }

    @Override
    public void onResume() {
        Log.i(tag,"1 is method onResume");
        super.onResume();

    }

    @Override
    public void onPause() {
        Log.i(tag,"1 is method onPause");
        super.onPause();

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i(tag,"1 is method onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i(tag,"1 is method onStop");
        super.onStop();

    }

    @Override
    public void onDestroyView() {
        Log.i(tag,"1 is method onDestroyView");
        super.onDestroyView();

    }

    @Override
    public void onDestroy() {
        Log.i(tag,"1 is method onDestroy");
        super.onDestroy();

    }

    @Override
    public void onDetach() {
        Log.i(tag,"1 is method onDetach");
        super.onDetach();

    }
}