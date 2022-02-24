package itacademy.lsr.javalanguage.task04.n3e04;

import java.util.Objects;
import java.util.Random;

public class IDs {
    int id;

    public IDs (){
        Random rand = new Random();
        this.id = rand.nextInt(0,1000);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IDs IDs = (IDs) obj;
        return this. id == IDs.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
