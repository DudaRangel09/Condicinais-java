double peso = 70 ; // peso em kg
double altura = 1.75; // altura em metros
double imc = peso / (altura * altura);
System.out.println("O IMC é: " + imc);
if (imc < 18.5) {
    System.out.println("Abaixo do peso");
} else if (imc < 25) {
    System.out.println("Peso normal");
} else if (imc < 30) {
    System.out.println("Sobrepeso");
} else {
    System.out.println("Obesidade");
}