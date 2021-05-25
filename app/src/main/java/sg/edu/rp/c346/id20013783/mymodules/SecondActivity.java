package sg.edu.rp.c346.id20013783.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button bckButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        bckButton = findViewById(R.id.backbutton);

        Intent intentReceived = getIntent();
        tvAnswer.setText("Module Code:C218\nModule Name:UX/UI for apps\nAcademic Year:2020\nSemester:1\nModule Credit:4\nVenue:W67M");

        bckButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });
    }
}