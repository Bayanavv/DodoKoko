package bayanavv.dodokoko.dodokoko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

//מיין אקטיביטי ויושר ממסך באקטיביטי אבל שדרך האפקופלקטיביטי כדי לתמוך בגרסאות קודמות
public class MainActivity extends AppCompatActivity {
    //Properties:

    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this,GameActivity.class);
        startActivity(intent);
    }

    public void Menue(View view) {
    }

    public void moreInfo(View view) {
    }
}
