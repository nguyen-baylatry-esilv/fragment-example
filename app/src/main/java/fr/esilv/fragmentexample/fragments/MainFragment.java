package fr.esilv.fragmentexample.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fr.esilv.fragmentexample.R;
import fr.esilv.fragmentexample.activities.SecondActivity;

public class MainFragment extends Fragment {

    private Button mainFragmentButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainFragmentButton = (Button) view.findViewById(R.id.mainFragmentButton);
        mainFragmentButton.setOnClickListener(new OnMainFragmentButtonClickListener());
    }

    private class OnMainFragmentButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(v.getContext(), SecondActivity.class));
        }
    }
}
