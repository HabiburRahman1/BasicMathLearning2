package com.placeremainder.place.basicmathlearning.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.placeremainder.place.basicmathlearning.Acticity.MathLearningActivity;
import com.placeremainder.place.basicmathlearning.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Multiplicationfragment extends Fragment {
    @BindView(R.id.arrow)
    GifImageView arrow;
    @BindView(R.id.mul)
    GifImageView mul;
    @BindView(R.id.practice)
    Button practice;
    CountDownTimer cTimer = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_multiplicationfragment, container, false);
        ButterKnife.bind(this, v);
        arrow.setVisibility(View.INVISIBLE);
        mul.setOnClickListener((View view)->{
            startTimer();
        });
        practice.setOnClickListener((View view) -> {
            Intent intent = new Intent(getActivity(), MathLearningActivity.class);
            intent.putExtra("add",10);
            startActivity(intent);
        });
        return v;
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        cancelTimer();
    }
    void startTimer() {
        cTimer = new CountDownTimer(9000, 1000) {
            public void onTick(long millisUntilFinished) {
                arrow.setVisibility(View.VISIBLE);
            }
            public void onFinish() {
                arrow.setVisibility(View.INVISIBLE);
            }
        };
        cTimer.start();
    }


    void cancelTimer() {
        if(cTimer!=null)
            cTimer.cancel();
    }

}
