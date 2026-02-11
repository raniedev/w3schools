//Loop for
for (let i = 0; i < 5; i++){
    console.log(i);
}

//Loop while
let i = 0;
let texto = "";
while (i < 10) {
    texto += "O número é " + i;
    i++;
}

//Loop do...while
let j = 0;
let text = "";
do {
    text += "The number is " + j;
    j++;
}while (j < 10);

//Loop for...in (Iteração nas chaves)
const pessoa = {nome: "Ana", sobrenome: "Silva", idade: 25, sangue: "O", fator: true};

for(let p in pessoa){
    console.log(p);
}

let paises = ["Brasil", "Japão", "Itália"];

for(let p in paises){
    console.log(p);
}

//Loop for...of (Iteração nos valores de arrays, strings, Sets, Maps)

//array
let sorvetes = ["Chocolate", "Morango", "Creme", "Limão", "Flocos", "Pistache"];
for(let s of sorvetes){
    console.log(s);
}

//string
let lema = "Fé e Força";
for(let l of lema){
    console.log(l);
}

//Set
const letras = new Set(['a', 'b', 'c', 'd', 'e']);
for(let l of letras){
    console.log(l);
}

//Map
const frutas = new Map([
    ["Banana", 150],
    ["Caju", 75],
    ["Tangerina", 190],
    ["Pêssego", 25]
]);
for(let f of frutas){
    console.log(f);
}

//O método next()
const sorteio = [10, 15, 21, 33, 45, 59];
const iterador = sorteio[Symbol.iterator](); //Irá mostra o valor e um "done" que indica se é o fim ou não da sequência
console.log(iterador.next());
console.log(iterador.next());
console.log(iterador.next());
console.log(iterador.next());
console.log(iterador.next());
console.log(iterador.next());
console.log(iterador.next());

//Funções Auxiliares (Iterator Helper)
//Criar um Iterator

const iterador1 = Iterator.from(['a', 'b', 'c', 'd', 'e', 'f']);
//Interar sobre os elementos
let result1 = "";
for(const x of iterador1) {
    result1 += x;
}
console.log(result1);


const iterador2 = Iterator.from([1, 2, 3, 4, 5, 6, 7]);
//drop(), irá retornar um novo interador que pula um número específico de elementos antes de produzir o restante
const dropar = iterador2.drop(3);
let result2 = "";
for(const d of dropar) {
    result2 += d + " ";
}
console.log(result2);

//every(), faz uma checagem em todos os itens de uma string
const iterador3 = Iterator.from("123456789");
const result3 = iterador3.every(x => x > 0);
console.log(result3);

//filter(). retorna um novo iterador contando os elementos que satisfaçam a função de filtro
const iterador4 = Iterator.from([7, 15, 17, 19, 23, 30, 45, 57]);
const filtro = iterador4.filter(x => x > 10 && x < 20);
let result4 = "";
for(const f of filtro){
    result4 += f + " ";
}
console.log(result4);

//find() retornará o primeiro elemento que satisfaça a função de pesquisa
const iterador5 = Iterator.from([-5, 0, 3, 7, 18, 20, 32, 44]);
const result5 = iterador5.find(x => x < 0)
console.log(result5);

//flatMap(), retorna um novo iterador mapeando cada elemento e "achatando" os resultados em um novo iterador com os valores antigos e os atuais de forma simultânea
const iterador6 = Iterator.from([-5, -2, 0, 7, 15, 20, 50, 100]);
const mapeamento = iterador6.flatMap(x => [x, x * 10]);
let result6 = "";
for(const m of mapeamento){
    result6 += m + " ";
}
console.log(result6);

//map(), retorna um novo iterador mapeando cada elemento e os resultados em um novo iterador com os valores antigos e os atuais de forma simultânea
const iterador7 = Iterator.from([-5, -2, 0, 7, 15, 20, 50, 100]);
const substituicao = iterador7.map(x => [x, x * 2]);
let result7 = "";
for(const s of substituicao){
    result7 += s + " ";
}
console.log(result7);

//forEach()
const iterador8 = Iterator.from("Desordem");
let result8 = "";
iterador8.forEach(x => result8 += x + " ");
console.log(result8);

//reduce(), acumula os valores de um iterator
const iterador9 = Iterator.from([15, 25, 60, 100, 89]);
let result9 = iterador9.reduce(somar);

function somar(total, num){
    return total + num;
}
console.log(result9);

//some(), retorna true se ao menos um valor satisfaz a condição
const iterador10 = Iterator.from("123456789AFMZ");
let result10 = iterador10.some(x => x == 'Z');
console.log(result10);

//take(), retorna uma quantidade determinada de números escolhido através de uma passagem de parâmetro
const iterador11 = Iterator.from([10, 100, 1, 20, 2, 200]);
const pegar = iterador11.take(3);
let result11 = "";
for(const p of pegar){
    result11 += p + " ";
}
console.log(result11);

//Generator
//Uma função JavaScript pode apenas retornar um valor
//Um Generator pode retornar inúmeros valores, um por um
//Um gerador JavaScript pode produzir um fluxo de dados.
//Um gerador JavaScript pode ser pausado e retomado.

//Quando chamada, uma função gerador retorna um objeto Generator, não um valor direto
//A palavra-chave yield pausa a execução e retorna um valor ao chamador.
function* gerador() {
    yield 1; //{value: 1, done: false}
    yield 2; //{value: 2, done: false}
    //{value: 3, done: true}
    return 3;
}

let meuGerador = gerador();
let result12 = "";
for(let g of meuGerador){
    result12 += g + " ";
}
console.log(result12);