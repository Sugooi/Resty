package sugoi.android.resty;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignin,btnSignup;
    TextView txtslgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin = (Button) findViewById(R.id.signin);
        btnSignup = (Button) findViewById(R.id.signup);

        txtslgn = (TextView) findViewById(R.id.txtslgn);

        Typeface face = Typeface.createFromAsset(getAssets(),"font/NABILA.TTF");

        txtslgn.setTypeface(face);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
