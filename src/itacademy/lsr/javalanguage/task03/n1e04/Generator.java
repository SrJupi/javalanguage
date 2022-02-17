package itacademy.lsr.javalanguage.task03.n1e04;

import java.util.List;

public class Generator {
    List<String> movieCharacters;
    int listSize;
    private int i = 0;
    Generator(List<String> movieCharacters){
        this.movieCharacters = movieCharacters;
        this.listSize = movieCharacters.size();
    }

    String newCharacter (){

        if(i == listSize){
            i=0;
        }
        String returnedCharacter = movieCharacters.get(i);
        i++;
        return returnedCharacter;

    }

}
