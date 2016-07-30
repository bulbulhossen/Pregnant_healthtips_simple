package com.bulbulhossen.banglahealthtips.Main_Activity_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bulbulhossen.banglahealthtips.Adapter_Activity_Gallery.CustomAdapter_ListView;
import com.bulbulhossen.banglahealthtips.Health_SolutionView.Pregnant;
import com.bulbulhossen.banglahealthtips.R;

public class MainActivity extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        String[] str =
                {"গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা", "গর্ভকালীন ৫ সাধারণ সমস্যা"};


        final CustomAdapter_ListView adapter = new CustomAdapter_ListView(getApplicationContext(), android.R.id.text1, str);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "" + adapter.getItem(position), Toast.LENGTH_SHORT).show();

                switch (position) {

                    case 0:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;
                    case 1:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;
                    case 3:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;
                    case 4:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;
                    case 5:
                        i = new Intent(MainActivity.this, Pregnant.class);
                        break;

                }

                startActivity(i);


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
