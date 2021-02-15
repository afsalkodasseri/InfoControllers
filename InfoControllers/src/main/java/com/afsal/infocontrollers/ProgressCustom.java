package com.afsal.infocontrollers;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.victor.loading.rotate.RotateLoading;

public class ProgressCustom {
    Context context;
    Dialog dialog;
    TextView txtMessege;
    RotateLoading rotateLoading;
    public ProgressCustom(Context context)
    {
        this.context=context;
        dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_progress_custom);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCancelable(false);
        txtMessege=dialog.findViewById(R.id.textView);
        rotateLoading=dialog.findViewById(R.id.rotateloading);
        rotateLoading.start();
    }

    public void setMessege(String msg)
    {
        txtMessege.setText(msg);
    }

    public void show()
    {
        dialog.show();
    }

    public void dismiss()
    {
        dialog.dismiss();
    }
    public void setCancellable(boolean ft)
    {
        dialog.setCancelable(ft);
    }
}
