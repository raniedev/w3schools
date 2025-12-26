/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.raniedev.java;

//Importar tudo de outro pacote
import pacote.*;
//import pacote.OutroPacote; //Importar uma classe específica de outro pacote

//Importar pacote do Java para uso de input/output
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        long tam_long = 1234567890L; //2^64 = -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
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
        
        Pessoa p1 = new Pessoa();
        System.out.println(p1.nome);
        p1.olaClasse();
        
        //Classe com construtor
        Animal a1 = new Animal(12);
        Animal a2 = new Animal(7, "Bob");
        
        //Palavra reservada this
        //Serve para referenciar ao objeto atual em um método ou construtor
        //Também evita confusão e difere a variável da classe com a interna do método/construtor
        Animal a3 = new Animal(10, "Pluto", "Cachorro");
        Animal a4 = new Animal(5, "Mingau", "Gato", true);
        
        
        /*
        Modificadores de acesso
        public      [Class][Package][Subclass][Global] Acesso global, mesma classe, mesmo pacote, classes filhas(subclasse) e outros pacotes
        protected   [Class][Package][Subclass] Na mesma classe, pacote e classes filhas (subclasse)
        default     [Class][Package] Apenas na mesma classe e pacote
        private     [Class] Apenas na mesma classe
        */ 
        Pessoa p2 = new Pessoa();
        System.out.println(p2.publ);
        System.out.println(p2.prot);
        System.out.println(p2.deft);
        
        
        OutroPacote op = new OutroPacote();
        System.out.println(op.outroPacote);
        
        
        /*
        Modificadores que não são de acesso: final, static, and abstract.
        o final transformará uma variável em constante
        com static, o método pertence a classe e não a um objeto específico
        abstract determina que o método pertence a uma classe abstrata, classe esta que não possui corpo, será passado posteriormente
        transient, atributos e métodos são ignorados ao serializar o objeto que os contém
        synchronized, métodos apenas podem ser acessados um por thread
        volatile, o valor do atributo nunca é armazenado em cache localmente na thread, é sempre lido da memória principal
        */
        
        //Importando pacote da API do Java para usar o Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um nome: ");
        
        String nome = scan.nextLine();
        System.out.println("Bem-vindo, " + nome);
        
        
        //Herança
        ClasseFilho cf = new ClasseFilho();
        cf.setNome("Ricardo");
        cf.honk();
        cf.getNomePai();
        cf.getParentName();
        
        //super.
        PolimorfismoFilho pf = new PolimorfismoFilho();
        pf.exibir();
        
        //Classes Internas
        ClasseExterna ce = new ClasseExterna();
        ClasseExterna.ClasseInterna ci = ce.new ClasseInterna();
        System.out.println(ci.y + " " + ce.x);
        
        //Método Interno
        System.out.println(ci.MetodoInterno());
        
        /*
        Assim como as classes abstratas, as interfaces não podem ser usadas para criar objetos
        As interfaces não tem corpo, os corpos serão providos através das classes implementadas
        Nas implementações de uma interface, você deve sobreescrever com a palavra reservada @Override todos os métodos
        Por padrão os métodos da interface são abstract e public
        Os atributos são por padrão public, static e final
        Uma interface não pode conter um construtor, como não pode ser utilizada para criar objetos
        
        Por que usar intarface?
        1) Para ganho de segurança, esconde detalhes e apenas mostrar detalhes importantes de um objeto (interface)
        2) Java não suporta "herança múltipla" (apenas uma classe pode herdar de uma superclasse). Entretanto, isto pode ser obtido com interfaces
        Para implementar múltiplas interfaces, elas devem ser separadas com uma vírgula
        */
        MultiplasInterfaces mp = new MultiplasInterfaces();
        mp.metodoUm();
        mp.metodoDois();
        
        /*
        Classe anônima é a criação de uma classe sem um nome, é criado e usado no mesmo tempo
        Geralmente é usado para sobreescrever métodos de uma classe ou interface sem a necessidade de criar um novo arquivo
        */
        Pessoa pess = new Pessoa() {
            public void olaClasse(){
                System.out.println("Sobreescrevendo um método da classe Pessoa através de uma classe anônima.");
            }
        };
        
        /*
        Classe anônima vindo de uma interface
        */
        InterfaceUm interf = new InterfaceUm(){
            public void metodoUm(){
                System.out.println("Sobreescrevendo um método de uma interface.");
            }
        };
        
        //Enum, são constantes definidas por default como: public, static e final (não podem ser mudadas nem sobreescritas)
        Enumeracao enumerar = Enumeracao.INSANE;
        
        //Loop através de uma enumeração
        for (Enumeracao enm : Enumeracao.values()){
            System.out.println(enm);
        }
       
        //Enum também pode ter construtores
        EnumConstrutor enumc = EnumConstrutor.HIGH;
        System.out.println(enumc.getDescription());
        
        for (EnumConstrutor e : EnumConstrutor.values()) {
            System.out.println(e.getLevel() + " " + e.getDescription());
        }
        
        //User inputs e seus tipos
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputText = input.nextLine();
        System.out.println("Foi digitado: " + inputText);
        
        System.out.print("Digite um valor booleano (true | false): ");
        boolean inputBool = input.nextBoolean();
        System.out.println("Foi digitado: " + inputBool);
        
        System.out.print("Digite um valor byte (-128 até 127): ");
        byte inputByte = input.nextByte();
        System.out.println("Foi digitado: " + inputByte);
        
        System.out.print("Digite um valor short (-32,768 até 32,767): ");
        double inputShort = input.nextShort();
        System.out.println("Foi digitado: " + inputShort);
        
        System.out.print("Digite um valor inteiro (-2,147,483,648 até 2,147,483,647): ");
        int inputInt = input.nextInt();
        System.out.println("Foi digitado: " + inputInt);
        
        System.out.print("Digite um valor long (-9,223,372,036,854,775,808 até 9,223,372,036,854,775,807): ");
        double inputLong = input.nextLong();
        System.out.println("Foi digitado: " + inputLong);
        
        System.out.print("Digite um valor float (tem 6 até 7 dígitos decimais): ");
        double inputFloat = input.nextFloat();
        System.out.println("Foi digitado: " + inputFloat);
        
        System.out.print("Digite um valor double (tem 15 até 16 dígitos decimais): ");
        double inputDouble = input.nextDouble();
        System.out.println("Foi digitado: " + inputDouble);
        
        //Java Dates e Time, é necessário utilizar o import java.time.LocalDate / LocalTime etc;
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime data_hora = LocalDateTime.now();
        System.out.println("Data: " + data + " Hora: " + hora);
        System.out.println(data_hora);
        
        /*Data e Hora formatada, deve importar a biblioteca import java.time.format.DateTimeFormatter;
        
        Padrões de Data
        y = ano (4 dígitos) ex.: 2025, 1991, 1500
        yy = ano (2 dígitos) ex.: 25, 91, 00
        yyyy = ano (4 dígitos também)
        M = Mês numérico, ignora quando tiver zero à esquerda (1 até 12)
        MM = Mês numérico, mantém o zero à esquerda (01 até 12)
        MMM = Nome do mês abreviado ex.: Jan, Feb, Mar etc.
        MMMM = Nome do mês ex.: January, February, March etc.
        d = Dia do mês (1 dígito)
        dd = Dia do mês (2 dígitos)
        D = Dia do ano
        E = Dia da semana abreviado ex.: Mon, Tue, Wed etc.
        EEEE = Dia da semana ex.: Monday, Tuesday, Wednesday etc.
        F = Semana do mês
        w = Semana no ano
        W = Semana do mês
        
        Padrões de Hora
        H = Horas com formato de 24 horas, ignora quando tiver zero à esquerda (0 até 23)
        HH = Horas com formato de 24 horas, mantém o zero à esquerda (00 até 23)
        h = Horas com formato de 12 horas, ignora quando tiver zero à esquerda (1 até 12)
        hh = Horas com formato de 12 horas, mantém o zero à esquerda (01 até 12)
        m = Minutos, ignora quanto tiver zero à esquerda.(0 até 59)
        mm = Minutos, mantém o zero à esquerda. (00 até 59)
        s = Segundos, ignora quanto tiver zero à esquerda.(0 até 59)
        ss = Segundos, mantém o zero à esquerda. (00 até 59)
        S = Miliegundos de 1 dígito
        SS = Miliegundos de 2 dígitos
        SSS = Miliegundos de 3 dígitos
        a = Informa se é AM/PM
        
        Fuso Horário (Time Zone)
        z = Nome do fuso (ex.: BRT)
        Z = A diferença de fuso horário para o Meridiano de Greenwich, Offset RFC 822 (ex.: -0300)
        X = A diferença de fuso horário para o Meridiano de Greenwich, Offset ISO (ex.: -03)
        XX = A diferença de fuso horário para o Meridiano de Greenwich, Offset ISO (ex.: -0300)
        XXX = A diferença de fuso horário para o Meridiano de Greenwich, Offset ISO (ex.: -03:00)
        0 = A diferença de fuso horário para o Meridiano de Greenwich, Offset Localizado (ex.: GMT-3)
        W = ID da Zona (Ex.: America/Sao_Paulo)
        */
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy HH:mm:ss");
        String dataformatada = data_hora.format(formato);
        System.out.println(dataformatada);
        
        /*
        Tratamentos de Erros
        
        Tipos de erros em Java:
        [Compile-Time Error] É detectado pelo compilador, evita a execução do código.
        
        Exemplo 1: Dará erro pela falta de ; que é obrigatório no Java ao final de cada instrução
        int x = 5
        System.out.println(x);
        
        Exemplo 2: Dará erro porque a variável não foi declarada
        System.out.println(y);
        
        Exemplo 3: Dará erro porque o tipo é diferente do que foi declarado
        int z = "Texto"
               
        [Runtime Error] Ocorre quando o programa está sendo executado, pode causar "crashes", que é quando o programa encerra sozinho
        
        Exemplo 1: Divisão por zero
        int divisao = 10 / 0;
        
        Exemplo 2: Posição do Array passada está fora dos limites (Out of bounds)
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[5]);
        
        [Logical Error] Código executa mas mostra resultados incorretos, mais difícil de achar.
        int x = 10;
        int y = 2;
        int sum = x - y;
        System.out.println("x + y = " + sum); //Vai exibir 8 em vez de 12
        
        
        Debugging
        
        O que é debugging? É o processo de identificar e arrumar erros ou bugs no código
        Um processo que envolve:
        - Ler mensagens de erro
        - Rastrear valores de variáveis passo à passo
        - Testar pequenos espaços do código de forma independente
        
        Java Exceptions
        
        Try and Catch funciona como uma condicional, se a tentativa do código dentro de "try" falhar irá executar o bloco "catch"
        */
        try {
            int erro1 = 10/0;
        } catch(Exception e){
            System.out.println(e);
        }
        
        //A declaração finally permite executar código após um try ... catch
        try {
            int[] indices = {10, 25, 50};
            System.out.println(indices[10]);
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Declaração Finally");
        }
        
        /*
        Com a palavra chave throw é possível criar uma mensagem de erro personalizada
        Existem diversos tipos de erros, como:
        - ArithmeticException: Quando um cálculo matemático dá errado
        - ArrayIndexOutOfBoundsException: Quando tentar acessar um index fora dos limites de um array
        - ClassNotFoundException: Quando tenta acessar uma classe que não existe
        - FileNotFoundException: Quando um arquivo não pode ser acessado
        - InputMismatchException: Quando informa um tipo de input diferente do esperado
        - IOException: Quando uma operação input/output falha
        - NullPointerException: Quando tenta acessar um objeto que é null
        - NumberFormatException: Quando não é possível converter uma string específica para um tipo numérico
        - StringIndexOutOfBoundsException: Quando tenta acessar um caractere em uma String inexistente
        - SecurityException: Quando uma operação falhou por falta de permissão de segurança
        etc.
        */
        age = 15;
        if (age < 18) {
            throw new ArithmeticException("Acesso negado, menor de idade.");
        } else {
            System.out.println("Accesso permitido!");
        }
        
        /*
        Múltiplas Exceções
        
        try {
            ...
        } catch (ArrayIndexOutOfBoundsException e) {
            ...
        } catch (ArithmeticException e) {
            ...
        } catch (Exception e) {
            ...
        }
        
        ATENÇÃO: (Exception e) sempre será o último no multi-catch
        
        Múltiplas Exceções também podem ser passadas juntas
        
        try {
            ...
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro Matemático ou Erro no Array.");
        }
        
        
        Java Close Resources (try-with-resources)
        Quando trabalhar com arquivos, streams ou outro tipo de recursos é importante que os fechem após o uso
        
        try {
            FileOutputStream output = new FileOutputStream("filename.txt");
            output.write("Oi".getBytes());
            output.close();  //Em versões antigas era necessário fechar manualmente
            System.out.println("Escreveu no arquivo com sucesso!.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
        
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write("Oi".getBytes());
            //A partir do Java 7 não é necessário mais usar, pois o Java fechará automaticamente com o término do bloco
            System.out.println("Escreveu no arquivo com sucesso!.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
        */
        
    }
}