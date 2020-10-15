
import java.util.ArrayList;

public class Sastojci_provaider {

    public static ArrayList<Sastojci> psastojciArrayList1_get(){
        ArrayList<Sastojci>psastojciArrayList1=new ArrayList<>();
        for (int i=0;i<25;i++){
            Sastojci sastojci=new Sastojci(i,"naziv "+i,i*30);
            psastojciArrayList1.add(sastojci);
        }
        return psastojciArrayList1;
    }

}


