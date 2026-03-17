int ano = 2024;
if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
    System.out.println(ano + " é um ano bissexto.");
} else {
    System.out.println(ano + " não é um ano bissexto.");
}