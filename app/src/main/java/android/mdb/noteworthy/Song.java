package android.mdb.noteworthy;

/**
 * Created by kedarthakkar on 11/11/16.
 */

public class Song {

    String imageUrl;
    String name;
    String author;
    String playImageUrl;
    String length;

    public Song(String aImageUrl, String aName, String aAuthor, String aPlayImageUrl, String aLength){
        imageUrl = aImageUrl;
        name = aName;
        author = aAuthor;
        playImageUrl = aPlayImageUrl;
        length = aLength;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String getPlayImageUrl(){
        return playImageUrl;
    }

    public String getLength(){
        return length;
    }
}
