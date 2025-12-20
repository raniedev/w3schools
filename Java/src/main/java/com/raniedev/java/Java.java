/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.raniedev.java;

/**
 *
 * @author Ranie
 */
public class Java {
    
    //Criação de Método, que consiste de um bloco de código que será executado apenas quando chamado
    //Dados podem ser passados através de parâmetros
    
    //static significa que um membro (variável, método, bloco, classe aninhada) pertence à classe em si, e não a uma instância (objeto)
    //void sigifica que o método não tem retorno de nenhum valor
    static void exibirMsg(int parametro){
        System.out.println("Este é um método, cujo parâmetro passado foi: " + parametro);
    }
    
    static boolean ligarLuz(int hora){
        return (hora > 17 && hora < 24) || (hora >= 0 && hora < 7) ? true : false;
    }
    
    static void sobreEscrita(){
        System.out.println("Método de sobreescrita");
    }
    
    static int sobreEscrita(int x){
        return x + 10;
    }
    
    static int sobreEscrita(int x, int y){
        return x + y;
    }
    
    public static int somar(int x){
        if(x > 0) {
            return x + somar(x - 1);
        } else {
            return 0;
        }
    }
    
    /*
    [Sequência da chamada recursiva]
    Chamada com somar(5)
    5 é maior que 0? Sim
    Então, return 5 + somar(4)
    
    Chamada ccm somar(4)
    4 é maior que 0? Sim
    Então, return 4 + somar(3)
    
    Chamada com somar(3)
    3 é maior que 0? Sim
    Então, return 3 + somar(2)
    
    Chamada com somar(2)
    2 é maior que 0? Sim
    Então, return 2 + somar(1)
    
    Chamada com somar(1)
    1 é maior que 0? Sim
    Então, return 1 + somar(0)
    
    Chamada com somar(0)
    0 é maior que 0? Não
    Então return 0
    
    Logo, 
    somar(0) return 0
    somar(1) return 1 + somar(0) = 1 + 0 = 1
    somar(2) return 2 + somar(1) = 2 + 1 = 3
    somar(3) return 3 + somar(2) = 3 + 3 = 6
    somar(4) return 4 + somar(3) = 4 + 6 = 10
    somar(5) return 5 + somar(4) = 5 + 10 = 15
    */
    
