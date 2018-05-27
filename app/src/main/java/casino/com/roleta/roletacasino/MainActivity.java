package casino.com.roleta.roletacasino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    ImageView iv_weel;

    Random r;

    int novo, velho = 0;

    private static final float FACTOR = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        iv_weel = (ImageView) findViewById(R.id.iv_wheel);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                velho = novo % 360;

                novo = r.nextInt(3600) + 720;

                RotateAnimation rotate = new RotateAnimation(velho, novo,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotate.setDuration(3600);

                rotate.setFillAfter(true);

                rotate.setInterpolator(new DecelerateInterpolator());

                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (novo % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                iv_weel.startAnimation(rotate);


            }
        });

    }

    private String currentNumber(int novo){

        String text = "";

        if(novo >= (FACTOR * 1) && novo < (FACTOR * 3)){
            text = "32 Red";
        }
        if(novo >= (FACTOR * 3) && novo < (FACTOR * 5)){
            text = "15 black";
        }
        if(novo >= (FACTOR * 5) && novo < (FACTOR * 7)){
            text = "19 Red";
        }
        if(novo >= (FACTOR * 7) && novo < (FACTOR * 9)){
            text = "4 black";
        }
        if(novo >= (FACTOR * 9) && novo < (FACTOR * 11)){
            text = "21 Red";
        }
        if(novo >= (FACTOR * 11) && novo < (FACTOR * 13)){
            text = "2 black";
        }
        if(novo >= (FACTOR * 13) && novo < (FACTOR * 15)){
            text = "25 Red";
        }
        if(novo >= (FACTOR * 15) && novo < (FACTOR * 17)){
            text = "17 black";
        }
        if(novo >= (FACTOR * 17) && novo < (FACTOR * 19)){
            text = "34 Red";
        }
        if(novo >= (FACTOR * 19) && novo < (FACTOR * 21)){
            text = "6 black";
        }
        if(novo >= (FACTOR * 21) && novo < (FACTOR * 23)){
            text = "27 Red";
        }
        if(novo >= (FACTOR * 23) && novo < (FACTOR * 25)){
            text = "13 black";
        }
        if(novo >= (FACTOR * 25) && novo < (FACTOR * 27)){
            text = "36 Red";
        }
        if(novo >= (FACTOR * 27) && novo < (FACTOR * 29)){
            text = "11 black";
        }
        if(novo >= (FACTOR * 29) && novo < (FACTOR * 31)){
            text = "30 Red";
        }
        if(novo >= (FACTOR * 31) && novo < (FACTOR * 33)){
            text = "8 black";
        }
        if(novo >= (FACTOR * 33) && novo < (FACTOR * 35)){
            text = "23 Red";
        }
        if(novo >= (FACTOR * 35) && novo < (FACTOR * 37)){
            text = "10 black";
        }
        if(novo >= (FACTOR * 37) && novo < (FACTOR * 39)){
            text = "5 Red";
        }
        if(novo >= (FACTOR * 39) && novo < (FACTOR * 41)){
            text = "24 black";
        }
        if(novo >= (FACTOR * 41) && novo < (FACTOR * 43)){
            text = "16 Red";
        }
        if(novo >= (FACTOR * 43) && novo < (FACTOR * 45)){
            text = "36 black";
        }
        if(novo >= (FACTOR * 45) && novo < (FACTOR * 47)){
            text = "1 Red";
        }
        if(novo >= (FACTOR * 47) && novo < (FACTOR * 49)){
            text = "20 black";
        }
        if(novo >= (FACTOR * 49) && novo < (FACTOR * 51)){
            text = "14 Red";
    }
        if(novo >= (FACTOR * 51) && novo < (FACTOR * 53)){
            text = "33 black";
        }
        if(novo >= (FACTOR * 53) && novo < (FACTOR * 55)){
            text = "9 Red";
        }
        if(novo >= (FACTOR * 55) && novo < (FACTOR * 57)){
            text = "22 black";
        }
        if(novo >= (FACTOR * 57) && novo < (FACTOR * 59)){
            text = "18 Red";
        }
        if(novo >= (FACTOR * 59) && novo < (FACTOR * 61)){
            text = "29 black";
        }
        if(novo >= (FACTOR * 61) && novo < (FACTOR * 63)){
            text = "7 Red";
        }
        if(novo >= (FACTOR * 63) && novo < (FACTOR * 65)){
            text = "28 black";
        }
        if(novo >= (FACTOR * 65) && novo < (FACTOR * 67)){
            text = "12 Red";
        }
        if(novo >= (FACTOR * 67) && novo < (FACTOR * 69)){
            text = "35 black";
        }
        if(novo >= (FACTOR * 69) && novo < (FACTOR * 71)){
            text = "3 Red";
        }
        if(novo >= (FACTOR * 71) && novo < (FACTOR * 73)){
            text = "26 black";
        }

        if(novo >= (FACTOR * 73) && novo < 360 || (novo >= 0) && novo < (FACTOR * 1)){

            text = "0";

        }

        return text;
    }
}
