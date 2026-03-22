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

/**
 * RegEx - Regular Expressions
 * 
 * É uma sequência de caracteres que formam um padrão de pesquisa
 * Regex é um atalho de uma expressão regular
 */

//Um texto envolto de duas barras com i de case-insensitive, indica uma pesquisa que pouco se importa com caixa alta/baixa
let lema = "Ordem Territorial, Progresso, ordem social e programa nacional. Matas verdejantes, Céu azul celeste e aurora de ouro";
let search = lema.search(/ORDEM/i);
let rslt = Math.sign(search);

console.log(rslt >= 0 ? "Encontrou" : "Não Encontrou");

//Substituindo com replace()
let trocar = lema.replace(/ORDEM/i, "Desordem");
console.log(trocar);

//replaceAll()
let cancao = "Amor, meu querido amor.";
let regex = /amor/gi;
let trocarTodos = cancao.replaceAll(regex, "ódio");
console.log(trocarTodos);

//split(), retorna um array com os resultados

//RexExp Alternation (OR), 
let rslt2 = (lema.search(/verde|amarelo|laranja/g));
console.log(rslt2);

/**
 * /d = substring matches
 * /g = global match
 * /i = case-insensitive
 * /m = multiline matching
 * /s = allows (. dot) to match line terminators 
 * /u = unicode
 * /v = an upgrade to the /u flag for better Unicode support 
 * /y = performs a "sticky" search
 * 
**/

// Determina qual deve ser o início AND o final de uma string
const barraD = /(can)(cao)/d;
let palavra1 = "cancao";
let palavra2 = "cançao";
let palavra3 = "canção";

let match1 = palavra1.match(barraD);
let match2 = palavra2.match(barraD);
let match3 = palavra3.match(barraD);

console.log("Regex Flag /d");
console.log(match1);
console.log(match2); //null
console.log(match3); //null

// O sinalizador /s permite que o metacaractere . (ponto) corresponda aos caracteres 
// de nova linha (\n), além de qualquer outro caractere.
const barraS = /Line./gs;
let palavra4 = "Line\nLine.";

let match4 = palavra4.match(barraS);
console.log("Regex Flag /s");
console.log(match4);

// O sinalizador /y executa uma pesquisa "fixa"
const barraY = /\w+/y; //The meaning of /\w+/ is "mach any word".
let palavra5 = "abc def ghi";
barraY.lastIndex = 4;
let match5 = palavra5.match(barraY);
console.log("Regex Flag /y");
console.log(match5);

// the /u flag enables full Unicode support in a regular expression.
const barraU = /\u{04DC0}/u;
let palavra6 = "䷀";
let match6 = barraU.test(palavra6);
console.log("Regex Flag /u");
console.log(match6);

// The /v flag is an upgrade to the /u flag for better Unicode support
const barraV = /\p{Emoji}/v;
let palavra7 = "Hello 😄";
let match7 = barraV.test(palavra7);
console.log("Regex Flag /v");
console.log(match7);

// The multiline property returns true if the /m flag is set.
const barraM = /W3Schools/m;
let match8 = barraM.multiline;
console.log("Regex Flag /m");
console.log(match8);

/** RexExp Metacaracteres
 * a|b = Matches a or b
 * . = Matches any (wildcard) character except line terminators
 * \d = dígito/número
 * \D = não dígito
 * \w = palavras (seja letra, dígito e underscore)
 * \W = não palavra
 * \s = espaço
 * \S = não espaço
 * \n = quebra de linha
 * \t = tab
 * \r = carriage return
 * \ddd = octal number ddd
 * \xhh = hexadecimal number hh
 * \uhhhh = hex number hhhh
 * [\b] = matches backspace characters
 * \0 = null characters
 * \p{} = matches characters with given Unicode Property
 * \P{} = matches characters NOT with given Unicode Property
 */

let texto = "Vendo este carro por R$ 39000, este é o CARRO! É extremamente rápido.";
const digito = /\d/g;
const letra = /\w/g;
const espaco = /\s/g;

//match() armazena o que achar em um array
let resultado = texto.match(digito); //todos os dígitos
console.log(resultado);

let resultado2 = texto.match(letra); //todos as palavras
console.log(resultado2);

// RegExp Quantificadores
// Quantificadores definem o número de caracteres ou expressões à combinar
// + um ou mais
// * zero ou mais
// ? zero ou um
// {n} n ocorrências
// {n, m} cria uma range de n para m ocorrências
// {n,} deixando vazio, fica n ou mais ocorrências
const umaOuMais = /a+/i;
const zeroOuMais = /carro*/ig;
const zeroOuUma = /este?/i;
const numOcorrencias = /0{3}/i;

console.log(texto.match(umaOuMais));
console.log(texto.match(zeroOuMais));
console.log(texto.match(zeroOuUma));
console.log(texto.match(numOcorrencias));

// RegExp Assertions
// ^ começo da string
// $ final da string
// \b começo ou final da string
// \B negação do começo ou final da string
// (?=...) string subsequente
// (?!...) negação de string subsequente
// (?<=...) string anterior
// (?<!...) negação de string anterior

let hino = "Ouviram do Ipiranga as margens plácidas";
let comeco = /^Ouviram/;
let final = /plácidas$/;

//test(), testa se há na string ou não o regex passado
console.log(comeco.test(hino));
console.log(final.test(hino));

let musica = "Amor, eu te amo"
let comecoFim = /\bamor/i;
let musica2 = "Amo muito, meu amor"
console.log(comecoFim.test(musica));
console.log(comecoFim.test(musica2));

