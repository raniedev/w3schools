//For loop
const carros = ["Fusca", "BYD", "Monza", "Saveiro", "Kwid", "Tesla"];
let texto = "";

for (let i = 0; i < carros.length; i++){
    texto += carros[i] + "\n";
}

console.log(texto);

// Todos as expressões do loop for são opcionais
// Mas é necessário aplicar antes (inicialização da variável) e dentro do código (incremento e condição de saída)
// Essas condições são necessárias para evitar um loop infinito
let j = 0;
for (;;){    
    if (j == 2) {
        j++;
        continue; //Quebra a continuidade do código mas não sai do laço for
    } else if (j == 5) {
        break; //Encerra o laço for
    }
    console.log(j);
    j++;
}

//Loop for...in são úteis para repetições nas propriedades do objeto
const pessoa = {nome: "Theo", sobrenome: "Abner", age: 20};
for(const p in pessoa){
    console.log(p); //chave
    console.log(pessoa[p]); //valor
}

//Loop for...of mostram os valores de algo iterável, como: arrays, strings, Maps, Sets etc.
const numeros = [100, 110, 120, 130, 140, 150];
for(const n of numeros){
    console.log(n);
}

//Laço While
let i = 0;
while (i < 5) {
    console.log(i);
    i++;
}

let desligado = false;

//do/while
do {
    console.log("Exibe pelo menos 1x, mesmo se a condição for falsa.");
} while(desligado);

//Loops aninhados e Labels
//Labels cria um nome pra uma declaração, ou um bloco de declarações permitindo que sejam referenciadas para controle de fluxo de programa, particularmente em loops
let texto2 = "";
loopX: for (let k = 0; k < 3; k++) {
    loopY: for (let l = 0; l < 5; l++) {
        if (l == 2) {
            break loopY;
        }
        texto2 += k + " " + l + "\n";
    }
}

console.log(texto2);

const produtos = ["Sabonete", "Desodorante", "Shampoo", "Condicionador"];
let texto3 = "";
lista: {
  texto3 += produtos[0] + "\n";
  texto3 += produtos[1] + "\n";
  break lista; //continue não faz sentido usar. por isso, nem funciona
  texto3 += produtos[2] + "\n";
  texto3 += produtos[3] + "\n";
}

//Strings
let lema = "Ordem e Progresso";
console.log(lema.length); //Checar tamanho da string, considera espaços

//Barra invertida é o caractere de escape para apóstrofo, aspas e barra invertida
let escape = "\"Aspas\" \'Apóstrofo\' \\ Barra invertida ";

/**
 * Outros Comandos de escape
 * \b   Backspace
 * \f   Form Feed
 * \n   Nova linha
 * \r   Carriage Return
 * \t   Tab Horizontal
 * \v   Tab Vertical
 * 
 * Nota: Esses escapes foram pensados para máquinas de escrita, teletipos e faxes
 * 
 * Quebrando textos longos, continuando a string em outra linha
 */

let textoLongo = "Linha 1 " +
"Linha 2";

//Strings Template
let template = 
`As templates
permitem quebras de linha
sem a necessidade de concatenação.`;

console.log(template);

//Interpolation, os templates permitem interpolação de variáveis dentro dos templates, como: `${variavel}`
//Não é necessário usar comandos de escape para barra invertida, apóstrofo e aspas
let nome = "Ana", sobrenome = "Silva", idade = 25;
let apresentacao =
`Nome: ${nome} ${sobrenome}
Idade: ${idade}`;

console.log(apresentacao);

//Interpolação de expressões
let a = -1, b = 1, c = 12; //Expressões do 2ª grau (sem tratamento de erro para delta negativo)
let delta = `${(b**2) - 4 * a * c}`;
let x1 = `${(-b + Math.sqrt(delta))/(2 * a)}`;
let x2 = `${(-b - Math.sqrt(delta))/(2 * a)}`;

console.log(
`Delta: ${delta}
x¹: ${x1}
x²: ${x2}`);

//Inserção de tags combinando for com strings em arrays
let items = ["Home", "Posts", "Search", "Movies", "Series", "Games"];
let html = "<ul>";

for(const li of items){
    html += `<li>${li}</li>`
}
html += "</ul>";

document.getElementById("lista").innerHTML = html;

//Métodos de String
//length como já abordado

//charAt(index) informa qual o char do index passado
console.log(lema.charAt(1));

//charCodeAt(index) informa o código do char do index passado
console.log(lema.charCodeAt(1));

//codePointAt(index)
console.log(lema.codePointAt(1));

//at(index) informa qual o char do index passado
console.log(lema.at(1));

//Acesso direto via colchetes e index
console.log(lema[2]);

lema[0] = "M"; //Atenção, tentar mudar o valor de um index diretamente não funciona e não produz erro

//concat()
let frag1 = "Primeiro";
let frag2 = "Segundo";
let concatenacao = frag1.concat(" ", frag2); //primeiro parâmetro
console.log(concatenacao);

//extraindo partes string com slice(start, end)
//se o parâmetro for negativo, irá começar a contar desde a parte final da string
console.log(lema.slice(3, 12));
console.log(lema.slice(-5, -1));

