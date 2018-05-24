package tk.mrchupee.www.hackinghelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hacking program clustermess

        // Martial Arts tables and notes
        TextView martial_arts = (TextView) findViewById(R.id.martial_arts_button);
        // Set a click listener on that View
        martial_arts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ma_intent = new Intent(MainActivity.this, MartialArtsActivity.class);
                startActivity(ma_intent);
            }
        });

        // Booty L1 and L2 tables

        // Metachemistry L1 and L2 tables

        // Notebook
    }


}
