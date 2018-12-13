package bayanavv.dodokoko.dodokoko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

//מיין אקטיביטי ויושר ממסך באקטיביטי אבל שדרך האפקופלקטיביטי כדי לתמוך בגרסאות קודמות
public class MainActivity extends AppCompatActivity {
    //Properties:

    private ImageButton btnStart;
    private ImageButton btnMenue;
    private ImageButton btnMoreInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activey.setContentView(xml layout)
        btnStart = findViewById(R.id.btnStart);
        btnMenue = findViewById(R.id.btnMenue);
        btnMoreInfo = findViewById(R.id.btnMoreInfo);


        //code that runs onClick

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Start button", Toast.LENGTH_SHORT).show();
            }
        });

        btnMenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menue Button", Toast.LENGTH_SHORT).show();
            }
        });

        btnMoreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "More info button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
