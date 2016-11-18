package android.mdb.noteworthy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SongsAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_song_list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.song_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Song> songList = new ArrayList<Song>();

        Song song1 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song2 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song3 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song4 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song5 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song6 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");
        Song song7 = new Song("h", "Chorale and Shaker Rhythm", "by Aayush Tyagi", "h", "Length: 3:30");

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);
        songList.add(song6);
        songList.add(song7);

        songAdapter = new SongsAdapter(getApplicationContext(), songList);

        recyclerView.setAdapter(songAdapter);

    }
}
