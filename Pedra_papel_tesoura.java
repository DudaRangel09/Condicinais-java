String j1 = "pedra", j2 = "tesoura";
if (j1.equals("pedra") && j2.equals("tesoura") || j1.equals("tesoura") && j2.equals("papel") || j1.equals("papel") && j2.equals("pedra")) {
    System.out.println("Jogador 1 vence!");
} else if (j1.equals(j2)) {
    System.out.println("Empate!");
} else {
    System.out.println("Jogador 2 vence!");
}