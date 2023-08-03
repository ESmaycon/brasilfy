package br.com.brasilfy.modelos;

public class Podcast {
    private int episodeNumber;
    private String channel;
    private String host;
    private String description;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
