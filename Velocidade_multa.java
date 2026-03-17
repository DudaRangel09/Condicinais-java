double vel = 100, lim = 80;
if (vel > lim) {
    double multa = (vel - lim) * 5;
    System.out.println("Velocidade: " + vel + " km/h");
    System.out.println("Limite: " + lim + " km/h");
    System.out.println("Multa: R$" + multa);
} else {
    System.out.println("Velocidade: " + vel + " km/h");
    System.out.println("Limite: " + lim + " km/h");
    System.out.println("Sem multa.");
}