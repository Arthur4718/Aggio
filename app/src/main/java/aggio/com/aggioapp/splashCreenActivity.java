package aggio.com.aggioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class splashCreenActivity extends AppCompatActivity {

    private ImageView splashImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_creen);
        getSupportActionBar().hide();

        splashImage = (ImageView) findViewById(R.id.splashImageView);

        splashImage.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               
                                           }
                                       }
        );
    }
}
