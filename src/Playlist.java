import java.util.ArrayList;
import java.util.*;

class Playlist {
    /*
    Java program to create my PlayList using ArrayList
    */

    public static void main(String[] args) {
        // creating playlist

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Adding song to playlist
        desertIslandPlaylist.add("Kannaane Kannaane");
        desertIslandPlaylist.add("Yelo Pullelo");
        desertIslandPlaylist.add("Vaathi Raid");
        desertIslandPlaylist.add("Enjoy Enjami");
        desertIslandPlaylist.add("Kadhal Sadugudu");
        desertIslandPlaylist.add("Asku Maro");
        desertIslandPlaylist.add("Yathe Yathe");
        desertIslandPlaylist.add("Nee Kavithaigala");
        desertIslandPlaylist.add("Thangame");
        desertIslandPlaylist.add("Kadhaippoma");

        // printing playlist
        System.out.println(desertIslandPlaylist);

        // check playlist size
        int playListSize = desertIslandPlaylist.size();
        System.out.println(playListSize);

        // remove songs from playlist
        desertIslandPlaylist.remove("Asku Maro");
        desertIslandPlaylist.remove("Thangame");
        desertIslandPlaylist.remove("kadhaippoma");
        desertIslandPlaylist.remove("Vaathi Raid");
        desertIslandPlaylist.remove("Enjoy Enjami");

        // printing playlist
        System.out.println(desertIslandPlaylist);

        // swapping songs
        int a = desertIslandPlaylist.indexOf("Kannaane Kannaane");
        int b = desertIslandPlaylist.indexOf("Nee Kavithaigala");
        String temp = "Kannaane Kannaane";
        desertIslandPlaylist.set(a, desertIslandPlaylist.get(b));
        desertIslandPlaylist.set(b, temp);
        System.out.println(desertIslandPlaylist);

        // shuffle play
        Collections.shuffle(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);

        // reverse play
        Collections.reverse(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);
    }
}