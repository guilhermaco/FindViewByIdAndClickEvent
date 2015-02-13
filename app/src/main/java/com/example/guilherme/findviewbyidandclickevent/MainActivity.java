package com.example.guilherme.findviewbyidandclickevent;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting reference of the views from the R.java
        editText = (EditText)findViewById(R.id.editText);
        Button button1 = (Button)findViewById(R.id.button_toast1);
        Button button2 = (Button)findViewById(R.id.button_toast2);
        //Adding onClickListener to the buttons. Note that it needs to pass an class that implements View.OnclickListener as parameter.
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String text = null;
        switch(view.getId()){
            case R.id.button_toast1:
                text = editText.getText().toString();
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_toast2:
                text = editText.getText().toString();
                Toast.makeText(this, text, Toast.LENGTH_LONG).show();
                break;
}
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