let tamanho = "10px 20px";
let pixel = /\d+(?=px)/g; //Ao menos um dígito ou mais de um, seguidos de px (pesquisa global)

console.log(tamanho.match(pixel));

//exec(), retorna um iterador de resultados
let texto3 = "E então ele acordou e saiu para olhar o nascer do sol";
let resultado3 = /e/.exec(texto3);
console.log(resultado3);

//matchAll()
let todos = tamanho.matchAll('px');
for(let t of todos){
    console.log(t);
}

// RegExp Classes de Caracteres
// [a], caractere exato
// [^a], negação do caractere passado
// [abc], vários caracteres, significa: a, b ou c 
// [^abc], negação dos caracteres passados
// [0-9], dígitos de 0 até 9
// [^0-9], negação de dígitos de 0 até 9
// [a-z], letras minúsculas de a até z
// [^a-z], negação de letras minúsculas de a até z
// [A-Z], letras maiúsculas de A até Z
// [A-Z], negação de letras maiúsculas de A até Z
let texto2 = "BRASIL foi 5 vezes campeão da copa do mundo, foi pentacampeão em 2002.";
let minuscula = /[a-z]/;
let maiuscula = /[A-Z]/;
let num = /[0-9]/;
let quatroDigitos = /\d{4}/g;
let de2ate4 = /\d{2,4}/g;
let de2emdiante = /\d{2,}/g;

console.log(texto2.match(maiuscula));
console.log(texto2.match(minuscula));
console.log(texto2.match(num));
console.log(texto2.match(quatroDigitos));

// RegExp Lookahead
// x(?=y) combina "x" se "x" é seguido pela string "y"
// x(?!y) é a forma negativa
let texto4 = "Acessando o Twitter Videos";
let lookahead1 = /Twitter(?= Videos)/;
let resultado4 = lookahead1.test(texto4);
console.log(resultado4);

// x(<=y) combina "x" se "x" é precedido pela string "y"
// x(<!y) é a forma negativa
let texto5 = "Acessando o Twitter Videos";
let lookahead2 = /Videos(?= Twitter)/;
let resultado5 = lookahead2.test(texto4);
console.log(resultado4);

// RegExp Groups
// (haha) captures a group of characters
// (haha)+ matches zero or more occurences of the group
let texto6 = "Haha, haha, haha.";
const pattern = /(haha)+/;
let resultado6 = texto6.match(pattern);

// Capturando grupos (?<n>)
const texto7 = "Nome: Pedro Alvares Cabral";

// Using named capturing groups
// Seria como criar rótulos para neste caso 3 palavras (w+), e depois da 1 e 2 palavra tiver um espaço
const lookahead3 = /(?<firstName>\w+) (?<middleName>\w+) (?<lastName>\w+)/;
const resultado7 = texto7.match(lookahead3);

//Esses "rótulos" servem como nomes para depois retornar o que estiver dentro
let fName = resultado7.groups.firstName;
let mName = resultado7.groups.middleName;
let lName = resultado7.groups.lastName;

console.log(`${fName} ${mName} ${lName}`);

// (?flags:pattern) enables the flags only for the pattern in the group
let texto8 = "W3Schools tutorials.";
const lookahead4 = /(?i:w3schools) tutorials/;
// Returns true:
let resultado8 = lookahead4.test(texto8);
console.log(resultado8);

// Método RegExp.escape()
// Isso torna possível tratar caracteres como +, *, ?, ^, $, (, ), [, ], {, }, | e \ literalmente, 
// e não como parte de uma expressão regular.

// Escape a text for to use as a regular expression
const safe = RegExp.escape("[*]");
// Build a new reglar expression
const rgx = new RegExp(safe);
// Text to replace within
const oldText = "[*] is a web school.";
// Perform the replace
const newText = oldText.replace(rgx, "W3Schools");

// Outros Métodos
// Constructor, the constructor property returns the function that created the RegExp prototype
let pattern_1 = /Hello World/g;
let text = pattern_1.constructor;

// dotAll
// The dotAll property returns true if the /s flag is set.
const pattern_2 = /W3Schools/s;
let result_2 = pattern_2.dotAll;

// flags
// The flag property returns the flags set in a regular expression.
const pattern_3 = /W3Schools/gi;
let result_3 = pattern_3.flags;

// global
// The global property returns true if the /g flag is set, otherwise false


// hasIndices
// The hasIndices property returns true if the /d flag is set.
const pattern_4 = /W3Schools/d;
let result_4 = pattern_4.hasIndices;

// ignoreCase
// The ignoreCase property returns true if the /i flag is set.
let pattern_5 = /ws3/i;
let result_5 = pattern_5.ignoreCase;

// multiline
// The multiline property returns true if the /m flag is set, otherwise false
let pattern_6 = /W3S/gi;
let result_6 = pattern_6.multiline;

// source
// The source property returns the text of a RegExp pattern
let pattern_7 = /W3S/gi;
let result_7 = pattern_7.multiline;

// sticky
// The sticky property returns true if the /y flag is set.
const pattern_8 = /W3Schools/y;
let result_8 = pattern_8.sticky;

// toString
// toString() returns the string value of a RegExp object
let pattern_9 = new RegExp("Hello World", "g");
let text_9 = pattern_9.toString();

// unicode
// The unicode property returns true if the /u flag is set
const pattern_10 = /W3Schools/;
let result_10 = pattern_10.unicode;

// unicodeSets
// The unicodeSets property returns true if the /v flag is set
const pattern_11 = /W3Schools/;
let result_11 = pattern_11.unicodeSets;