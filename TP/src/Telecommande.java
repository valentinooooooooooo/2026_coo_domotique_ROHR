import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Appareil> Appareils ;;

    public Telecommande(){
        this.Appareils = new ArrayList<>();
    }
    public void ajouterLampe(Appareil appa){
        this.Appareils.add(appa);
    }
    public void desactiverLampe(int Indiceappa){
        this.Appareils.get(Indiceappa).eteindre();
    }
    public void activerLampe(int Indiceappa){
        this.Appareils.get(Indiceappa).allumer();
    }
    public void activerToutLampe(){
        for(Appareil a : Appareils){
            a.allumer();
        };
    }

}









