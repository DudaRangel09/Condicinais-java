double a = 10, b = 5;
System.out.println("Escolha a operação: +, -, *, /");
String operacao = "+";  
switch (operacao) {
    case "+":
        System.out.println("Resultado: " + (a + b));
        break;
    case "-":
        System.out.println("Resultado: " + (a - b));
        break;
    case "*":
        System.out.println("Resultado: " + (a * b));
        break;
    case "/":
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
        break;
    default:
        System.out.println("Operação inválida.");
}