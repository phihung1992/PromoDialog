package com.attlib.promodialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.attlib.attpromodialog.PromoDialog;
import com.attlib.attpromodialog.PromoDialogManager;

public class MainActivity extends AppCompatActivity {
    String dumpPackageName = "com.app2tap.logicriddles";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PromoDialogManager.getInstance().load("test", "test", dumpPackageName);
        findViewById(R.id.btn_show_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PromoDialogManager.getInstance().newDialog()
                        .setCanceled(true, false)
                        .setListener(new PromoDialog.OnCallBack() {
                            @Override
                            public void onOk() {

                            }

                            @Override
                            public void onCanceled() {
                                finish();
                            }
                        })
                        .show(MainActivity.this);
            }
        });
    }
}
