package br.com.brasilfy.modelos;

public class Audio {
    private String title;
    private int songTime;
    private int totalReproduction;
    private int totalLikes;
    private int classification;
    private boolean audioType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSongTime() {
        return songTime;
    }


    public int getTotalReproduction() {
        return totalReproduction;
    }

    public int getTotalLikes() {
        return totalLikes;
    }
    public int getClassification() {
        return classification;
    }


    public void like(){
        this.totalLikes++;
    }
    public void reproduction(){
        this.totalReproduction++;
    }

    public void displayTechnicalSheet(){
      //if (Music){
      //    System.out.println("Autor: " + music.getAuthor());
      //} else if (Podcast) {
      //    System.out.println("Channel: " + podcast.getChannel());
      //    System.out.println("Episode: " + podcast.getEpisodeNumber());
      //}
        System.out.println("Title name: " + title);
        System.out.println("Track time: " + songTime);
        System.out.println("Total reproduction: " + totalReproduction);
    }
}
