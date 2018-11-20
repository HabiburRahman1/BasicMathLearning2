package com.placeremainder.place.basicmathlearning.Interface;

import android.app.Activity;
import android.widget.ProgressBar;

/**
 * Created by Habib on 6/11/18.
 */
public interface IParentView {
    /**
     * Get the access of the parent acitivity
     * @return {@link Activity}
     * */
    Activity getParentActivity();
    ProgressBar getProgressbar();
}
