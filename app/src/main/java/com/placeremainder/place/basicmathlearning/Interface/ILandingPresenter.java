package com.placeremainder.place.basicmathlearning.Interface;

/**
 * Created by Habib on 6/11/18.
 */

public interface ILandingPresenter
        extends ParentPresenter {
    @Override
    void onCreate();



    @Override
    void onResume();

    @Override
    void onPause();



    /**
     * Launch the profile activity
     */
    void launchProfileActivity();

    /**
     * Launch History Activity
     */
    void launchHistoryActivity();

    /**
     * Launch Favorite Activity
     */
    void launchFavoriteActivity();

}
