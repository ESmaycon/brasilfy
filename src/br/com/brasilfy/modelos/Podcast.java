package br.com.brasilfy.modelos;

public class Podcast extends Audio{
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public int getClassification() {
        if (getTotalLikes() >=500){
            return 10;
        } else if (getTotalLikes() >= 250) {
            return 8;
        } else {
            return 5;
        }
    }
}
