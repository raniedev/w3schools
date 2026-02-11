//Math.PI, retorna o valor de π
let pi = Math.PI;
console.log(pi);

//Math.E, retorna o número de Euler
let euler = Math.E;
console.log(euler);

//Math.SQRT2, retorna a raiz quadrada de 2
let raiz2 = Math.SQRT2;

//Math.SQRT1_2, retorna a raiz quadrada de 1/2
let raizMeio = Math.SQRT1_2;

//Math.LN2, retorna o logaritmo de 2
let log2 = Math.LN2;

//Math.LN10, retorna o logaritmo de 10
let log10 = Math.LN10;

//Math.LOG2E, retorna a base 2 logaritmo de E
let log2e = Math.LOG2E;

//Math.LOG10E, retorna a base 10 logaritmo de E
let log10e = Math.LOG10E;

//Arredondamentos
//Math.round(), arredonda para mais próximo do inteiro
let numero = 10.5;
let arredonda = Math.round(numero); //Quando for exatamente valores que terminam com meio (0.5, 1.5, 2.5 etc) sempre será arredondado para cima
console.log(arredonda);

//Math.ceil(), arredonda para cima
arredonda = Math.ceil(numero);
console.log(arredonda);

//Math.floor(), arredonda para baixo
arredonda = Math.floor(numero);
console.log(arredonda);

//Math.trunc(), retorna apenas a parte inteira
arredonda = Math.trunc(numero);
console.log(arredonda);

//Math.sign(), retorna (-1) se o númnero é negativo, (0) ser for zero ou (1) se for um número positivo
console.log(Math.sign(-25));
console.log(Math.sign(0));
console.log(Math.sign(50));

//Math.pow(a, b), monta uma exponenciação onde o primeiro valor corresponde a base e o segundo ao expoente (a^b)
console.log(Math.pow(8, 2));

//Math.sqrt(), retorna a raiz quadrada de algum número passado via parâmetro
console.log(Math.sqrt(81));

//Math.cbrt(), retorna a raiz cúbica de algum número passado via parâmetro
console.log(Math.cbrt(27));

//Math.abs(), retorna o valor absoluto de um número
console.log(Math.abs(-15.2));

//Math.sin(a * Math.PI / 180), retorna o seno
console.log(Math.sin(90 * Math.PI / 180));

//Math.cos(a * Math.PI / 180), retorna o cosseno
console.log(Math.cos(45 * Math.PI / 180));

//Math.tan(a * Math.PI / 180), retorna a tangente
console.log(Math.tan(30 * Math.PI / 180));

//Math.min() e Math.max(), retorna o valor mínimo e o máximo
console.log(Math.min(15, 2, 90, 25, 105, 89));
console.log(Math.max(15, 2, 90, 25, 105, 89));

//Math.random(), retorna um valor aleatório entre 0 e 1
console.log(Math.random());

let aleatorio = ((Math.random() * 10) + 1);
console.log(aleatorio);
console.log(Math.floor(aleatorio));

//Math.log(), retorna o logaritmo
console.log(Math.log(2));

//Math.log2(), returna a base 2 logaritmo de x
console.log(Math.log2(8));

//Math.log10(), returna a base 10 logaritmo de x
console.log(Math.log10(10000));

/**
 * Outros Métodos
 * 
 * cosh(x), retorna o cosseno hiperbólico de x
 * sinh(x), retorna o seno hiperbólico de x
 * tanh(x), retorna o tangente hiperbólico de x
 * acos(x), retorna o arco cosseno de x, em radianos
 * acosh(x), retorna o arco cosseno hiperbólico de x
 * asin(x). retorna o arco seno de x, em redianos
 * asinh(x), retorna o arco seno hiperbólico de x
 * atan(x), retorna o arco tangente de x como um valor número entre -PI/2 ... PI/2
 * atan2(y, x), retorna o arco tangente do quociente de seus argumentos
 * atanh(x), retorna o arco tangente hiperbólico de x
 * clz32(x), retorna o número de zeros à esquerda em uma representação binária de 32 bits de x
 * exp(x), retorna o valor de E^x
 * expm1(x), retorna o valor de (E^x) - 1
 * f16round(x), retorna x, arredondado para baixo para o número inteiro mais próximo
 * fround(x), retorna a representação flutuante mais próxima (precisão única de 32 bits) de um número
 * log1p(x), retorna o logaritmo natural de 1 + x
 */

//Determinar uma função aleatória passando parâmetros de mínimo e máximo
//Deveria ter um tratamento de erro para verificar se o min é realmente um número menor que máx
//E deveria exigir ao menos dois números diferentes
function numAleatorio(min, max){
    return Math.floor(Math.random() * (max - min)) + min;
}

console.log(numAleatorio(5, 25));