package com.afsal.infocontrollers;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MakeToast {
    public MakeToast(Context parent, String msg)
    {
        Toast.makeText(parent,msg, Toast.LENGTH_SHORT).show();
    }
}
