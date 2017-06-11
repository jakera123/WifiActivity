package com.zxp.wifiactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btn_startWifi=null;
    private Button btn_stopWifi=null;
    private Button btn_checkWifi=null;
    private WifiManager wifiManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_startWifi=(Button)findViewById(R.id.btn_startWifi);
        btn_stopWifi=(Button)findViewById(R.id.btn_stopWifi);
        btn_checkWifi=(Button)findViewById(R.id.btn_checkwifi);
        btn_startWifi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WifiManagerLeak")
            @Override
            public void onClick(View v) {

                    wifiManager=(WifiManager)MainActivity.this.getSystemService(Context.WIFI_SERVICE);
                    wifiManager.setWifiEnabled(true);
                    System.out.println("wifi state-->"+wifiManager.getWifiState());


            }
        });

        btn_stopWifi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WifiManagerLeak")
            @Override
            public void onClick(View v) {
                wifiManager=(WifiManager)MainActivity.this.getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(false);
                System.out.println("wifi state-->"+wifiManager.getWifiState());
            }
        });

        btn_checkWifi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WifiManagerLeak")
            @Override
            public void onClick(View v) {
                wifiManager=(WifiManager)MainActivity.this.getSystemService(Context.WIFI_SERVICE);
                System.out.println("wifi state-->"+wifiManager.getWifiState());
            }
        });





    }
}