    public static void main(String[] args) {
        //Exibir Texto
        System.out.println("Hello");
        
        //Exibir Número
        System.out.println(10);
        
        //É possivel realizar cálculos matemáticos dentro do método println()
        System.out.println(25 * 5);
        
        //Comentário de linha única
        /*
        Comentário
        de Múltiplas
        Linhas
        */
        
        //Variáveis e seus tipos de dados
        String texto = "Bem-vindo!";
        int idade = 25;
        float altura = 1.75f;
        char letra = 'A';
        boolean tomada = true;
        
        //Exibir variáveis e concatenação
        System.out.println("Altura: " + altura);
        
        //Múltipla declaração de variáveis
        float x = 15.1f, y = 20.2f, z = 33.3f;
        
        /*
        Variáveis inválidas
        - Não podem começar com um número
        - Não podem ter espaços
        - Não pode ser uma palavra reservada
        */
        
        //No Java existe a palavra-chave const, mas não foi implementada e deve ser usada a keyword final
        //É uma boa prática de programação declarar uma constante e caixa alta
        final int END_URSS = 1991;
        
        //Outros Data Types e seus tamanhos
        byte tam_byte = 100; //2^8 = -128 até 127
        short tam_short = 20500; //2^16 = -32,768 até 32,767
        int tam_int = 7999444; //2^32 = -2,147,483,648 até 2,147,483,647
        long tam_long = 1234567890L; //2^64 = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float tam_float = 15.2f; //Armazena cerca de 6 até 7 dígitos decimais
        double tam_double = 299.999111999111999d; //Armazena cerca de 15 até 16 dígitos decimais
        
        /*
        Non-Primitive Data Types
        Tipos primitivos começam em caixa baixa (como int), enquanto que tipos não primitivos começam com caixa alta (como String)
        Os tipos primitivos sempre possuem um valor, enquanto os tipos não primitivos podem ser nulos.
        */
        
        //Com a palavra-chave var é possível declarar uma variável sem tipo pré-definido, mas é necessário passavar um valor
        var pontos = 1500;
        
        /*
        Type Casting, quando você consegue converter uma variável em outro tipo
        Há dois tipos de casting
        - Widening Casting (automatic): do menor tipo para o maior
            byte -> short -> char -> int -> long -> float -> double
        */
        byte byte_num = 39;
        float float_num = byte_num;
        System.out.println(float_num);
        /*
        - Narrowing Casting (manual) do maior tipo para o menor
            double -> float -> long -> int -> char -> short -> byte
        */
        double double_num = 3.999d;
        int int_num = (int) double_num;
        System.out.println(int_num);
        
        //Operadores Aritméticos
        int adicao = 10 + 3;
        int subtracao = 25 - 5;
        int multiplicacao = 100 * 2;
        float divisao = 150 / 2;
        int modulo = 123 % 9;
        int valor = 10;
        int pos_incremento = valor++; //Armazena 10 e depois adiciona 1
        valor = 10;
        int pos_decremento = valor--; //Armazena 10 e depois subtrai 1
        valor = 10;
        int pre_incremento = ++valor; //Adiciona 1 e depois armazena 11
        valor = 10;
        int pre_decremento = --valor; //Subtrai 1 e depois armazena 9
        
        //Operadores de Atribuição
        float numero;
        //Atribuição
        numero = 10;
        //Forma reduzida de atribuição
        numero += 50; // numero = numero + 50;
        numero -= 4; // numero = numero - 4;
        numero *= 3; // numero = numero * 3;
        numero /= 6; // numero = numero / 6;
        numero %= 3; // numero = numero % 2;
        
        //Atribuição reduzida Bitwise
        int bitwise = 11;
        //AND Bitwise
        bitwise &= 3;
        //OR Bitwise
        bitwise |= 2;
        //XOR Bitwise
        bitwise ^=4;
        //Shift Bitwise para direita
        bitwise >>=1;
        //Shift Bitwise para esquerda
        bitwise <<=4;
        
        //Operadores de Comparação
        int num_x = 10, num_y = 5;
        System.out.println(num_x + " == " + num_y + " é igual à " + (num_x == num_y)); //Igualdade
        System.out.println(num_x + " != " + num_y + " é igual à " + (num_x != num_y)); //Diferença
        System.out.println(num_x + " > " + num_y + " é igual à " + (num_x > num_y)); //Maior
        System.out.println(num_x + " < " + num_y + " é igual à " + (num_x < num_y)); //Menor
        System.out.println(num_x + " >= " + num_y + " é igual à " + (num_x >= num_y)); //Maior igual
        System.out.println(num_x + " <= " + num_y + " é igual à " + (num_x <= num_y)); //Menor igual
        
        //Operadores Lógicos
        System.out.println(true && true);//AND
        System.out.println(true || false);//OR
        System.out.println(!true);//NOT
        
        /*
        Precedência dos Operadores
        ( ) Parênteses
        * / % Multiplcação, Divisão e Módulo
        + - Adição Subtração
        > < >= <= Comparação
        == != Equalidade
        && E lógico
        || OU lógico
        = Atribuição
        */
        
        //Trabalhando com Strings
        String lema = "Ordem e Progresso";
        System.out.println(lema + " tem " + lema.length() + " de tamanho.");
        System.out.println(lema.toUpperCase());//String inteira em caixa alta
        System.out.println(lema.toLowerCase());//String inteira em caixa baixa
        
        System.out.println(lema.indexOf("dem"));//Index de onde aparece a string passada via parâmetro
        System.out.println(lema.charAt(1));//Pesquisar qual é o char de determinado index
        System.out.println(lema.equals("Ordem e Progresso"));//Checar se duas strings são iguais ou não
        String espacos = "     5 Espaços Antes - 3 Espaços Depois   ";
        System.out.println(espacos.trim());//Remove os espaços em branco do início e final de uma string
        
        //Concatenação, além do + temos outros métodos
        String texto1 = "Ser, ou não ser?";
        String texto2 = "Eis a questão";
        System.out.println(texto1.concat(texto2));
        
        /* 
        Caracteres especiais reservados para a linguagem de programação devem ser usados com barra invertida, como:
        - Apóstrofos, Aspas Duplas, Barra invertida;
        - Nova linha, tab, backspace, carriage return e form feed
        */
        System.out.println("\"Aspas Duplas\"");
        System.out.println("\'Apóstrofos\'");
        System.out.println("\\Barra Invertida");
        
        System.out.print("Por padrão o Java usa println, mas é possível usar apenas print \ne a linha pode ser quebrada com \\n\n");
        System.out.println("\tTab");
        System.out.println("Apagar\b\b\b***");
        System.out.println("\rCarriage Return");
        System.out.println("\fForm Feed");
        
        //Biblioteca Math
        int inteiro1 = 3, inteiro2 = 25, inteiro3 = -33;
        System.out.println("Maior número entre " + inteiro1 + " ~ " + inteiro2 + " é " + Math.max(inteiro1, inteiro2));//Maior valor
        System.out.println("Maior número entre " + inteiro1 + " ~ " + inteiro2 + " é " + Math.min(inteiro1, inteiro2));//Menor valor
        System.out.println("A raiz quadrada de " + inteiro2 + " é " + Math.sqrt(inteiro2));//Raiz quadrada
        System.out.println("O valor absoluto de " + inteiro3 + " é " + Math.abs(inteiro3));//Valor absoluto
        System.out.println("O valor " + inteiro2 + " elevado a " + inteiro1 + " é igual à " + Math.pow(inteiro2, inteiro1));
        
        //Métodos de Arredondamentos
        float decimal1 = 1.5f, decimal2 = 3.3f, decimal3 = 8.8f;
        System.out.println(Math.round(decimal2)); // >= .5 arredonda para cima, enquanto que < 5 irá arredondar para baixo
        System.out.println(Math.ceil(decimal2)); //Arredonda sempre para cima
        System.out.println(Math.floor(decimal2)); //Arredonda sempre para baixo
        
        //Math Random
        double aleatorio = Math.random(); //Gera um valor decimal do tipo double randômico entre 0 e 1
        System.out.println(aleatorio);
        int random = (int)(aleatorio * 101);  // Gera um valor aleatório de 0 até 100
        System.out.println(random);
        
        //Condicional If / Else
        boolean ligado = true;
        if(ligado){
            System.out.println("A lâmpada está ligada.");
        }else{
            System.out.println("A lâmpada está desligada.");
        }
        
        int age = 15;
        //Condicionais If / Else If / Else
        //Ifs Aninhados
        if(age > 0 && age < 18){
            System.out.println("Menor de idade.");
            if(age >= 16){
                System.out.println("Votar é facultativo.");
            }else {
                System.out.println("Não pode votar.");
            }            
        }else if (age >= 18){
            System.out.println("Maior de idade.");
            System.out.println("Votar é obrigatório");
        }else{
            System.out.println("Idade zero ou negativa.");
        }
        
        //Operador Ternário
        System.out.println("Ana " + (age == 15 ? "tem 15 anos" : "não tem 15 anos"));
        
        //Ternários podem ser aninhados
        int tempo = 9;
        String mensagem = (tempo >= 0 && tempo < 12) ? "Bom-dia"
                        : (tempo < 18) ? "Boa-tarde"
                        : (tempo < 24) ? "Boa-noite"
                        : "Erro";
        System.out.println(mensagem);
        
        //Condicional Switch 
        String estado = "rj";
        switch(estado){
            case "rj":
                System.out.println("Rio de Janeiro");
                break; //Break serve para quebrar o loop
            case "sp":
                System.out.println("São Paulo");
                break;
            case "mg":
                System.out.println("Minas Gerais");
                break;
            case "es":
                System.out.println("Espírito Santo");
                break;
            default:
                System.out.println("Nenhum estado do sudeste reconhecido.");
        }
        
        //Laço de Repetição While
        int contador = 1;
        while(contador <= 10){
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        //Laço de Repetição Do ... While
        //A diferença para o anterior é que esse será executado ao menos uma vez, menos que a condicional while seja falsa
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador > 15);
        
        //Laço de Repetição For
        //A criação da variável na declaração For, é como a variável ser criada apenas dentro do laço
        for(int loop = 0; loop < 5; loop++){ //Pode ser decremento também
            System.out.println("Loop For: " + loop);
        }
        
        //Laços For aninhados, criam uma espécie de matriz
        for(int i = 0; i < 2 ; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.println("[" + i + "][" + j + "]");
            }
        }
        
