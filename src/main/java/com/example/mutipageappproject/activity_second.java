package com.example.mutipageappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {

    //Global variable
    TextView title2;

    //Add buttons next and previous
    Button next_button, previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Assigning IDs
        next_button = (Button)findViewById(R.id.secondActivityButtonNext);
        previous_button = (Button)findViewById(R.id.secondActivityButtonPrevious);
        title2 = (TextView)findViewById(R.id.secondActivityText);

        //Set text to print the string content in the app
        title2.setText("Android Project with step-by-step instructions\n\n" +
                "\n1)Open Android Studio App" +
                "\n2)Choose File Menu" +
                "\n3)Select New Project from the Drop Down menu" +
                "\n4)The new project wizard will open up" +
                "\n5)Enter the application name. Example: helloWorldApp" +
                "\n6)Company Domain should generate automatically" +
                "\n7)Choose a location for the project" +
                "\n8)Select phone or table, choose the appropriate SDK" +
                "\n9)Choose Blank Activity in the Activity Box" +
                "\n10)Click Next" +
                "\n11)An activity screen will appear" +
                "\n12)Enter activity name in the Activity Name Box " +
                "\n13)Enter the Layout name" +
                "\n14)Enter the Title" +
                "\n15)Enter the Menu Resource Name" +
                "\n16)Click the finish button to create a blank project" +
                "\n17)Take a moment to review the necessary files" +
                "\n18)Make sure the Project Window is open" +
                "\n19)If you don't see the project window:" +
                "\n20)Select View Menu -> Tool Window -> Project" +
                "\n21)Once the Project Window is open you will see the following files:" +
                "\n22)Main Activity file: App -> java -> com.example.myfirstapp -> Main Activity" +
                "\n23)XML file: app -> res -> layout -> activity_main.xml" +
                "\n24)Manifest: app ->manifest -> AndroidManifest.xml" +
                "\n25Gradle Scripts -> build.gradle)" +
                "\n26)Now connect your device or use the built in Emulator" +
                "\n27)For Android Phone functions:" +
                "\n28)Go to developer options on the phone" +
                "\n29)Select build number -> USB debugging" +
                "\n30)And Connect!!");

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create the intent for next_button
                Intent intent = new Intent(activity_second.this, activity_third.class);
                startActivity(intent);
            }
        });

        previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create the intent for next_button
                Intent intent = new Intent(activity_second.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
