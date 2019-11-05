
public class Main {

	public static void main(String[] args) {
		Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3, 12);
        System.out.println();
        System.out.printf("Kuat arus\t: %.1f ampere%n", baterai1.getKuatArus());
        System.out.printf("Hambatan\t: %.1f ohm%n", baterai1.getHambatan());
        System.out.printf("Hasil Tegangan\t: %.1f volt%n", baterai1.hitungTegangan());

	}

}
