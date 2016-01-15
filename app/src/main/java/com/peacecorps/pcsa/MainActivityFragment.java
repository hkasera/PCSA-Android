package com.peacecorps.pcsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.peacecorps.pcsa.circle_of_trust.CircleIntro;
import com.peacecorps.pcsa.reporting.HomeScreen;
import com.peacecorps.pcsa.utils.Util;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

        public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button circleButton = (Button) rootView.findViewById(R.id.circleButton);
        Button getHelpNowButton = (Button) rootView.findViewById(R.id.getButton);
        Button reportingProcessButton = (Button) rootView.findViewById(R.id.reportButton);
        Button safetyResourceButton = (Button) rootView.findViewById(R.id.safetyResourceButton);
        Button getHelpButton = (Button) rootView.findViewById(R.id.getHelpButton);

        reportingProcessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeScreen.class));
            }
        });
        getHelpNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Temporarily commented out until the functionality is implemented.
                //startActivity(new Intent(getActivity(), HomeScreen.class));
                Util.showUnavailableMessage(getActivity());
            }
        });

        safetyResourceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Temporarily commented out until the functionality is implemented.
                //startActivity(new Intent(getActivity(), SafetyResources.class));
                Util.showUnavailableMessage(getActivity());
            }
        });

        getHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getHelpButton does not have any functioanlity yet.
                Util.showUnavailableMessage(getActivity());
            }
        });

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CircleIntro.class));
            }
        });

        return rootView;
    }

}
