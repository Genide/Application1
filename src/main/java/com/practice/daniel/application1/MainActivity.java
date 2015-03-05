package com.practice.daniel.application1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.ListIterator;


public class MainActivity extends ActionBarActivity {
    private EditText userNameEditText;
    private Button yesButton;
    private Button noButton;
    private LinkedList<String> uselessMessageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesButton = (Button) findViewById(R.id.yes_button);
        noButton = (Button) findViewById(R.id.no_button);
        userNameEditText = (EditText) findViewById(R.id.users_name_edit_text);

        uselessMessageList = new LinkedList<String>();
        uselessMessageList.add("Hello World");
        uselessMessageList.add("I'm going to just tell you now, but this button is useless");
        uselessMessageList.add("Why are you still clicking on this button?");
        uselessMessageList.add("Seriously, you can stop now.");
        uselessMessageList.add("...");
        uselessMessageList.add("......");
        uselessMessageList.add(".........");
        uselessMessageList.add("Alright keep on clicking.");
        uselessMessageList.add("But nothing is going to happen.");
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

    public void onYesButtonClick(View view) {
        String usersName = String.valueOf(userNameEditText.getText());
        String yourYesResponse = "That's great "+usersName;
        Toast.makeText(this, yourYesResponse,Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {
        String usersName = String.valueOf(userNameEditText.getText());
        String yourNoResponse = "That's too bad "+usersName;
        Toast.makeText(this, yourNoResponse,Toast.LENGTH_LONG).show();
    }
}
