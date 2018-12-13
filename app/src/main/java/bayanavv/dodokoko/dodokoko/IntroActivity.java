package bayanavv.dodokoko.dodokoko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {

    private ImageView imageLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        imageLogo = findViewById(R.id.imageLogo);

        ((View) imageLogo).animate().setDuration(1000).rotation(360);
    }


}
