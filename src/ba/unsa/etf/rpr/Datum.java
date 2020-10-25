package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Datum {
    private int dan, mjesec, godina;

    public Datum (int dan, int mjesec, int godina) throws Exception {
        provjeriDatum(dan,mjesec,godina);
        this.dan=dan;
        this.mjesec=mjesec;
        this.godina=godina;
    }
    public void ispisiDatum() {
        System.out.println(dan + ". " + mjesec + ". " + godina);
    }
    public void unesiDatum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite dan: ");
        dan = in.nextInt();
        System.out.println("Unesite mjesec: ");
        mjesec = in.nextInt();
        System.out.println("Unsite godinu: ");
        godina = in.nextInt();
    }
    public void setMjesec(int mjesec) throws Exception {
        provjeriDatum(dan,mjesec,godina);
        this.mjesec=mjesec;
    }
    public int getMjesec() {
        return mjesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) throws Exception {
        provjeriDatum(dan,mjesec,godina);
        this.dan = dan;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) throws Exception {
        provjeriDatum(dan,mjesec,godina);
        this.godina = godina;
    }

    public static void provjeriDatum(int dan, int mjesec, int godina) throws Exception {
        int[] brojDanaUMjesecu = {31,29,31,30,31,30,31,31,30,31,30,31};
        if (mjesec < 1 || mjesec > 12)
            throw new Exception("Nevalidan mjesec");
        if (dan<1 || dan > brojDanaUMjesecu[mjesec-1])
            throw new Exception("Nevalidan dan");
    }
}