//subtring() é similar ao slice, mas não aceita valores negativos
//os valores negativos são todos tratados como zero
console.log(lema.substring(0, 12));
console.log(lema.substring(-10, 12));

//toUpperCase() transforma o texto em caixa alta
//toLocaleUpperCase() mais apropriado para lidar com conversões sensíveis ao idioma
console.log(lema.toUpperCase());

//toLowerCase() transforma o texto em caixa baixa
//toLocaleLowerCase() mais apropriado para lidar com conversões sensíveis ao idioma
console.log(lema.toLowerCase());

//isWellFormed() verifica se uma string é "bem formada", ou seja, se não contém substitutos solitários (lone surrogates),
console.log("Texto \u3459".isWellFormed());
console.log("Texto \uD800".isWellFormed()); //esse código unicode é undefined por isso resultará em false

//trim() remove os espaços em branco do começo e fim da string
//trimStart() remove apenas do inicio.
//trimEnd() remove apenas do final
let saudacao = "             Oi, tenha um bom dia!           ";
console.log(saudacao.trim());
console.log(saudacao.trimStart());
console.log(saudacao.trimEnd());

//padStart() adiciona no começo de uma string um determinado fragmento de string e informa a quantidade de vezes
//deve ultrapassar o tamanho da string em comparação para começar aparecer o segundo parâmetro
lema = lema.padStart(lema.length + 1, "@");
console.log(lema);

//padEnd() adiciona no final de uma string um determinado fragmento de string e informa a quantidade de vezes
//deve ultrapassar o tamanho da string em comparação para começar aparecer o segundo parâmetro
lema = lema.padEnd(lema.length + 3, "?");
console.log(lema);

//repeat() cria uma cópia da string passada, com o argumento de quantidade de vezes que deseja repetir
let time = "Botafogo";
console.log(time.repeat(3));

//replace() troca a primeira ocorrência de string passada, por uma nova
let presidente = "O atual presidente é o Fulano. Fulano é um bom presidente.";
console.log(presidente.replace("Fulano", "Sicrano"));

//replaceAll() trocas todas as ocorrências de string passada, por uma nova
console.log(presidente.replaceAll("Fulano", "Sicrano"));

//split() transforma em array toda ocorrência que encontrar do parâmetro passado, cada fragmento é cortado e ganha um index no array
let carrinho = "smartphone-playstation-tv-panela";
console.log(carrinho.split("-"));

let pesquisa = "Chris 1 Aline Helena Fernanda 3 Roberto Alan Aline 8 Suelen Caio Ivolanda";

//indexOf() métodos de String Search
//indexOf() mostra o index da primeira ocorrência da palavra pesquisada, se não encontrar retorna -1
console.log(pesquisa.indexOf("Aline"));

//lastIndexOf() mostra o index da última ocorrência da palavra pesquisada, se não encontrar retorna -1
console.log(pesquisa.lastIndexOf("Aline"));

//search() mostra o index da primeira ocorrência da palavra pesquisada ou expressão regular, se não encontrar retorna -1
console.log(pesquisa.search("Aline"));
console.log(pesquisa.search("[7-9]"));

//match() retorna em um array a primeira ocorrência do argumento passado, suporta RegEx
//armazena o argumento, o index, a string completa etc
console.log(pesquisa.match("anda"));

//matchAll() retorna um iterator com todas as ocorrências do argumento passado, suporta RegEx
console.log(pesquisa.matchAll("anda"));
let pesquisar = pesquisa.matchAll("anda");
document.getElementById("match-all").innerHTML = Array.from(pesquisar);

//includes() retorna em booleano sem achou ou não determinado argumento
console.log(pesquisa.toLowerCase().includes("alan"));

//startsWith() retorna em booleano se a string começa com determinado argumento
console.log(pesquisa.startsWith("Ch"));
console.log(pesquisa.startsWith("Ch", 2)); //É possível passar um index para determinar onde começar dentro da string

//endsWith() retorna em booleano se a string termina com determinado argumento
console.log(pesquisa.endsWith("..."));
console.log(pesquisa.endsWith("Aline", 13)); //É possível passar um index para determinar onde começar dentro da string

//String References
//constructor retorna o construtor da string
console.log(pesquisa.constructor);

//String.fromCharCode() retorna o valor unicode dos caracteres
let unicode = String.fromCharCode(72, 69, 76, 76, 79);
console.log(unicode);

//localeCompare() comparar duas strings e verifica, irá atribuir:
// -1 se a primeira string estiver posicionada anterior a segunda
// 0 se as strings forem iguais
// 1 se a primeira string estiver posicionada posterior a segunda
let arg1 = "bc", arg2 = "fg", arg3 = "bc", arg4 = "ab";
console.log(arg1.localeCompare(arg2));
console.log(arg1.localeCompare(arg3));
console.log(arg1.localeCompare(arg4));

//valueOf() é um método que converte um objeto em seu valor primitivo
let exemplo = "Hello World!";
let valor = exemplo.valueOf();

console.log(valor);
console.log(new Date().valueOf());

//prototype() permite adicionar novos atributos e métodos em um objeto
//Será abordado depois em Objetos