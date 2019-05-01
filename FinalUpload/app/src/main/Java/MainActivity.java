package com.tadlockc.ffbearmory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates the action for when the button is pressed to make it go to a new activity page.
        Button homepageWepsButton = (Button) findViewById(R.id.homepageWepsButton);
        homepageWepsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoArmory = new Intent(getApplicationContext(), ArmoryPageActivity.class);
                // Only do this if you want to send information from first activity to next one i.e Hello World in this case would be sent to the second activity
                // gotoArmory.putExtra("com.example.nyapplication.SOMETHING", "HELLO WORLD!");
                startActivity(gotoArmory);

                // Creates the action for when the button is pressed to make it go to a new activity page.
                Button homepageUnitsButton = (Button) findViewById(R.id.homepageUnitsButton);
                homepageUnitsButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gotoUnits = new Intent(getApplicationContext(), UnitsPageActivity.class);
                        startActivity(gotoUnits);

                    }
                });
            }
        });
    }
}

//        Attempt to launch an activity outside our app i.e. load a url upon button click
//        Button whaterverYouNameTheButton = (Button) findViewById(R.id.whaterverYouNameTheButton);
//        whaterverYouNameTheButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String whateverYouNameTheString = "http://www.url.com";
//                Uri whateverYouNameTheUri = Uri.parse(whateverYouNameTheString);
//
//                Intent whateverYouNameTheIntent = new Intent(Intent.ACTION_VIEW, whateverYouNameTheUri);
//                if (whateverYouNameTheIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(whateverYouNameTheIntent);
//                }

//            }
//        });

//    }
//}
