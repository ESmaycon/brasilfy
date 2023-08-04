package br.com.brasilfy.pricipal;

import br.com.brasilfy.modelos.Favorites;
import br.com.brasilfy.modelos.Music;
import br.com.brasilfy.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setAuthor("Mc Livinho");
        music.setTitle("Novidade na Aréa");
        for (int i = 0; i <1000 ; i++) {
            music.reproduction();
        }
        for (int i = 0; i < 50; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Flow");
        podcast.setChannel("Flow");
        podcast.setHost("Igor Flow");
        for (int i = 0; i < 50000; i++) {
            podcast.reproduction();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        Favorites favorites = new Favorites();
        favorites.includes(podcast);
        favorites.includes(music);
    }
}
