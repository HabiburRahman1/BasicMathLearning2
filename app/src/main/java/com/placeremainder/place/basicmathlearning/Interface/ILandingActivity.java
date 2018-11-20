package com.placeremainder.place.basicmathlearning.Interface;

import android.app.Activity;
import android.widget.ImageView;

/**
 * Created by Habib on 6/11/18.
 */

public interface ILandingActivity extends IParentView {
    /**
     * Get the reference of a nfc imageview
     *
     * @return ImageView
     */
    ImageView getOpenNFC();

    /**
     * Get the reference of a profile imageview
     *
     * @return ImageView
     */

    /**
     * Get the reference of outer circle
     * @return ImageView
     * */
    ImageView getRotator();

    @Override
    Activity getParentActivity();
}
