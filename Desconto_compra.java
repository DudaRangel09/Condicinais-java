double valor = 600;
if (valor > 500) {
    double desconto = valor * 0.10;
    double valorFinal = valor - desconto;
    System.out.println("Valor original: R$" + valor);
    System.out.println("Desconto: R$" + desconto);
    System.out.println("Valor final: R$" + valorFinal);
} else {
    System.out.println("Valor original: R$" + valor);
    System.out.println("Sem desconto. Valor final: R$" + valor);
}