package com.lh.lineview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LineView mLineView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLineView = (LineView) findViewById(R.id.line_view);
        setLineData();
        findViewById(R.id.random_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLineData();
            }
        });
    }

    private void setLineData() {
        List<Data> datas = new ArrayList<>();
        for (int i = 0;i<7;i++){
            Data data = new Data(i+1+"天", (float) ((Math.random() - 0.5) * 100));
            datas.add(data);
        }
        mLineView.setDatas(datas);
    }
}
