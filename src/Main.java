import br.com.brasilfy.modelos.Music;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setAuthor("Mc Livinho");
        music.setTitle("Novidade na Aréa");
        music.setTotalReproduction(5400000);
        music.setTotalLikes(500000);

        System.out.println("Author: " + music.getAuthor());
        music.displayTechnicalSheet();

    }
}
