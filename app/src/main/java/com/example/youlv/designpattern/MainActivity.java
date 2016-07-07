package com.example.youlv.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText price;
    private EditText num;
    private TextView total;
    private Button sure;
    private Button reset;

    private static final String[] types = {"正常收费", "打八折", "打七折", "打五折"};
    private ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        setAdapte();
        setClick();
    }

    private void setClick() {
        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("");
            }
        });
    }

    private void setAdapte() {
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types);
        //设置下拉列表风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将适配器添加到spinner中去
        spinner.setAdapter(adapter);
        spinner.setVisibility(View.VISIBLE);//设置默认显示
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    private void assignViews() {
        spinner = (Spinner) findViewById(R.id.type);
        price = (EditText) findViewById(R.id.price);
        num = (EditText) findViewById(R.id.num);
        total = (TextView) findViewById(R.id.total);
        sure = (Button) findViewById(R.id.sure);
        reset = (Button) findViewById(R.id.reset);
    }
}
