package br.com.brasilfy.modelos;

public class Music extends Audio {
    private String author;
    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalLikes(int i) {
    }

    @Override
    public int getClassification() {
        if (getTotalReproduction() >= 2000){
            return 10;
        } else if (getTotalReproduction() >= 1000) {
            return 8;
        } else {
            return 5;
        }
    }
}
