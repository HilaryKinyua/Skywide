package skywide.co.ke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {
	ImageView imgmove;
	Animation animMoveUp;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imgmove=(ImageView)findViewById(R.id.imganim);

		//Move Animation
		animMoveUp=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
		imgmove.setVisibility(View.VISIBLE);
		imgmove.startAnimation(animMoveUp);

		int SPLASH_TIME_OUT = 3000;
		new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */




            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
