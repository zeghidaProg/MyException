package com.conceptiondb.tlsryad.mypow;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.conceptiondb.tlsryad.mypow.databinding.ActivityMainBinding;

import javax.sql.DataSource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflate the layout
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //get data
        Mdatasource datasource = Mdatasource.get("World");

        //Assing value to element proprety
        binding.setDatasource(datasource);

    }




}
