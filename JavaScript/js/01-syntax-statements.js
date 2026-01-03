/** 
 * [Declaração de variáveis]
 * var era usada anteriomente (ou declarações apenas com o nome, variable automatically), mas por ser de escopo global passou a não ser mais recomenda par uso comum
 * e foi substituída pela palavra reservada let que é de escopo de bloco de onde la foi declarada.
 */

let x = 2, y = 5;
let z = x + y;
var w = 7; //Não recomendado
var w = 11; //var pode receber uma "redeclaração". let não pode, pois é de escopo de bloco
y = 9; //Não recomendado

/** 
 * [Valores]
 * A sintaxe JavaScript determina dois tipos de valores
 * Literais: são valores fixos (são definidos pela palavra reservada let)
 * Variáveis: são valores que variam (são definidos pela palavra reservada const)
 * 
 * As variáveis ou literais do JavaScript são chamadas de identificadores, tem como regras:
 * - devem começar com letra, _ (underscore) ou $ (dolar)
 * - dígitos só devem entrar posterior a regra acima
 * - não pode usar palavras reservadas (let, const, var etc)
 * - são case-senstive, ou seja, faz distinção de letras maiúsculas de minúsculas
 * - geralmente é usado camelCase para declarar variáveis com mais de uma palavras, PascalCase (Classes e Construtores), UPPERCASE (constantes) e snake_case (frameworks, apis, dbs, constantes com mais de uma palavra) também podem ser usados.
 * - kebab-case não funciona no JavaScript
 */ 

let number = 10.5;

/**
 * A palavra-chave 'const' é um pouco enganosa.
 * 
 * Ela não define um valor constante. Ela define uma referência constante a um valor.
 * 
 * Por causa disso, você NÃO PODE:
 * - Reatribuir um valor constante
 * - Reatribuir um array constante
 * - Reatribuir um objeto constante
 * 
 * Mas você PODE:
 * - Alterar os elementos de um array constante
 * - Alterar as propriedades de um objeto constante
 */


//Constantes
const NUMBER = 50;
const carros = ["Gol", "Uno", "Fusion", "Ka", "HB20", "Celta"];
//carros = ["BMW", "Ferrari", "Lamborghini", "GTR", "Prius", "Type R"]; Erro de atribuição
console.log(carros);
carros[0] = "BMW";
carros.push("Audi");
console.log(carros);

//Objetos
const carro = {
    tipo: 'Flat',
    modelo: 'RLX2',
    cor: 'Branco'
}

/** 
 * Erro de atribuição
 * carro = {
 * tipo: 'SUV',
 * modelo: 'LST',
 * cor: 'Azul'
 * }
*/

carro.cor = 'Preto';
carro.potencia = '2.0';

/**
 * [Operadores Aritméticos e Gerais]
 * Adição                   +
 * Subtração                -
 * Multiplicação            *
 * Divisão                  /
 * Atribuição               =
 * Concatenação             +                       (atenção: concatenar string + number sempre dará string)
 * Exponenciação            **
 * Módulo                   %
 * Incremento               ++
 * Decremento               --
 * Atribuição Combinada     += -= /= *= %= **=      (ex.: variavel = variavel + 10; é o mesmo que variavel += 10;)
 * Atribuição Nulo Lógico   ??=                     (avalia o operador direito e atribui ao esquerdo se o operador esquerdo for nulo ou indefinido)
 * Ternário                 ?
 * Separador de Ternário    :
 * Propriedades de Objetos  :
 * Operador Spread          ...
 */

let expressao = ((x + y - z) * 10) / 2;
const a = { duration: 50 };
a.speed ??= 25;
console.log(a.speed); //25
a.duration ??= 10;
console.log(a.duration); //50
let spread = "123456789";
let menorValor = Math.min(...spread);
let maiorValor = Math.max(...spread);
console.log("Usando spread o menor valor é: " + menorValor); //1
console.log("Usando spread o maior valor é: " + maiorValor); //9

/** 
 * [JavaScrip tem 8 tipos de dados]
 * string       Textos que são definidos através de aspas (simples ou duplas)
 * number       Representa um valor matemático numérico
 * bigint       Representa um inteiro de grandes proporções
 * boolean      Representa valor lógico binário (verdadeiro e falso) / (true e false)
 * object       Uma coleção de dados indicados por pares de chave-valor
 * undefined    Um tipo de dado que não representa nenhuma atribuição de valor
 * null         Um valor primitivo que representa ausência de objeto
 * symbol       Um único e primitivo identificdor
 * 
 * Para descobrir qual o tipo de um dado, use o palavra reservada typeof
 */

let string1 = 'a', string2 = "Ordem e Progresso";
console.log(string1 + " é do tipo " + typeof string1 + "\n" + string2 + " é do tipo: " + typeof string2);

