package alanfuad.com.tangos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    Button sub,abt,sub1;
    Intent in,in1;
    ImageView title;
    Animation frombottom,frombottom2,fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sub = (Button)findViewById(R.id.sub);
        abt = (Button)findViewById(R.id.abt);
        title = (ImageView)findViewById(R.id.titles);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombuttom);
        frombottom2 = AnimationUtils.loadAnimation(this,R.anim.frombottom2);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        sub.setAnimation(frombottom);
        abt.setAnimation(frombottom2);
        title.setAnimation(fromtop);


        sub1 = (Button)findViewById(R.id.sub);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(in);
                Toast.makeText(SplashActivity.this, "START DRAWING NOW", Toast.LENGTH_LONG).show();
            }
        });




    }


    public void abt1(View view) {
        in1 = new Intent(SplashActivity.this,About.class);
        startActivity(in1);
        Toast.makeText(this, "Thanks for Installing Our App", Toast.LENGTH_SHORT).show();

    }
}
