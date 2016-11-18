package android.mdb.noteworthy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_song);
        //TODO actually bind the edit texts to a song object, should probably implement after pictures can be taken
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO send song with intent
                Intent intent = new Intent(getApplicationContext(), TabbedActivity.class);
                intent.putExtra("page", 3);
                startActivity(intent);
            }
        });
    }
}
