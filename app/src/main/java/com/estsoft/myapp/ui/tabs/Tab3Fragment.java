package com.estsoft.myapp.ui.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.estsoft.myapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends Fragment {


    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText( "Fragment3" );
        return textView;
    }

}
