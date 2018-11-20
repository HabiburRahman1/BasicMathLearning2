package com.placeremainder.place.basicmathlearning.Interface;

public interface ParentPresenter {
    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onCreate() Method
     */
    void onCreate();

    /**
     * Refernce of  {@link android.app.Fragment} onCreateView() method.
     */
    void onCreateView();

    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onRestart() Method
     */
    void onRestart();

    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onResume() Method
     */
    void onResume();

    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onPause() Method
     */
    void onPause();

    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onStop() Method
     */
    void onStop();

    /**
     * Refernce of  {@link android.app.Fragment}or
     * {@link android.app.Activity} onDestroy() Method
     */
    void onDestroy();


    void showProgressbar();
    void hidProgressbar();

}