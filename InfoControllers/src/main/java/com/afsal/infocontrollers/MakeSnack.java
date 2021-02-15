package com.afsal.infocontrollers;

import android.content.Context;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MakeSnack {
    public MakeSnack(View parent,String msg)
    {
        Snackbar.make(parent,msg, BaseTransientBottomBar.LENGTH_SHORT).show();
    }
}
