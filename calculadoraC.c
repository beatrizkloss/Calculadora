#include <stdio.h>

int main() {
    
    int num1, num2;
    char operacao;
    int continuar = 1;

    while (continuar == 1) {
        printf("\n***CALCULADORA***\n");
        printf("Digite o primeiro número: ");
        scanf("%d", &num1);

        printf("Digite o segundo número: ");
        scanf("%d", &num2);

        printf("Escolha a operação (+, -, *, /): ");
        scanf(" %c", &operacao);

        if (operacao == '+') {
            printf("Resultado: %.2d\n", num1 + num2);
        } else if (operacao == '-') {
            printf("Resultado: %.2d\n", num1 - num2);
        } else if (operacao == '*') {
            printf("Resultado: %.2d\n", num1 * num2);
        } else if (operacao == '/') {
            if (num2 != 0) {
                printf("Resultado: %.2d\n", num1 / num2);
            } else {
                printf("Erro: Divisão por zero não é permitida.\n");
            }
        } else {
            printf("Operação inválida.\n");
        }

        printf("Deseja continuar? (1 para sim, 0 para não): ");
        scanf("%d", &continuar);
    }

    return 0;
}