        //Criação de Arrays
        int[] numeros = {10, 20, 30, 40, 50, 60};
        
        //Laços de um Array, muito conhecido como "for each" ou "for in". Mas no Java é usado dois-pontos
        for(int num : numeros){
            //Qual a diferença de break para continue?
            //O continue para a execução e vai para a próxima iteração
            //O break interrompe por completo a execução do laço
            if(num == 20){
                continue;
            }
            if(num == 50){
               break;
            }
            System.out.println(num);
        }
        
        //Acessando um Array
        String[] paises = {"Brasil", "USA", "México", "Chile", "Itália", "Japão"};
        System.out.println(paises[0]);//Acessando o primeiro item
        System.out.println(paises.length);//Tamanho do array
        
        //Arrays vazios, além do uso das chaves vazias podem ser criados através da palavra reservada 'new'
        String[] estados = {};
        String[] carros = new String[5];
        carros[0] = "Mustang";
        
        //Arrays Multidimensionais
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        
        //For each em um array multidimensional
        for (int[] linha : matriz) {
            for (int num : linha) {
              System.out.print(num + " ");
            }
        }
        
        //Chamad de método, passando um int
        //Múltiplos parâmetros podem ser passados por uso de vírgulas, desde que o método tenha a mesma quantidade
        exibirMsg(50);//Valor 50 é um argumento
        
        boolean interruptor = ligarLuz(19);
        System.out.println("O interruptor está ligado? " + (interruptor ? "Sim" : "Não"));
        
        //Sobreescrita de métodos, desde que os métodos tenha quantidade de parâmetros diferentes ou retorne um tipo diferente
        sobreEscrita();
        sobreEscrita(100);
        sobreEscrita(50 + 30);
        
        /*
        Escopo das variáveis. Variáveis criadas dentro desses tipos são apenas locais
        - Escopo de métodos
        - Escopo de bloco, que são delimitados por chaves { int x = 1; }
        - Escopo do Loop
        - Escopo de Classe pode ser usado dentro de toda a classe
        */
        
        //Recursão, é quando o método/função chama a si mesmo
        System.out.println(somar(6));
    }
}