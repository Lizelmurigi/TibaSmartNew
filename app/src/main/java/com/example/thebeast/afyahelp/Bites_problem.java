package com.example.thebeast.afyahelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Bites_problem extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bites_problem);
        listView=(ListView) findViewById(R.id.list_res);


        ImageView back_btn=findViewById(R.id.id_backmain);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);

            }
        });


        String[]description=getResources().getStringArray(R.array.array_bites_problem);

        Integer[] imgid={
                R.drawable.snake,
                R.drawable.spider,
                R.drawable.waspsting,
                R.drawable.jelly,
                R.drawable.dogbite
        };

        ListAdapter lady=new CustomAdapter(this,description,imgid);

        listView.setAdapter(lady);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int number=parent.getPositionForView(view);

                if(number==0){

                    Intent i=new Intent(getApplicationContext(),Snake_bite.class);
                    startActivity(i);
                }
                if(number==1){

                    Intent i=new Intent(getApplicationContext(),Spider_bite.class);
                    startActivity(i);
                }
                if(number==2){

                    Intent i=new Intent(getApplicationContext(),Bee_sting.class);
                    startActivity(i);
                }
                if(number==3){

                    Intent i=new Intent(getApplicationContext(),Jelly_sting.class);
                    startActivity(i);
                }
                if(number==4){

                    Intent i=new Intent(getApplicationContext(),Dog_bite.class);
                    startActivity(i);
                }

            }
        });


    }
}
