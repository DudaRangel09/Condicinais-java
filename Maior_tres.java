int x = 5 , y = 10, z = 3;
if (x > y && x > z) {
    System.out.println("O maior número é: " + x);
} else if (y > x && y > z) {
    System.out.println("O maior número é: " + y);
} else if (z > x && z > y) {
    System.out.println("O maior número é: " + z);
} else {
    System.out.println("Há números iguais.");
}