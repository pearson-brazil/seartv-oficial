package br.com.pearson.seartv.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.seartv.R;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class GenresFragment extends Fragment {


    public GenresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_genres, container, false);
        ButterKnife.bind(this, view);

        fillInformation();

        return view;
    }

    private void fillInformation() {
    }
}
