def main():
    while True: 
        print("***CALCULADORA***")
        num1 = int(input("Digite o primeiro número: "))
        num2 = int(input("Digite o segundo número: "))
        operacao = input("Escolha a operação (+, -, *, /): ")

        if operacao == '+':
            resultado = num1 + num2
            print("Resultado: ", resultado)
        elif operacao == '-':
            resultado = num1 - num2
            print("Resultado: ", resultado)
        elif operacao == '*':
            resultado = num1 * num2
            print("Resultado: ", resultado)
        elif operacao == '/':
            if num2 != 0:
                resultado = num1 // num2
                print("Resultado: ", resultado)
            else:
                print("Erro: Divisão por zero não é permitida.")
        else:
            print("Operação inválida.")

        continuar = input("Deseja continuar? (1 para sim, 0 para não): ")
        if continuar.lower() != '1':
            break

if __name__ == "__main__":
    main()
