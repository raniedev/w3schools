//Números são sempre 64-bit Floating Point, e é o mesmo para integer, float, short, long, big int etc.
//1 bit (63) positivo ou negativo | 11 bits (52-62) expoente | 52 bits (0-51) valor numérico

let numero = 3.1415; //Número com decimal
let numero2 = 3; //Número sem decimal
let notacao = 123e5; //Número com notação científica (expoente positivo)
let notacao2 = 123e-5; //Número com notação científica (expoente negativo)

//Operações com Strings numéricas
let numero3 = "100", numero4 = "10";
//Adição não funciona, pois o símbolo + é considerada como concatenação
console.log(numero3 + numero4);//10010 e não 110
//Subtração funciona
console.log(numero3 - numero4);
//Multiplicação funciona
console.log(numero3 * numero4);
//Exponenciação funciona
console.log(numero3 ** numero4);
//Divisão funciona
console.log(numero3 / numero4);
//Módulo funciona
console.log(numero3 % numero4);

//NaN (Not a Number) é um indicador de que um valor não é um Number válido
let nan = 100 / "x";
console.log(nan);
//Existe uma função isNaN() para checar se um valor é NaN ou um Number válido
console.log(isNaN(nan));
console.log(isNaN(numero));

//Vale ressaltar que NaN é do tipo Number
console.log(typeof NaN);

//Infinity ou -Infinity é um valor especial para representar o infinito, isso ocorre quando as variáveis vão além dos seus limites de capacidade
//Divisão por zero também recebe Infinity como retorno
console.log(100/0);
console.log(typeof Infinity);

//valores binários utilizam o prefixo 0b
console.log(`O número binário 101010 é equivalente ao número: ${0b101010}`);

//valores octais utilizam o prefixo 0o
console.log(`O número octal 0o45 é equivalente ao número: ${0o45}`);

//Valores hexadecimais utilizam o prefixo 0x
console.log(`O número hexadecimal 0xFF é equivalente ao número: ${0xFF}`);

let converter = 46;
//Transformar um número em uma determinada base usando toString()
//Binário = toString(2)
console.log(`O número ${converter} em binário é equivalente à ${converter.toString(2)}`);
console.log(`O número ${converter} em octal é equivalente à ${converter.toString(8)}`);
console.log(`O número ${converter} em hexadecimal é equivalente à ${converter.toString(16)}`);
console.log(`O número binário 101011 em decimal é equivalente à ${0b101011.toString(10)}`);
console.log(`Base não convencionais também podem ser criadas, exemplo do número ${converter} na base 32 é equivalente à ${converter.toString(32)}`);

let decimal = 19.695;
//Métodos Number
//toExponential() retorna uma string com formato exponencial
console.log(decimal.toExponential());
console.log(decimal.toExponential(7));

//toFixed retorna uma string especificando o número de casas decimais
console.log(decimal.toFixed(2));
console.log(decimal.toFixed(6));

//toFixed retorna uma string especificando também o tamanho de casas decimais, também considera a parte inteira
console.log(decimal.toPrecision(2));
console.log(decimal.toPrecision(6));

//valueOf() retorna um número como um número
console.log((123).valueOf());

//Método Number(), converte variáveis (geralmente strings) para Number
let numString = "50";
let conversao = Number(numString);
console.log(
`Tipo do ${numString} é ${typeof numString}
Tipo do ${conversao} é ${typeof conversao}
Number(true) equivale à ${Number(true)}
Number(false) equivale à ${Number(false)}
Number("    10    ") equivale à ${Number("    10    ")}
Number("10.33") equivale à ${Number("10.33")}
Number("10,33") equivale à ${Number("10,33")}
Number("10 33") equivale à ${Number("10 33")}
Number("Ana") equivale à ${Number("Ana")}`);

//Number() sendo usado para conversão de datas
console.log(Number(new Date("2017-09-30")));

//Essas funções podem ser chamadas sem o Number. no começo
//Number.parseFloat() converte string para números (apenas a parte decimal)
console.log(parseInt("-10"));
console.log(parseInt("-5.25"));
console.log(parseInt("25 2"));
console.log(parseInt("50 anos"));
console.log(parseInt("ano 1º"));

//Number.parseFloat() para float utilize parseFloat
let flutuante = parseFloat("3.33");
console.log(flutuante);

