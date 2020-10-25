package ba.unsa.etf.rpr;

public class Main {
	private static void promijeniDatum(Datum d) throws Exception {
		d.setMjesec(10);
	}
    public static void main(String[] args) throws Exception {
		IntWrapper a = new IntWrapper (15);
		promijeniInt(a);
		IntWrapper b = new IntWrapper(42);
		if (a.equals(b)) System.out.println("Jednaki su!");

		System.out.println("Int je " + a);
		Datum.provjeriDatum(28,2,2020);
	}
	private static void promijeniInt(IntWrapper a) {
		a.setX(42);
	}
}
