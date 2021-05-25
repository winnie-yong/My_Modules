package sg.edu.rp.c346.id20013783.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button bckButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvAnswer = findViewById(R.id.textView);
        bckButton = findViewById(R.id.backbutton);

        Intent intentReceived = getIntent();
        tvAnswer.setText("Module Code:C346\nModule Name:Android Programming\nAcademic Year:2020\nSemester:1\nModule Credit:4\nVenue:W66M");

        bckButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(FirstActivity.this,MainActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

    }

}
