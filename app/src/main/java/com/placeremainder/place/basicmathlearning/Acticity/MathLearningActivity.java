package com.placeremainder.place.basicmathlearning.Acticity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.placeremainder.place.basicmathlearning.R;
import com.placeremainder.place.basicmathlearning.TransparentStatusBarActivity;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MathLearningActivity extends TransparentStatusBarActivity {

    @BindView(R.id.questionChange)
    View myView;
    @BindView(R.id.question)
    Button question;
    @BindView(R.id.next)
    Button next;
    @BindView(R.id.correct)
    Button correct;
    @BindView(R.id.wrong)
    Button wrong;
    @BindView(R.id.start_learning)
    Button startLearning;

    @BindView(R.id.checkbox1)
    CheckBox checkBox1;
    @BindView(R.id.checkbox2)
    CheckBox checkBox2;
    @BindView(R.id.checkbox3)
    CheckBox checkBox3;
    @BindView(R.id.checkbox4)
    CheckBox checkBox4;
    boolean isUp;
    int correctAnswer=0;
    int wrongAnswer=0;
    int randomDigit1=0;
    int randomDigit2=0;
    int answer;
    Random randomObject;
    int selectCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_learning);
        ButterKnife.bind(this);
        randomObject=new Random();
        Intent i = getIntent();
        correctAnswer=i.getIntExtra("add",0);
        beginerLevel();
        final MediaPlayer nice = MediaPlayer.create(this, R.raw.nice);
        final MediaPlayer sorry = MediaPlayer.create(this, R.raw.next);
        myView.setVisibility(View.VISIBLE);
        isUp = false;
        startLearning.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, FragmentHolder.class);
            startActivity(intent);

        });
                next.setOnClickListener((View view) ->  {
            if(selectCheckBox==1){
                if(checkBox1.isChecked()){
                    nice.start();
                    toastMessage("Your Answer is Correct");
                    correctAnswer++;
                    correct.setText("Correct : "+correctAnswer);
                    slideDown(myView);
                    checkBox1.setChecked(false);
                    beginerLevel();
                    slideUp(myView);

                }
                else{
                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.nice);
                    sorry.start();
                    toastMessage("Your Answer is Wrong");
                    wrongAnswer++;
                    wrong.setText("Wrong : "+wrongAnswer);
                }
            }
            else if(selectCheckBox==2){
                if(checkBox2.isChecked()){
                    nice.start();
                    toastMessage("Your Answer is Correct");
                    correctAnswer++;
                    correct.setText("Correct : "+correctAnswer);
                    slideDown(myView);
                    checkBox2.setChecked(false);
                    beginerLevel();
                    slideUp(myView);

                }
                else{
                    sorry.start();
                    toastMessage("Your Answer is Wrong");
                    wrongAnswer++;
                    wrong.setText("Wrong : "+wrongAnswer);
                }
            }
            else if(selectCheckBox==3){
                if(checkBox3.isChecked()){
                    nice.start();
                    toastMessage("Your Answer is Correct");
                    correctAnswer++;
                    correct.setText("Correct : "+correctAnswer);
                    slideDown(myView);
                    checkBox3.setChecked(false);
                    beginerLevel();
                    slideUp(myView);

                }
                else{
                    sorry.start();
                    toastMessage("Your Answer is Wrong");
                    wrongAnswer++;
                    wrong.setText("Wrong : "+wrongAnswer);
                }
            }
            else if(selectCheckBox==4){
                if(checkBox4.isChecked()){
                    nice.start();
                    toastMessage("Your Answer is Correct");
                    correctAnswer++;
                    correct.setText("Correct : "+correctAnswer);
                    slideDown(myView);
                    checkBox4.setChecked(false);
                    beginerLevel();
                    slideUp(myView);

                }
                else{
                    sorry.start();
                    toastMessage("Your Answer is Wrong");
                    wrongAnswer++;
                    wrong.setText("Wrong : "+wrongAnswer);
                }
            }
        });

        checkBox1.setOnClickListener((View view) ->  {
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);

        });
        checkBox2.setOnClickListener((View view) ->  {
            checkBox1.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);

        });
        checkBox3.setOnClickListener((View view) ->  {
            checkBox2.setChecked(false);
            checkBox1.setChecked(false);
            checkBox4.setChecked(false);

        });
        checkBox4.setOnClickListener((View view) ->  {
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox1.setChecked(false);

        });
    }

    private void toastMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG);
        View view = toast.getView();
        view.setBackgroundColor(Color.TRANSPARENT);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
        text.setTextColor(Color.WHITE);
        toast.show();
    }

    private void beginerLevel() {
        randomDigit1 = randomObject.nextInt(10+correctAnswer - 5) + 5;
        randomDigit2 = randomObject.nextInt(10+correctAnswer);
        if(correctAnswer<5){
            question.setText(" What is " + randomDigit1 + "+" + randomDigit2 + "?    ");
            answer=randomDigit1+randomDigit2;
        }
        else if (correctAnswer>=5 && correctAnswer<10){
            question.setText(" What is " + randomDigit1 + "-" + randomDigit2 + "?    ");
            answer=randomDigit1-randomDigit2;
        }

        else if (correctAnswer>=10 && correctAnswer<15){
            question.setText(" What is " + randomDigit1 + "*" + randomDigit2 + "?    ");
            answer=randomDigit1*randomDigit2;
        }
        else if (correctAnswer>=15 && correctAnswer<20){
            question.setText(" What is " + randomDigit1 + "/" + randomDigit2 + "?    ");
            answer=randomDigit1/randomDigit2;
        }
        else{
            int randomMath=randomObject.nextInt((4-1)+1)+1;
            if(randomMath==1){
                question.setText(" What is " + randomDigit1 + "+" + randomDigit2 + "?    ");
                answer=randomDigit1+randomDigit2;
            }
            else if (randomMath==2){
                question.setText(" What is " + randomDigit1 + "-" + randomDigit2 + "?    ");
                answer=randomDigit1-randomDigit2;
            }

            else if (randomMath==3){
                question.setText(" What is " + randomDigit1 + "*" + randomDigit2 + "?    ");
                answer=randomDigit1*randomDigit2;
            }
            else if (randomMath==4){
                question.setText(" What is " + randomDigit1 + "/" + randomDigit2 + "?    ");
                answer=randomDigit1/randomDigit2;
            }
        }

        selectCheckBox=randomObject.nextInt(4-1)+1;
        selectCheckBoxWriteCorrectAnswer(selectCheckBox);
    }

    private void selectCheckBoxWriteCorrectAnswer(int checkBox) {
        if(checkBox==1){
            checkBox1.setText("Answer :  "+answer+"   ");
            int r1=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r2=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r3=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10));
            if(r1==answer){
                r1=r1-1;
            }
            if(r2==answer){
                r2=r2-1;
            }
            if(r3==answer){
                r3=r3-1;
            }
            checkBox2.setText("Answer :  "+r1+"   ");
            checkBox3.setText("Answer :  "+r2+"   ");
            checkBox4.setText("Answer :  "+r3+"   ");


        }
        else if(checkBox==2){
            checkBox2.setText("Answer :  "+answer+"   ");
            int r1=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r2=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r3=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10));
            if(r1==answer){
                r1=r1-1;
            }
            if(r2==answer){
                r2=r2-1;
            }
            if(r3==answer){
                r3=r3-1;
            }
            checkBox1.setText("Answer :  "+r1+"   ");
            checkBox3.setText("Answer :  "+r2+"   ");
            checkBox4.setText("Answer :  "+r3+"   ");
        }
        else if(checkBox==3){
            checkBox3.setText("Answer :  "+answer+"   ");
            int r1=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r2=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r3=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10));
            if(r1==answer){
                r1=r1-1;
            }
            if(r2==answer){
                r2=r2-1;
            }
            if(r3==answer){
                r3=r3-1;
            }
            checkBox2.setText("Answer :  "+r1+"   ");
            checkBox1.setText("Answer :  "+r2+"   ");
            checkBox4.setText("Answer :  "+r3+"   ");
        }
        else{
            checkBox4.setText("Answer :  "+answer+"   ");
            int r1=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r2=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10)),
                    r3=randomObject.nextInt(((answer+10) - (answer-10) + 1) + (answer-10));
            if(r1==answer){
                r1=r1-1;
            }
            if(r2==answer){
                r2=r2-1;
            }
            if(r3==answer){
                r3=r3-1;
            }
            checkBox2.setText("Answer :  "+r1+"   ");
            checkBox3.setText("Answer :  "+r2+"   ");
            checkBox1.setText("Answer :  "+r3+"   ");
        }
    }

    // slide the view from below itself to the current position
    public void slideUp(View view){
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                view.getHeight(),  // fromYDelta
                0);                // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    // slide the view from its current position to below itself
    public void slideDown(View view){
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                view.getHeight()); // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }
}