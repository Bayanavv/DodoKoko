package bayanavv.dodokoko.dodokoko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

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

        btnStart = findViewById(R.id.btnStart);
        btnMenue = findViewById(R.id.btnMenue);
        btnMoreInfo = findViewById(R.id.btnMoreInfo);
    }
}
