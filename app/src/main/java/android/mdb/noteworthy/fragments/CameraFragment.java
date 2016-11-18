package android.mdb.noteworthy.fragments;

import android.content.Intent;
import android.mdb.noteworthy.NewSongActivity;
import android.mdb.noteworthy.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by test on 11/17/16.
 */

public class CameraFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public CameraFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_camera, container, false);
        ImageButton button = (ImageButton)rootView.findViewById(R.id.camera_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewSongActivity.class);
                //TODO pause to load picture
                startActivity(intent);
            }
        });
        //TODO implement the Camera stuff
        return rootView;
    }
}
