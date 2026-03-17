int m = 15;
if (m % 3 == 0 && m % 5 == 0) {
    System.out.println(m + " é múltiplo de 3 e 5.");
} else if (m % 3 == 0) {
    System.out.println(m + " é múltiplo de 3.");
} else if (m % 5 == 0) {
    System.out.println(m + " é múltiplo de 5.");
} else {
    System.out.println(m + " não é múltiplo de 3 nem de 5.");
}