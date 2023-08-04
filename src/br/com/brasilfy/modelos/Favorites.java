package br.com.brasilfy.modelos;

public class Favorites {
    public void includes(Audio audio) {
        if (audio.getClassification() >=9){
            System.out.println(audio.getTitle() + ": Um dos maiores sucessos " + "Recomendado por todos");
        } else if (audio.getClassification() >=6 ) {
            System.out.println(audio.getTitle() + ": Entre os mais recomendados");
        } else {
            System.out.println(audio.getTitle() +": Boa opção para ver");
        }
    }
}
