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
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
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
    
    
    //Métodos genéricos
    public static <B> void exibirArray(B[] array) {
        for(B item : array){
            System.out.println(item);
        }
    }
    
    @Deprecated
    static void ola(){
        System.out.println("Olá");
    }
    
    /*
    @SuppressWarnings("unchecked") //Sem isso o compilador avisaria sobre operações inseguras com generics
    @SuppressWarnings("deprecation") //Warning sobre uso do método obsoleto (@Deprecated) é suprimido
    @SuppressWarnings("unused") //Remove o warning de variável não utilizada
    @SuppressWarnings("rawtypes") //Uso de tipos genéricos sem parametrização
    @SuppressWarnings("all") //Suprime todos (não recomendado)
    */
    
    //Se precisar usar mais de um, passe através de chaves
    @SuppressWarnings({"unused", "deprecation"}) 
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
        age = 19;
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
        
        Java Files
        Manipulação de arquivos no Java, há vários métodos para criação, leitura, atualização e eliminação dos arquivos.
        
        Para manipular arquivos deve usar o pacote import java.io.File;
        */
        File file = new File("filename.txt"); //Especifica o nome do arquivo
        
        /*
        A classe File tem diversos métodos úteis para criar e coletar informações sobre arquivos
        
        canRead() [Boolean] Testa se o arquivo pode ser lido ou não
        canWrite() [Boolean] Testa se pode escrever no arquivo ou não
        createNewFile() [Boolean] Cria um arquivo vazio
        delete() [Boolean] Apaga um arquivo
        exists() [Boolean] Testa se o arquivo existe
        getName() [String] Retorna o nome do arquivo
        getAbsolutePath() [String] Retorne o nome do caminho do arquivo
        length() [Long] Retorna o tamanho do arquivo em bytes
        mkdir() [Boolean] Cria uma pasta
        */
        try {
            File arquivo = new File("arquivo.txt");
            if (arquivo.createNewFile()) { //Tenta criar
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace(); //Mostrar o erro em detalhes
        }
        
        /*
        Criar um arquivo em uma pasta específica
        File arquivo_caminho = new File("C:\\Users\\Usuario\\nome_arquivo.txt");
        
        Escrever em um arquivo, o jeito mais fácil de escrever texto é usando a classe FileWriter juntamente com write()
        Note: Quando finalizar o que precisa ser feito, deve usar a chamada do método close() / Mas a partir do Java 7 o close() se torna opcional, pois o Java fecha automaticamente
        */
        try {
            File arquivo = new File("arquivo.txt");
            FileWriter escrever = new FileWriter("arquivo.txt");
            escrever.write("Escrevendo no arquivo através do Java.");
            escrever.close();
            System.out.println("Escritou com sucesso no arquivo " + arquivo.getName());
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        //Usando o construtor de apenas um parâmetro irá sobreescrever o texto do arquivo
        //Para adicionar novo conteúdo no arquivo, deve-se usar o construtor de dois parâmetros, que é um boolean, true representa que deseja um append em vez de um overwrite
        try {
            File arquivo = new File("arquivo.txt");
            FileWriter escrever = new FileWriter("arquivo.txt", true);
            escrever.write("\nAdicionando novo conteúdo no arquivo através do Java, sem apagar o conteúdo anterior.");
            escrever.close();
            System.out.println("Adicionou mais conteúdo com sucesso no arquivo " + arquivo.getName());
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        /*
        Outros meios de escrever em um arquivo, use:
        - FileWriter: Para adicionar texto simples
        - BufferedWriter: É melhor para arquivos que precisa de grande quantidade de texto, é mais prático e oferece recursos práticos.
        - FileOutputStream: É melhor para (binary data) dados binários, como: imagens, áudios, arquivos .PDF
        
        Leitura de Arquivo
        Nós usamos o Scanner para ler os conteúdos dos arquivos
        */
        
        File arquivo = new File("arquivo.txt");
        try (Scanner leitor = new Scanner(arquivo)) {
            System.out.println("\nLendo Arquivo: " + arquivo.getName());
            System.out.println("Caminho: " + arquivo.getAbsolutePath());
            System.out.println("Pode ser escrito? " + arquivo.canWrite());
            System.out.println("Pode ser lido? " + arquivo.canRead());
            System.out.println("Tamanho: " + arquivo.length());
            System.out.println("\nConteúdo:");
            while (leitor.hasNextLine()) {
              String dados = leitor.nextLine();
              System.out.println(dados);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível abrir " + arquivo.getName());
            e.printStackTrace();
        }
        
        //Apagar arquivo
        File arq = new File("apagar.txt");
        System.out.print("Deseja apagar o arquivo " + arq.getName() + "? ");
        String resposta = scan.nextLine();
        
        String[] respostas = {"sim", "si", "s", "yes", "yep", "y"};
        
        try {
            if (arq.createNewFile()) { //Tenta criar
                System.out.println("Arquivo criado: " + arq.getName());
            } else {
                System.out.println("O arquivo já existe.");    
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace(); //Mostrar o erro em detalhes
        }
        
        for(String r : respostas){
            if(resposta.equals(r)){
                arq.delete();
                break;
            }
        }
        
        if(arq.exists()){
            System.out.println("O arquivo não foi apagado.");
        } else {
            System.out.println("Arquivo apagado com sucesso!");
        }
        
        /* 
        Para apagar um diretório, basta passar o caminho
        File pasta = new File("C:\\Users\\Usuario\\Pasta"); 
        pasta.delete()
        
        
        Java I/O Streams
        Tem uma diferença de trabalhar com arquivos (File) e com flux de entrada e saída de dados. (I/O Stream)
        A classe File serve para saber informações sobre arquivos e diretórios
        - O arquivo existe?
        - Qual é o nome e tamanho?
        - Criar ou apagar arquivos e pastas
        
        Mas a classe File não lê ou escreve os conteúdos do arquivo
        I/O Streams são mais flexíveis, eles trabalham com texto e dados binários (como imagens, áudio, .PDFs)
        
        Tipos de Streams
        - Byte Streams: Trabalha com dados binários (RAW) como imagens, áudio e PDFs. ex.: FileInputStream, FileOutputStream
        - Character Streams: Trabalha com texto (caracteres e strings). Esses fluxos lidam automaticamente com a codificação de caracteres. ex.: FileReader, FlieWriter, BufferedReader, BufferedWriter
        
        Use "character streams" quando trabalhar com texto, e "byte streams" quando trabalhar com dados binários.
        */
        try (FileInputStream inputStream = new FileInputStream("arquivo.txt")) {

            int i;  // variável para gravar cada byte que é lido

            // Lê um byte por vez até que o fim do arquivo. (-1 significa que não há mais dados)
            while ((i = inputStream.read()) != -1) {
              // Converter o byte para char para ser exibido
              System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Erro " + e + " ao ler o arquivo.");
        }
        
        
        //Como trabalha com raw bytes, esse código pode copiar qualquer tipo de arquivo: texto, imagem, áudio ou PDFs.
        try (FileInputStream inputStream2 = new FileInputStream("imagem.jpg");
            FileOutputStream output = new FileOutputStream("copia.jpg")) {
            int i;
            while ((i = inputStream2.read()) != -1) {
                output.write(i);  // Escreva o raw byte para um novo arquivo
            }
            System.out.println("Arquivo copiado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro " + e + "ao manipular o arquivo.");
        }
        
        //A classe FileOutputStream funciona de um jeito similar ao FileWriter, mas escreve dados como "raw bytes".
        //Isso significa que você pode não apenas em texto, mas em arquivos binários (como imagens, .PDFs, ou áudio)
        //Escrever um arquivo de texto, note que o arquivo será sobreescrito caso ele já exista.
        String novo_texto = "Eu prefiro morrer do que perder a vida!";
        try (FileOutputStream outputStream = new FileOutputStream("apagar.txt")) {
          outputStream.write(novo_texto.getBytes());  // converte texto para bytes e escreve
          System.out.println("Escrito com sucesso no arquivo.");
        } catch (IOException e) {
          System.out.println("Erro ao escrever no arquivo.");
          e.printStackTrace();
        }
        
        //Append no arquivo, adicionar mais conteúdo sem sobreescrever
        String mais_texto = "\nMais vale um covarde vivo do que um herói morto!";

        // true = significa "append mode", ou seja, matenha o conteúdo anterior
        try (FileOutputStream output = new FileOutputStream("apagar.txt", true)) {
          output.write(mais_texto.getBytes());
          System.out.println("Adicionou mais conteúdo com sucesso.");
        } catch (IOException e) {
          System.out.println("Erro ao escrever no arquivo.");
          e.printStackTrace();
        }
        
        /*
        BufferedReader e BufferedWriter faz com que a leitura e escrita de arquivos de textos se tornem mais rápidas
        BufferedReader deixa você ler o texto linha por linha com readLine()
        BufferedWriter deixa você escrever o texto de forma eficiente e escrever novas linhas com newLine()
        
        Essas classes são costumente combinadas com FileReader e FileWriter, na qual manuseia abrir e fechar o arquivo.
        As classes buffered tornam as leituras e escritas mais rápidas usando a memória buffer
        */
        
        try (BufferedReader br = new BufferedReader(new FileReader("apagar.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
              System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo.");
        }
        
        //BufferedWriter (Com sobreescrita)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"))) { //pode adicionar argumento "true" para evitar sobreescrita
            bw.write("Deus é Fiel");
            bw.newLine();  // adiciona quebra de linha
            bw.write("Amém");
            System.out.println("Escreveu mais conteúdo com BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Erro ao tentar escrever no arquivo.");
        }
        
        //BufferedWriter (Sem sobreescrita)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt", true))) {
            bw.write("\nNem só de pão viverá o homem");
            bw.newLine();  // adiciona quebra de linha
            bw.write("Não tentarás o Senhor teu Deus");
            System.out.println("Escreveu mais conteúdo com BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Erro ao tentar escrever no arquivo.");
        }
        
        /*
        Estrutura de Dados
        Um array é um exemplo de estrutura de dados, na qual permite que múltiplos elementos sejam armazenados em uam simples variável.
        O Java possui muitas outras estruturas de dados no pacote "java.util", cada um é usado para manipular de jeitos diferentes, como:
        ArrayList | Elementos ordenados | Mantém a ordem | Permite valores duplicados | Acessa os valores pelo índice (index)
        HashSet | Elementos únicos | Não mantém a ordem | Não permite valores duplicados | Evitando valores duplicados, checa mais rápido
        HashMap | Pares de Chave-valor | Não mantém a ordem | Permite valores duplicados, mas as chaves são únicas | Pesquisa mais rápida através da chave
        
        Estrutura de dados são como super arrays, elas são mais flexíveis e mais ricos em recursos.
        
        ArrayList é um array escalável, pode crescer conforme a necessidade do usuário
        */
        ArrayList<String> kuruma = new ArrayList<String>(); //Pode apenas colocar o <> "diamond" na segunda chamada, evitando assim repetição desnecessária
        kuruma.add("Volvo");
        kuruma.add("BMW");
        kuruma.add("Pegeout");
        kuruma.add("Mazda");
        kuruma.add("Toyota");
        kuruma.add("Chevrolet");
        kuruma.add("Fiat");
        kuruma.add("Ford");
        kuruma.add("Hyundai");
        kuruma.add("Honda");
        kuruma.add("Nissan");
        System.out.println(kuruma);
        
        //HashSet é uma coleção de elementos onde cada elemento é único, não permite repetições.
        HashSet<String> kuni = new HashSet<>();
        kuni.add("Brasil");
        kuni.add("Argentina");
        kuni.add("Japão");
        kuni.add("Itália");
        kuni.add("Portugal");
        kuni.add("México");
        kuni.add("Espanha");
        kuni.add("Romenia");
        kuni.add("Coréia do Sul");
        kuni.add("Egito");
        kuni.add("Israel");
        kuni.add("Austrália");
        kuni.add("China");
        System.out.println(kuni);
        
        //HashMap grava conjunto de chave-valor (key-value pairs), é ótimo para quando quiser armazenar valores e econtrá-lo através de procurar a chave
        HashMap<String, String> ddd = new HashMap<>();
        ddd.put("11", "Grande São Paulo");
        ddd.put("21", "Região Metropolitana do RJ");
        ddd.put("22", "Região dos Lagos do RJ");
        ddd.put("27", "Espírito Santo");
        ddd.put("31", "Minas Gerais");
        System.out.println(ddd);
        
        // Iterator: É um jeito de percorrer os elementos de uma estrutura de dados.
        Iterator<String> itera = kuruma.iterator();
        
        System.out.println("\nIteração de uma estrutura de dados:");
        while(itera.hasNext()){
            System.out.println(itera.next());
        }
        
        /*
        The Collections Framework
        O "collections framework" fornece um conjunto de interfaces (como List, Set, Map) e um conjunto de classes (ArrayList, HashSet, HasMap, etc) que implemetam essas interfaces.
        Todas elas são partes de um pacote java.util
        Eles são usados para gravar, procurar, ordenar e organizar os dados mais facilmente, todos usando métodos padronizados
        
        Algumas interfaces e suas classes:
        List | ArrayList, LinkedList | Coleções ordenadas que permitem dados duplicados
        Set | HashSet, TreeSet, LinkedHashSet | Coleções de elementos únicos
        Map | HashMap, TreeMap, LinkedHashMap | Armazenada pares de chaves-valor
        
        Métodos comuns de List:
        add() Adiciona um elemento ao final da lista
        get() Retorna o elemento de uma posição específica
        set() Troca o elemento de uma posição específica
        remove() Remove o elemento de uma posição específica
        size() Retorna a quantidade de elementos
        clear() Apaga todos os elementos
        */
        System.out.println("\nO segundo elemento do ArrayList é: " + kuruma.get(1));
        kuruma.set(1, "Ferrari");
        System.out.println("O segundo elemento do ArrayList agora é: " + kuruma.get(1));
        System.out.println("O ArrayList tem: " + kuruma.size() + " elementos.");
        kuruma.remove(3);
        System.out.println("O ArrayList agora tem: " + kuruma.size() + " elementos.");
        
        /*
        Diferenças entre Array e List
        Array
        - tem tamanho fixo
        - é mais rápido para "raw data"
        - não faz parte do "Collections Framework" do Java 
        
        List
        - tem tamanho dinâmico
        - mais flexível e rico em recursos
        - faz parte do "Collections Framework" do Java 
        
        Use o pacote Collections para ordernar os elementos do ArrayList
        */
        Collections.sort(kuruma);
        System.out.println("\nLista de carros ordenada: ");
        for(String i : kuruma){
            System.out.println(i);
        }
        
        //A palavra chave reservada "var", serve para receber uma estrutura de dados sem declarar o seu tipo de forma duplicada
        var cars = kuruma;
        System.out.println(cars);
        
        //Também é possível a combinação de List e ArrayList no código Java
        List<String> filmes = new ArrayList<>();
        filmes.add("X-men");
        filmes.add("Spider-man");
        filmes.add("Star Wars");
        filmes.add("Fast and Furious");
        filmes.add("Deadpool");
        System.out.println(filmes);
        
        /*
        LinkedList é uma coleção que pode ter vários objetos do mesmo tipo, igual ao ArrayList
        
        Como ArrayList funciona? a classe tem um array convencional dentro. Quando um elemento é adicionado, é colocado no array.
        Se o array não é grande o suficiente, um novo e maior array é criado para substituir o anterior, e o array antigo é removido
        
        Como LinkedList funciona? armazena seus elementos em containers. A lista tem um link para o primeiro container e cada container tem um link para o próximo container
        Para adicionar elementos na lista, e elemento é colocado em um novo container e esse container é conectado aos outros containers
        */
        LinkedList<String> animes = new LinkedList<>();
        animes.add("Death Note");
        animes.add("Dragon Ball");
        animes.add("Saint Seiya");
        animes.add("Steins;Gate");
        animes.add("Inuyasha");
        animes.add("Naruto");
        
        /*
        LinkedList Métodos
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()
        */
        System.out.println("\nLista de Animes");
        System.out.println(animes);
        animes.removeFirst();
        animes.removeLast();
        System.out.println(animes);
        animes.addFirst("Digimon");
        animes.addLast("Yu-gi-oh!");
        System.out.println(animes);
        System.out.println("O primeiro anime é: " + animes.getFirst() + "." + " O último anime é: " + animes.getLast());
        
        //Lista para ordenar de forma reversa
        Collections.sort(animes, Collections.reverseOrder());
        System.out.println(animes);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-5);
        numbers.add(24);
        numbers.add(9);
        numbers.add(104);
        
        Collections.sort(numbers, Collections.reverseOrder());
        for (int i : numbers){
            System.out.println(i);
        }
        
        /*
        Interface Set é para do Java Collections Framework e é usado para armazenar coleções de elementos únicos
        Diferente de List, um Set não permite dados duplicados e não preserva a ordem dos elementos (ao menos que use TreeSet, LinkedHashSet)
        - HashSet é rápido e não ordenado
        - TreeSet é um conjunto organizado
        - LinkedHashSet é ordenado por inserção
        
        Dica: Use Set quando quiser gravar dados únicos
        
        Métodos comuns do Set
        - add() adiciona elemento no Set
        - remove() remove elemento do Set
        - contains() verifica se existe um determinado elemento ou não
        - size() retorna o tamanho do Set
        - clear() apaga todos os elementos do Set
        
        [List vs Set]
        List permite valores duplciados, Set não
        List mantém a ordem, Set não garante a ordem
        Lista é acessado pelo índice (index), no Set não há acesso pelo índice
        */
        String meucarro = "Toyota";
        System.out.println("Tem o carro " + meucarro + " na minha lista? " + kuruma.contains(meucarro));
        
        //Quando a variável é declara como Set (interface), mas armazena um objeto HashSet (o conjunto atual).
        //Desde que HashSet implementa a interface Set, isto é possível
        //Funciona do mesmo jeito, mas isso dar´maior flexibilidade para mudança de tipo posterior
        Set<String> comidas = new HashSet<>();
        
        //TreeSet, é um coleção de dados que armazena valores únicos em ordem alfabética.
        //Uma TreeSet de números TreeSet<Integer> armazena valores em ordem crescente
        TreeSet<String> games = new TreeSet<>();
        games.add("Sonic");
        games.add("Mario");
        games.add("Crash");
        games.add("Bomberman");
        games.add("GTA");
        games.add("Resident Evil");
        games.add("God of War");
        
        /*
        HashSet vs TreeSet
        Ordem não é garantida no HashSet, mas no TreeSet sim
        Valores duplciadores não são permitidos em ambos
        Performance é melhor no HashSet já que não se preocupa com ordenação, TreeSet é mais lento pois precisa ordernar
        
        Criação junto com Set Interface também funciona
        */
        Set<String> jogos = new TreeSet<>();
        
        /*
        LinkedHashSet é uma coleção que armazena elementos únicos e se lembram a ordem que eles foram adicionados
        Dica: Use LinkedHashSet quando você quiser um conjunto que não permite valores duplicados e mantém a ordem original de inserção
        */
        LinkedHashSet<String> gemas = new LinkedHashSet<>();
        gemas.add("Zircônio");
        gemas.add("Topázio");
        gemas.add("Diamante");
        gemas.add("Rubi");
        gemas.add("Esmeralda");
        gemas.add("Âmbar");
        gemas.add("Safira");
        
        //HashSet vs LinkedHashSet é o mesmo que comparado com TreeSet
        
        /*
        Map, HashMap, TreeMap e LinkedHashMap
        Trabalham com pares de chave-valor, cada chave deve ser única, o valor pode ter duplicações
        - HashMap é rápido e desordenado
        - TreeMap é ordenado pela chave
        - LinkedHashMap é ordenado por inserção
        
        Métodos comuns
        - put() adiciona ou atualiza o par chave-valor
        - get() retorna o valor de uma chave
        - remove() retorna a chave e seu valor
        - containsKey() checa se o Map tem determinada chave
        - keySet() retorna o conjunto de todas as chaves
        
        List vs Set vs Map
        Permite valor duplicado? [List: Sim | Set: Não | Map Key: Não, Map Valor: Sim]
        Armazena pares de chave valor? Apenas o Map
        Mantém a ordem? Apenas a List. Set e Map precisam usar TreeSet ou LinkedHasSet para ordenação
        */
        
        //Exibir as chaves do HashMap
        for (String i : ddd.keySet()) {
            System.out.println(i);
        }
        
        //Do mesmo jeito que List e Set, o Map pode armazenar um HashMap
        Map<String, String> capitais = new HashMap<>();
        
        //Diferente do HashMap, o TreeMap irá ordenar de forma alfabética as chaves.
        TreeMap<String, String> materias = new TreeMap<>();
        materias.put("MAT", "Matemática");
        materias.put("POR", "Português");
        materias.put("ING", "Inglês");
        materias.put("FIS", "Física");
        
        //Exibir Chaves
        for (String i : materias.keySet()) {
            System.out.println(i);
        }
        
        //Exibir Valores
        for (String i : materias.values()) {
            System.out.println(i);
        }
        
        /*
        HashMap vs TreeMap
        No HashMap não garante ordem, no TreeMap garante ordem das chaves
        No HashMap permite uma chave nula, no TreeMap não permite chaves nulas
        No HashMap a performance é melhor (já que não ordena), no TreeMap é mais lenta (pois necessita ordenar)
        
        Lembrando que, Map pode receber um new TreeMap
        */
        Map<String, String> capital = new TreeMap<>();
        
        //LinkedHashMap mantém a ordem em que os dados foram inseridos
        LinkedHashMap<String, String> bandas = new LinkedHashMap<>();
        bandas.put("A7X", "Avenged Sevenfold");
        bandas.put("SOAD", "System of a Down");
        bandas.put("Guns", "Guns 'n' Roses");
        bandas.put("A7X", "Avenged Sevenfold"); //Valores duplicados são ignorados
        bandas.put("BFMV", "Bullet for my Valentine");
        bandas.put("LP", "Linkin Park");
        
        //Lembrando que, Map pode receber um new LinkedHashMap
        Map<String, String> musicas = new LinkedHashMap<>();

        //Lembrando que Iterators podem ser usados para coleções como ArrayList e HashSet
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Bat Country");
        songs.add("Fear of the Dark");
        songs.add("Chop Suey!");
        songs.add("Carry On");
        songs.add("Garçom");
        songs.add("Welcome to the Jungle");
        songs.add("The Wind of Change");
        Iterator<String> sng = songs.iterator();
        
        //Loop usando iterator
        while(sng.hasNext()) { //Faz o loop enquanto tiver elemento
            String i = sng.next(); //recebe o próximo elemento
            if(i == "Garçom") {
                sng.remove(); //remove o elemento caso seja compatível com a condicional
            }
        }
        
        /**
        * Algoritmos são usados para resolver problemas de ordenação, pesquisa e manipulação de estrutura de dados.
        * Procurar um elemento dentro de um ArrayList
        */
        ArrayList<String> desenhos = new ArrayList<>();
        desenhos.add("Pica-pau");
        desenhos.add("Flinstones");
        desenhos.add("Pernalonga");
        desenhos.add("Frajola");
        desenhos.add("Danny Phantom");
        desenhos.add("Tom e Jerry");
        desenhos.add("Garfield");
        desenhos.add("Billy e Mandy");
        desenhos.add("Pink e Cérebro");
        desenhos.add("Jovens Titans");
        Collections.sort(desenhos); //primeiramente deve ser ordenado
        int index = Collections.binarySearch(desenhos, "Garfield");
        System.out.println("Garfield está no index: " + index);
        System.out.println(desenhos);
        
        /**
        * Lembrar que a ordem reserva se usa o Collections.sort(list, Collections.reverseOrder())
        *
        * Outros algoritmos úteis da bibliotec Collections:
        * - Collections.max() encontra o maior elemento
        * - Collections.min() encontra o menor elemento
        * - Collections.shuffle() aleatoriamente embaralha os elementos
        * - Collections.frequency() conta quantas vezes um elemento aparece
        * - Collections.swap() troca dois elementos em uma lista
        */
        ArrayList<Float> notas = new ArrayList<>();
        notas.add(10f);
        notas.add(7.5f);
        notas.add(5.5f);
        notas.add(2f);
        notas.add(8f);
        notas.add(10f);
        notas.add(6.8f);
        notas.add(7.7f);
        notas.add(9.5f);
        notas.add(6.2f);
        notas.add(10f);
        notas.add(1.5f);
        notas.add(6f);
        
        System.out.println("\nTodas as notas:");
        System.out.println(notas);
        System.out.println("A maior nota foi: " + Collections.max(notas));
        System.out.println("A menor nota foi: " + Collections.min(notas));
        Collections.shuffle(notas);
        System.out.println("As notas foram embaralhadas " + notas);
        Collections.swap(notas, 0, notas.size() - 1);
        System.out.println("Trocar o primeiro pelo último ");
        System.out.println(notas);
        System.out.println("Quantos 10 tiraram? " + Collections.frequency(notas, 10f));
        
        /**
        * Wrapper Classes prover um jeito de usar tipos de dados primitivos (int, boolean etc) como objetos.
        * Abaixo está os tipos primitivos e sua wrapper class (basta capitalizar a primeira letra, Integer e Character devem ser escrito por completo)
        * byte | Byte
        * short | Short
        * int | Integer
        * long | Long
        * float | Float
        * double | Double
        * boolean | Boolean
        * char | Character
        *
        * Criando Objetos Wrapper
        * Em vez de usar os tipos primitivos, chame a classe Wrapper
        */
        Integer inteiro = 13490;
        Float flutuante = 34.5f;
        Long longo = 320432042L;
        Short curto = 342;
        Double dobro = 9.9999999999d;
        Character caractere = 'A';
        Boolean boleano = true;
        
        /**
        * Já que está trabalhando com objetos, você poderá usar métodos para pegar informação sobre um objeto específico
        * Integer | intValue()
        * Byte | byteValue()
        * Short | shortValue()
        * Long | longValue()
        * Float | floatValue()
        * Double | doubleValue()
        * Character | charValue()
        * Boolean | booleanValue()
        */
        System.out.println(inteiro.toString());
        
        /**
        * Generics permite escrever classes, interfaces e métodos que trabalham com diferentes tipos de dados, sem necessidade de especificar o exato tipo
        * Torna o código mais flexível, reutilizável e seguro com questão de tipo
        *
        * Vantagens:
        * - Reusabilidade de Código: Escreva uma classe ou método que trabalha com diferentes tipos de dados.
        * - Segurança de Tipos: Detecte erros de tipo em tempo de compilação, em vez de em tempo de execução.
        * - Código mais limpo: Não é necessário fazer conversão de tipo ao recuperar objetos.
        */
        class Caixa<A> {
            A valor; //A é um label/espaço reservado para qualquer tipo de dados
            
            void set(A valor) {
                this.valor = valor;
            }
            
            A get() {
                return valor;
            }
        }
        
        Caixa<String> caixa1 = new Caixa<>();
        caixa1.set("livro");
        System.out.println("Dentro da caixa tem um(a) " + caixa1.get());
        
        Caixa<Boolean> caixa2 = new Caixa<>();
        caixa2.set(false);
        System.out.println("A caixa está " + (caixa2.get() ? "cheia" : "vazia"));
        
        //Métodos Genéricos
        String[] animais = {"Cachorro", "Gato", "Galinha", "Pato", "Cavalo"};
        exibirArray(animais);
        
        Integer[] megaSena = {10, 20, 30, 40, 50, 60};
        exibirArray(megaSena);
        
        /**
        * Bounded Type
        * Pode usar a palavra chave "extends" para limitar os tipos uma classe genérica ou métodos
        */
        Integer[] pontuacao = {10, 25, 55, 70, 20, 40, 45, 95, 75, 30, 100, 5, 0, 15};
        Stats<Integer> meus_pontos = new Stats<>(pontuacao);
        System.out.println("A média de pontos é de: " + meus_pontos.media());
        
        Float[] todas_notas = {5.5f, 7.2f, 10.0f, 2.0f, 3.5f, 6.5f, 6.0f, 8.5f, 8.0f, 9.5f, 1.5f, 3.5f, 7.0f, 8.5f, 10.0f};
        Stats<Float> minhas_notas = new Stats<>(todas_notas);
        System.out.println("A média do aluno foi de: " + minhas_notas.media());
        
        //Coleções Genéricas, coleções como ArrayList e HashMap são genéricas internamente
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Ameixa");
        frutas.add("Pêssego");
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Melancia");
        frutas.add("Kiwi");
        String fruta = frutas.get(0); //não é necessário castar
        
        /** 
         * Anotações
         * São notas especiais que você pode adicionar ao código Java. Elas começam com o símbolo de arroba @
         * Eles não interferem na execução do programa, dão informações extras para o compilador e outras ferramentas
         * Aqui está uma das mais usadas:
         * @Override, indica uma sobreescrita de método de uma superclasse
         * @Deprecated, marca um método como código descontinuado e não recomendando para ser mais usado
         * @SupressWarnings, diz ao compilador para ignorar certos alertas
         * 
         * RegEx (Regular Expressions)
         * É uma sequência de caracteres que formam um padrão de pesquisa. 
         * Uma expressão regular pode ser de apenas um caractere ou de forma mais complexa.
         * Podem ser utilizadas para pesquisas ou operações de substituição de texto
         * 
         * Java não possui uma classe própria para RegEx, é necessário importar o pacote java.util.regex para trabalhar com expressões regulares
         * Este pacote contém as seguintes classes:
         * - Pattern, define o padrão a ser usado na pesquisa
         * - Matcher, usada para procurar pelo padrão
         * - PatternSyntaxException, indica erro de sintaxe em um padrão de uma expressão regular
         */
        
        // Palavra e como segundo paramentro uma informação que aceitr qualquer tipo de capitalização
        // exs.: (Brasil, brasil, BRASIL, BRasil etc), palavras com acentuação não serão encontradas exs.: (Brásil, brâsil etc)
        Pattern padrao = Pattern.compile("Brasil", Pattern.CASE_INSENSITIVE); 
        Matcher procurar = padrao.matcher("Entre outras mil és tu Brásil, ó pátria amada!");
        boolean encontrou = procurar.find();
        System.out.println("Palavra " + (encontrou ? "encontrada" : "não encontrada"));
        
        /**
         * Flags
         * Pattern.CASE_INSENSITIVE, como explicdo anteriormente, vai achar a palavra com capitalizações diferentes
         * Pattern.LITERAL, desativa caracteres do RegEx para evitar conflitos ex.: [0-9] seria do número 0 até 9, mas usando o .LITERAL "0-9" estaria procurando justamente 0-9
         * Pattern.UNICODE_CASE, não funciona sozinho, expande o CASE_INSENSITIVE para caracteres Unicode com acentuações, letras não-latinas etc
         */
        
        Pattern padrao2 = Pattern.compile("á", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher procurar2 = padrao2.matcher("KLWMpmsduiqÁbqndner");
        boolean encontrou2 = procurar2.find();
        System.out.println("Palavra " + (encontrou2 ? "encontrada" : "não encontrada"));
        
        /**
         * Padrões RegEx
         * [abc] Encontra qualquer um dos caracteres passado entre colchetes. (ex.: Abacate, os caracteres "baca" dão match)
         * [^abc] Encontrar qualquer caractere que for diferente do passado entre colchetes (ex.: Abacate, os caracteres "Ate" dão match)
         * [0-9] Encontrar ao menos um caractere que esteja eem um range (neste caso de 0 até 9) (ex.: 22 de Abril de 1500, os números 221500 dão match)
         * [^0-9] Não números
         * [a-z] Letras minúsculas (sem acentuações)
         * [A-Z] Letras maiúsculas (sem acentuações)
         * [a-z|A-Z] Todas as letras (sem acentuações)
         * (a-z) só dá match com "a-z"
         * alun(o|a) só dará match com "aluno" ou "aluna"
         * 
         * Metacaracteres
         * $ Encontra uma palavra que está sempre ao final de um texto, considere que não é apenas o final da string, a cada Enter um "final" de texto é criado
         * . Encontra um fragmento de palavra que será complementado, onde estiver ponto pode ser qualquer coisa, como em um jogo da forca (ex.: .ato dará match em gato, pato, fato etc (ou qualquer coisa que não tenha sentido, como vato, Wato, @ato etc)
         * \ Pode ser utilizada para escape, por exemplo, \. para representar que desejo procurar realmente um ponto, em vez do RegEx ententar como o ponto de qualquer caractere
         * \d representa um dígito, \d{3} representa 3 dígitos juntos, \d{3}-\d{3}-\d{3} representa três sequências de 3 digitos e a cada 3 dígitos um traço como seperador (ex.: 123-456-789 dará match)
         * \D não dígito
         * \w letra, número ou _
         * \W negação de \w
         * \s representa os espaços (space), amigo\sdo (ex.: dará match em "amigo do")
         * \S o que não for espaço
         * \b representa encontrar uma palavra que se inicia ou termina. ela\b (ex.: Bela irá dar match, elaine não irá dar match)
         * \\uxxxx Note que: duas barras neste caso é para evitar erro no Java, xxxx é o código do unicode. (ex.: \u00e7 = ç)
         * 
         * Quantificadores
         * Definem quantas vezes um padrão pode aparecer
         * asterísco *      0 ou mais (ex.: abc* vai dar match com: ab, abc, abcc, abccc etc)
         * adição +         1 ou mais (ex.: abc+ vai dar match com: abc, abcc, abccc etc)
         * interrogação ?   0 ou 1 (ex.: abc? vai dar match com: ab e abc apenas)
         * {n}              exatamente n
         * {n,}             pelo menos n
         * {n,m}            entre n e m
         * 
         * Flags
         * (?i) Case insensitive, não importa se é maiúscula ou minúscula
         * (?u) Unicode, ativa a codificação unicode
         * (?iu) Combinando Case insensitive com Unicode
         * (?m) Multiline, faz com que o ^ e $ funcionem por linha e não apenas no início/fim da string. (ex.: (?m)^erro
         * (?s) Dotall (Single Line), faz com que o . também dê match com quebra de linha
         * (?x) Comments / Free-spacing
         * (?U) Ungreedy
         */
        
        Pattern padrao3 = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher procurar3 = padrao3.matcher("abcdef4gh");
        boolean encontrou3 = procurar3.find();
        System.out.println("Palavra " + (encontrou3 ? "encontrada" : "não encontrada"));
        
        /**
         * Java Threads
         * Permite que um programa de modo eficiente fazendo multi-tarefas
         * Threads podem ser usadas para melhor performance de tarefas complexas, são executadas em background sem interromper o programa principal
         * 
         * Criando uma Thread
         * Há dois jeitos de se criar uma thread
         * 1) Usando extends Thread e sobreescrevendo com o método run()
         * public class Main extends Thread {
         *      public void run() {
         *          System.out.println("Este código está sendo executado em uma Thread.");
         *      }
         * }
         * 
         * 2) Implementando a interface Runnable
         * public class Main implements Runnable {
         *      public void run() {
         *          System.out.println("Este código está sendo executado em uma Thread.");
         *      }
         * }
         * 
         * Executando uma Thread
         * 1) Através do extends Thread basta criar uma instância da class Main e chamar o método start()
         * Main thread = new Main();
         * thread.start();
         * 
         * 2) Através do implements Runnable deve-se executar passando a instância da classe para um objeto construtor da Thread e só depois chamar o método start()
         * Main objeto = new Main();
         * Thread thread = new Thread(objeto)
         * thread.start();
         * 
         * ATENÇÃO! Concurrency Problems
         * Quando threads são executadas ao mesmo tempo que outras partes do programa, não há como saber a ordem do código do programa.
         * Quando o programa principal juntamente com as threads estão utilizando as mesma variáveis para leitur e escrita, pode acontecer imprecisões de dados que é chamado de concurrency problems.
         *
         * Neste exemplo, o valor de amount é impreciso
         * public class Main extends Thread {
         *      public static int amount = 0;
         *      
         *      public static void main(String[] args) {
         *          Main thread = new Main();
         *          thread.start();
         *          System.out.println(amount);
         *          amount++;
         *          System.out.println(amount);
         *      }
         *      public void run() { amount++; }
         * }
         * 
         * Para evitar o problema de concorrência, é melhor compartilhar o menos possível atributos entre threads e a execução principal
         * Caso seja realmente necessário compartilhar, uma solução possível é utilizar o método isAlive() para checar se a execucação da thread está ativa ou não
         * Assim, o programa irá esperar a thread finalizar o que tiver para fazer para continuar seu processo
         * public class Main extends Thread {
         *      public static int amount = 0;
         *      
         *      public static void main(String[] args) {
         *          Main thread = new Main();
         *          thread.start();
         *          
         *          // Esperando a thread finalizar sua tarefa
         *          while(thread.isAlive()) {
         *              System.out.println("Aguardando...");
         *          }
         *          // Continua o programa
         *          System.out.println("Main: " + amount);
         *          amount++;
         *          System.out.println("Main: " + amount);
         *      }
         *      public void run() { amount++; }
         * }
         * 
         * 
         * Expressões Lambda
         * As expressões lambda foram implementadas no Java 8, é bloco de código curto que passa a estrutura de "parâmetros -> expressão de retorno"
         * Lambda é um método sem nome, e elas podem ser escrita até mesmo no corpo de um método convencional
         */
        
        ArrayList<Integer> meus_num = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);
        meus_num.forEach((n) -> { System.out.println(n); });
        
        /**
         * Ordenação Avançada do Java
         * As interfaces Comparator e Comparable permitem especificar que regra é usada para organizar objetos
         * 
         * Comparators
         * Permite criar uma classe com um método compare() que compara dois objetos para decidir qual irá primeiro na lista
         */
    }
}