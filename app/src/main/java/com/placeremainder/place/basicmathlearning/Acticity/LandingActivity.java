package com.placeremainder.place.basicmathlearning.Acticity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.placeremainder.place.basicmathlearning.Interface.ILandingActivity;
import com.placeremainder.place.basicmathlearning.Interface.ILandingPresenter;
import com.placeremainder.place.basicmathlearning.LandingPresenterImpl;
import com.placeremainder.place.basicmathlearning.R;
import com.placeremainder.place.basicmathlearning.TransparentStatusBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LandingActivity extends TransparentStatusBarActivity
        implements
        ILandingActivity {
    @BindView(R.id.open_nfc)
    ImageView openNfc;

    @BindView(R.id.image)
    ImageView imgRotator;

    ILandingPresenter presenter;
    @BindView(R.id.progress_bar)
    ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ButterKnife.bind(this);
        presenter = new LandingPresenterImpl(this);
        presenter.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Hellow world
        presenter.onResume();
    }

    @Override
    public ImageView getOpenNFC() {
        return openNfc;
    }

    @Override
    public ImageView getRotator() {
        return imgRotator;
    }

    @Override
    public Activity getParentActivity() {
        return LandingActivity.this;
    }

    @Override
    public ProgressBar getProgressbar() {
        return mProgressbar;
    }
}

