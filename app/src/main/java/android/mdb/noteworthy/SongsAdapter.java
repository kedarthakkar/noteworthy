package android.mdb.noteworthy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by kedarthakkar on 11/11/16.
 */

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.CustomViewHolder> {

    private Context context;
    public ArrayList<Song> songList;

    public SongsAdapter(Context context, ArrayList<Song> songs){
        this.context = context;
        this.songList = songs;
    }

    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent, false);
        return new CustomViewHolder(view);
    }

    public void onBindViewHolder(final CustomViewHolder holder, int position){

        Song currentSong = songList.get(position);

        holder.songName.setText(currentSong.getName());
        holder.songAuthor.setText(currentSong.getAuthor());
        holder.songLength.setText(currentSong.getLength());
    }

    public int getItemCount(){
        return songList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView songName;
        TextView songAuthor;
        TextView songLength;

        public CustomViewHolder(View view){

            super(view);

            this.songName = (TextView) (view.findViewById(R.id.song_name));
            this.songAuthor = (TextView) (view.findViewById(R.id.song_author));
            this.songLength = (TextView) (view.findViewById(R.id.song_length));

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

}
