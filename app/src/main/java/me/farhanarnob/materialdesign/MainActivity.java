package me.farhanarnob.materialdesign;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //List<String> country;
    ArrayAdapter<CharSequence> arrayAdapter;
    FloatingActionButton fabAuto;
    private AppCompatSpinner appCompatSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        fabAuto = (FloatingActionButton) findViewById(R.id.fab_main);
        fabAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        button.setBackgroundColor(Color.RED);


        // initializing
        //countryListInitializingAndAddSomeValue();
        // using array from xml file
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.country_list, android.R.layout.simple_dropdown_item_1line);
        appCompatSpinner = (AppCompatSpinner) findViewById(R.id.spinner_toolbar);


        // add adapter to the spinner list
        appCompatSpinner.setAdapter(arrayAdapter);

        

        //giving custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);


    }

//    private void countryListInitializingAndAddSomeValue() {
//        country = new ArrayList<>();
//        country.add("Bangladesh");
//        country.add("India");
//        country.add("Bhutan");
//        country.add("Maldip");
//    }

    //giving menu into the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_for_activity_main_page, menu);
        return true;
    }

    // menu item click option has been added here.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_about_us:
                Toast.makeText(MainActivity.this, "You have been clicked about us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_setting:
                Toast.makeText(MainActivity.this, "You have been clicked setting", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