//Number.isNaN() retorna se um valor é NaN ou não
console.log(isNaN(flutuante));

//Number.isFinite retorna se um valor é finito ou não
console.log(isFinite(flutuante));

//Precisam do Number.
//Number.isInteger() retorna se um valor é inteiro ou não
console.log(Number.isInteger(flutuante));

//Number.isSafeInteger() retorna se um argumento é um inteiro seguro ou não
console.log(Number.isSafeInteger(10));
console.log(Number.isSafeInteger(8934298432893420942389));

//Number.EPSILON
console.log(Number.EPSILON);

//Number.MIN_VALUE e Number.MAX_VALUE
console.log(Number.MIN_VALUE);
console.log(Number.MAX_VALUE);

//Max e Min Safe Values
console.log(Number.MIN_SAFE_INTEGER);
console.log(Number.MAX_SAFE_INTEGER);

//Underflow (Quando o limite da capacidade da variável é ultrapassado no valor negativo)
//Overflow (Quando o limite da capacidade da variável é ultrapassado no valor positivo)
console.log(Number.NEGATIVE_INFINITY);
console.log(-1 / 0);
console.log(Number.POSITIVE_INFINITY);
console.log(1 / 0);

//NaN
console.log(Number.NaN);

let bit1 = 12, bit2 = 5, bit3 = 2;
/** Operadores Lógicos BITWISE
 * E (AND) lógico           &
 * OU (OR) lógico           |
 * OU EXCLUSIVO (XOR)       ^
 * NÃO (NOT)                ~
 * Zero Fill Left Shift     <<
 * Signed Right Shift       >>
 * Zero Fill Right Shift    >>>
 */
console.log(
`${bit1.toString(2)} & ${bit2.toString(2)} = ${(bit1 & bit2).toString(2)}
${bit1.toString(2)} | ${bit2.toString(2)} = ${(bit1 | bit2).toString(2)}
${bit1.toString(2)} ^ ${bit2.toString(2)} = ${(bit1 ^ bit2).toString(2)}
~${bit1.toString(2)} = ${(~bit1).toString(2)}
${bit1.toString(2)} << ${bit3} = ${(bit1 << bit3).toString(2)}
${bit1.toString(2)} >> ${bit3} = ${(bit1 >> bit3).toString(2)}
${bit1.toString(2)} >>> ${bit3} = ${(bit1 >>> bit3).toString(2)}`);

//Como criar um BigInt
let big1 = 999999999999999n;
let big2 = BigInt("999999999999999");
console.log(big1);
console.log(typeof big1);
console.log(big2);
console.log(typeof big2);

//Funções
//São bloco de códigos que serão reutilizados no decorrer do programa através de chamadas
//no JavaScript utiliza a palavra reservada function

function somar(x, y){
    return x + y;
}

console.log(somar(3, 5));

//Arrow Functions
let subtrair = (x, y) => x * y;

//Parâmetros default, basta atribuir um valor e se o valor não for passado via parâmentro o valor padrão será atribuído
function multiplicar(x, y = 2){
    return x * y;
}

console.log(multiplicar(3));

//Parâmetros Rest, permite que uma função seja tratada com uma infinidade de números de argumentos
function adicao(...args){
    let soma = 0;
    for(let arg of args){
        soma += arg;
    }
    return soma;
}

let resultado = adicao(10, 5, 2, 11, 23, 9, 10, 23, 30);
console.log(resultado);

//Argumento Object
function multiplicacao(){    
    let mult = 1;
    for(let i = 0; i < arguments.length; i++){
        mult *= arguments[i];
    }
    return mult;
}

console.log(multiplicacao(10, 2, 3));

//Argumentos são passados por valor, ou seja, não muda o parâmetro passado. Se dentro da função o argumento mudar, não irá mudar variável que foi passado como parâmetro.
//Objetos são passados por referência, ou seja, irá mudar o valor. Se dentro da função o objeto sofrer mudança, irá impactar no objeto original.

//Função expressão, é uma função que é atribuída em uma variável
const funcExp = function(a, b) {return a * b};
console.log(funcExp);

//Arrow Functions
let flecha = (a, b) => a + b;
let flecha2 = (a, b) => { return a * b }; //com return é necessário uso de chaves

