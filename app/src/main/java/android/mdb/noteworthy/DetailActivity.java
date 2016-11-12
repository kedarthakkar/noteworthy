package android.mdb.noteworthy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Toolbar musicControls = (Toolbar)findViewById(R.id.controls);
        setSupportActionBar(musicControls);

        ImageView sheet = (ImageView)findViewById(R.id.music);
        ImageButton play = (ImageButton)findViewById(R.id.play);
        ImageButton previous = (ImageButton)findViewById(R.id.previous);
        ImageButton next = (ImageButton)findViewById(R.id.next);
        EditText time = (EditText)findViewById(R.id.time);
        SeekBar progress = (SeekBar)findViewById(R.id.progress);
    }

}