let num1 = 10;
const num2 = 77.7;
console.log(num1 + " é do tipo: " + typeof num1 + "\n" + num2 + " é do tipo: " + typeof num2);

let bigInt1 = 12345678901234567890n, bigInt2 = BigInt(12345678901234567890);
console.log(bigInt1 + " é do tipo: " + typeof bigInt1 + "\n" + bigInt2 + " é do tipo: " + typeof bigInt2);

let boolean1 = true, boolean2 = false;
console.log(boolean1 + " é do tipo: " + typeof boolean1 + "\n" + boolean2 + " é do tipo: " + typeof boolean2);

const object1 = {
    nome: "Ana",
    idade: 25,
    temReserva: true
};

const object2 = new Date('1990-03-10');
console.log(object1 + " é do tipo: " + typeof object1 + "\n" + object2 + " é do tipo: " + typeof object2);

let indefinido;
//const indefinido2; Constante devem ser inicializada, pois posteriormente não receberá mais atribuição
console.log(indefinido + " é do tipo: " + typeof indefinido);

let nulo1 = null;
const nulo2 = null;
console.log(nulo1 + " é do tipo: " + typeof nulo1 + "\n" + nulo2 + " é do tipo: " + typeof nulo2);

let simbolo1 = Symbol('id');
const simbolo2 = Symbol('id');
console.log(simbolo1);
console.log(simbolo2);
//Embora ambos os símbolos sejam declarados como 'id', eles são símbolos únicos
console.log(simbolo1 == simbolo2);

/**
 * [Operadores de Comparação e Operadores Lógicos]
 * É igual à                        ==
 * Tem igual tipo e valor           ===
 * É diferente                      !=
 * Tem diferente tipo e valor       !==
 * Maior que                        >
 * Menor que                        <
 * Maior ou igual à                 >=
 * Menor ou igual à                 <=
 * AND lógico                       &&
 * OR lógico                        ||
 * NOT Negação                      !
 */

//Comparadores de tipos diferentes
let num3 = 2, num4 = 12;
let string3 = "2", string4 = "12", string5 = "John";
console.log(num3 + " (" + typeof num3 + ") < " + num4 + " (" + typeof num4 + ") resulta em: " +  (num3 < num4));
console.log(num3 + " (" + typeof num3 + ") < " + string4 + " (" + typeof string4 + ") resulta em: " +  (num3 < string4));
console.log(num3 + " (" + typeof num3 + ") < " + string5 + " (" + typeof string5 + ") resulta em: " +  (num3 < string5));
console.log(num3 + " (" + typeof num3 + ") > " + string5 + " (" + typeof string5 + ") resulta em: " +  (num3 > string5));
console.log(num3 + " (" + typeof num3 + ") == " + string5 + " (" + typeof string5 + ") resulta em: " +  (num3 == string5));
console.log(string3 + " (" + typeof string3 + ") < " + string4 + " (" + typeof string4 + ") resulta em: " +  (string3 < string4));
console.log(string3 + " (" + typeof string3 + ") > " + string4 + " (" + typeof string4 + ") resulta em: " +  (string3 > string4));
console.log(string3 + " (" + typeof string3 + ") == " + string4 + " (" + typeof string4 + ") resulta em: " +  (string3 == string4));

//Declarações Condicionais if ... else
let ligado = true;
if (ligado) {
    console.log("Está ligado.");
} else {
    console.log("Está desligado.");
}

//if ... else if ... else
let idade = 30;
if (idade < 0) {
    console.log("Erro, idade negativa.");
} else if (idade >= 0 && idade <= 3) {
    console.log("Bebê");
} else if (idade > 3 && idade < 13) {
    console.log("Criança");
} else if (idade >= 13 && idade < 18) {
    console.log("Adolescente");
} else if (idade > 18 && idade < 60) {
    console.log("Adulto");
} else if (idade >= 60 && idade <= 120) {
    console.log("Idoso");
} else {
    console.log("Matusalém")
}

//Ternário ( ? : )
let caixa = false;
console.log("A caixa está " + (caixa ? "aberta" : "fechada"));

//Switch
let estado = 'rj';
switch(estado){
    case 'rj':
        console.log("Rio de Janeiro");
        break;
    case 'sp':
        console.log("São Paulo");
        break;
    case 'mg':
        console.log("Minas Gerais");
        break;
    case 'es':
        console.log("Espírito Santo");
        break;
    default:
        console.log("O estado não pertence à região sudeste.")
}

let pontos = 350;

switch(pontos){
    case 0:
    case 100:
        console.log("Novato");
        break;
    case 150:
    case 300:
        console.log("Aventureiro");
        break;
    case 350:
    case 1000:
        console.log("Mestre");
        break;
    default:
        console.log("Erro");
}

//Booleans, tudo que for sem valor é falso, qualquer coisa com valor é true
// 0, "", undefined, null, NaN, false
//Função Boolean
Boolean(3 > 4);
(5 > 3);