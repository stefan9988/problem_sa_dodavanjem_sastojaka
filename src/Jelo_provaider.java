
import java.util.ArrayList;

public class Jelo_provaider {
    public static ArrayList<Jelo> pjeloArrayList1_get(){
        ArrayList<Sastojci>sastojcis=new ArrayList<>();
        ArrayList<Jelo>pjeloArrayList1=new ArrayList<>();
        int n=0;
        for (int i=0;i<5;i++){
            Jelo jelo=new Jelo(i,"jelo "+i,"opis "+i,(double) i*100+200
                    ,(float) i,"slika"+i );
            for (int j=0;j<5;j++){
                Sastojci s=Sastojci_provaider.psastojciArrayList1_get().get(n);
                sastojcis.add(s);
                s.setJelo(jelo);
                n++;
            }
            jelo.setSastojciArrayList(sastojcis);
            pjeloArrayList1.add(jelo);
        }
        return pjeloArrayList1;
    }
}
