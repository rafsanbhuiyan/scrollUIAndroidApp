package com.example.mutipageappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global variable
    TextView title1;

    //Add button
    Button next_Activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_Activity_button = (Button)findViewById(R.id.firstActivityButtonNext);
        title1 = (TextView)findViewById(R.id.firstActivityText);

        title1.setText("Android Studio Setup Instructions\n\n" +
                "\n" +
                "1)Go to a web browser" +
                "\n2)Visit the Oracle Website" +
                "\n3)Download the Java Development" +
                "\n4)Here is the site: " +
                "\n5)http://www.oracle.com/technetwork/java/javase/downloads/index.html" +
                "\n6)Install the Java Development" +
                "\n7)Visit the Java Website" +
                "\n8)https://java.com/en/download/" +
                "\n9)Download the Java Runtime" +
                "\n10)Install the Java Runtime" +
                "\n11)Check the requirements for your platform" +
                "\n12)Check the system setting of your computer " +
                "\n13)Visit the Android Studio website" +
                "\n14)Click the following link" +
                "\n15)https://developer.android.com/studio/index.html " +
                "\n16)Download the android studio installation application" +
                "\n17)Start the application" +
                "\n18)Choose the directory you want the installation to exist in" +
                "\n19)Start the installation" +
                "\n20)Launch Android Studio");

        //Add button clickListener
        next_Activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Set the intent method
                Intent intent = new Intent(MainActivity.this, activity_second.class);

                //Start Activity
                startActivity(intent);
            }
        });
    }
}
