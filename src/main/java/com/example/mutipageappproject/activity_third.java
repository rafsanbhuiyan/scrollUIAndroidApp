package com.example.mutipageappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activity_third extends AppCompatActivity {

    //Global Variable
    TextView title3;

    //Adding button
    Button previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Assigning ID to global variables
        previous_button = (Button)findViewById(R.id.thirdActivityButtonPrevious);
        title3 = (TextView)findViewById(R.id.thirdActivityText);

        //Print text on the app using setText for title3
        title3.setText("Compile Android Project\n\n" +
                "\n1)A simple Demonstration" +
                "\n2)Open New Project from the File menu" +
                "\n3)Quick Start menu -> Select 'Start a new Android Studio project'" +
                "\n4)Choose a company name" +
                "\n5)Click next" +
                "\n6)Choose Phone and Tablet" +
                "\n7)To test the app on your phone verify the minimum SDK requirements" +
                "\n8)Click Next" +
                "\n9)Choose Blank Activity" +
                "\n10)Click Finish" +
                "\n11)Navigate to the activity_main.xml" +
                "\n12)Click and drag the 'Hello World to the center of the screen'" +
                "\n13)Replace the 'Hello World' if desired" +
                "\n14)Navigate to the Palette menu" +
                "\n15)Click and drag a button to the screen" +
                "\n16)Make sure the button is still selected" +
                "\n17)Go to Properties Menu and scroll down to find the field for text input" +
                "\n18)Replace the text 'New Button' to 'Next'" +
                "\n19)Top of the project's file system tree, right click on 'app'" +
                "\n20)Select New > Activity > Blank Activity" +
                "\n21)Choose the name of the activity, preferably SecondActivity" +
                "\n22)Drag a text box on the upper left of the screen to the center" +
                "\n23)Keep the text box selected" +
                "\n24)Name the text box id" +
                "\n25)Type something in the text box" +
                "\n26)set the text field to '@string/second_page'" +
                "\n27)Select the main activity and type appropriate functions" +
                "\n28)Set the OnClickListen Funtion" +
                "\n29)Set the Intent object and the startActivity(intent) functions" +
                "\n30)Press the play button at the top of the application to compile!!");

        //Add clicklistener to button
        previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Set intents to activate the funcitions of this project

                Intent intent = new Intent(activity_third.this, activity_second.class );

                //Start activity using startActivity() and intent object as parameter
                startActivity(intent);
            }
        });


    }
}
