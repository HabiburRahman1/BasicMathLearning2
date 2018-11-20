package com.placeremainder.place.basicmathlearning.Acticity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.placeremainder.place.basicmathlearning.R;
import com.placeremainder.place.basicmathlearning.TransparentStatusBarActivity;
import com.placeremainder.place.basicmathlearning.fragments.AdditionFragment;
import com.placeremainder.place.basicmathlearning.fragments.DivitionFragment;
import com.placeremainder.place.basicmathlearning.fragments.Multiplicationfragment;
import com.placeremainder.place.basicmathlearning.fragments.SubtractionFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentHolder extends TransparentStatusBarActivity {
    @BindView(R.id.add)
    Button add;
    @BindView(R.id.sub)
    Button sub;
    @BindView(R.id.mul)
    Button mul;
    @BindView(R.id.div)
    Button div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_holder);
        ButterKnife.bind(this);
        Fragment paymentDetailsFragment = new AdditionFragment();
        addFirstFragment(paymentDetailsFragment);

        add.setOnClickListener((View view) ->{
            Fragment addi = new AdditionFragment();
            addFirstFragment(addi);
        });
        sub.setOnClickListener((View view) ->{
            Fragment subs = new SubtractionFragment();
            addFirstFragment(subs);
        });
        mul.setOnClickListener((View view) ->{
            Fragment mult = new Multiplicationfragment();
            addFirstFragment(mult);

        });
        div.setOnClickListener((View view) ->{
            Fragment divi = new DivitionFragment();
            addFirstFragment(divi);
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    public void addFirstFragment(Fragment replaceFragment) {
        this.getFragmentManager().beginTransaction()
                .add(R.id.tutorial_fragment_holder,replaceFragment)
                .commit();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
