package sample;
import java.util.Date;
public class Validering {
    public int dag(int dag)throws InvalidDateException {
        if (dag < 0 && dag >31){
            throw new InvalidDateException ("Ikke gyldig dag");
        }
        return dag;
    }
    public int aar(int aar)throws InvalidDateException {
        if (aar < 1900 && aar >2020){
            throw new InvalidDateException ("Ikke gyldig år");
        }
        return aar;
    }
    public int maaned(int maaned)throws InvalidDateException {
        if (maaned < 0 && maaned >12){
            throw new InvalidDateException ("Ikke gyldig måned");
        }
        return maaned;
    }

}
