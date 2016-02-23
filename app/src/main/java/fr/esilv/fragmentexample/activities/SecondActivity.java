package fr.esilv.fragmentexample.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import fr.esilv.fragmentexample.R;
import fr.esilv.fragmentexample.fragments.SecondFragment;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //this method is called by the Button in activity_second.xml. the android:onClick attribute binds with this method.

    public void showFragment(View view) {
        view.setVisibility(View.GONE);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //the id passed as parameter is the id of the FrameLayout defined in activity_second.xml.
        fragmentTransaction.replace(R.id.contentFrame, new SecondFragment());
        //the transaction has to be committed for changes to happen.
        fragmentTransaction.commit();
    }
}
