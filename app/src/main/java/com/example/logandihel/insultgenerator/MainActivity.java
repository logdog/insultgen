package com.example.logandihel.insultgenerator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView top = (TextView)findViewById(R.id.textView);
                TextView middle = (TextView)findViewById(R.id.textView2);
                TextView bottom = (TextView)findViewById(R.id.textView3);

                Resources r = getResources();
                String[] adjs = r.getStringArray(R.array.adj);
                String[] nouns = r.getStringArray(R.array.noun);
                String[] ers = r.getStringArray(R.array.er);

                String adj = adjs[(int)(Math.random() * adjs.length)];
                String noun = nouns[(int)(Math.random() * nouns.length)];
                String er = ers[(int)(Math.random() * ers.length)];

                adj = adj.substring(0, 1).toUpperCase() + adj.substring(1);
                noun = noun.substring(0, 1).toUpperCase() + noun.substring(1);
                er = er.substring(0, 1).toUpperCase() + er.substring(1);

                top.setText(adj);
                middle.setText(noun);
                bottom.setText(er);
            }
        });
    }
}
