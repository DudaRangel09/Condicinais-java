int l1 = 3, l2 = 4, l3 = 5;
if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
    System.out.println("Os lados formam um triângulo válido.");
    
    // Classificar o triângulo
    if (l1 == l2 && l2 == l3) {
        System.out.println("Classificação: Equilátero (todos os lados iguais)");
    } else if (l1 == l2 || l2 == l3 || l1 == l3) {
        System.out.println("Classificação: Isósceles (dois lados iguais)");
    } else {
        System.out.println("Classificação: Escaleno (todos os lados diferentes)");
    }
} else {
    System.out.println("Os lados não formam um triângulo válido.");
}