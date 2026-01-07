//Objetos
//Os objetos devem ser inicializados como const, por convenção a primeira letra da palavra é colocada em maiúscula
const carro = {
    //Propriedades
    nome: "Nissan GTR",
    modelo: "R34",
    peso: 1750,
    cor: "Cinza Fosco",
    //Métodos
    partida: function(ligado) {
        return ligado ? false : true;
    },
    dirigir: function(){
        return "Dirigindo...";
    },
    freiar: function(){
        return "Reduzindo velocidade.";
    },
    parar: function(){
        return "Carro totalmente parado."
    }
}

//const pessoa = new Object({})
//Pode-se criar um objeto usando o new Object({}), mas é preferível criar de forma literal, como: const pessoa = {}

//palavra chave this.
const pessoa = {
    nome: "Mateus",
    sobrenome: "Souza",
    idade: 25,
    sexo: 'M',
    fome: false,
    sede: true,
    ficha: function() {
        return `Nome Completo: ${this.nome} ${this.sobrenome}\nIdade: ${this.idade}\nSexo: ${this.sexo}\n${this.fome ? "Está" : "Não está"} com fome\n${this.sede ? "Está" : "Não está"} com sede`;
    }
}

//Adicionar novas propriedades
pessoa.sangue = "O";
pessoa.fator = true; //true = positivo, false = negativo

//Adicionar novos métodos
pessoa.nomeCompleto = function() {
    return `${this.nome} ${this.sobrenome}`;
}

//É possível acessar um atributo de dois jeitos
//Através de .propriedade ou ["propriedade"]
console.log(pessoa.nome);
console.log(pessoa["sobrenome"]);

//acessando um método
let fichaTecnica = pessoa.ficha();//Irá chamar a função e receber o resultado
console.log(fichaTecnica);
let funcaoFicha = pessoa.ficha;//Irá receber a função, uma cópia

//Construtor de um objeto
function Jogo(nome, console, multiplayer) {
    this.nome = nome;
    this.console = console;
    this.multiplayer = multiplayer;
}

//Instanciar um objeto
const jogo1 = new Jogo("GTA: San Andreas", "PlayStation 2", true);
const jogo2 = new Jogo("Sonic: the Hedgehog", "Mega Drive", false);
const jogo3 = new Jogo("Street Fighter", "Arcade", true);

/**
 * Curiosidade
 * No JavaScript, quase tudo é um objeto
 * Objects são obviamente objetos
 * Maths são objetos
 * Functions são objetos
 * Dates são objetos
 * Arrays são objetos
 * Maps são objetos
 * Sets são objetos
 */

//Valores default
function Funcionario(nome, idade, nacionalidade = "brasileiro"){
    this.nome = nome;
    this.idade = idade;
    this.nacionalidade = nacionalidade;
}

const func1 = new Funcionario("Alan", 33); //Vai receber brasileiro como nacionalidade, pois não foi passado via parâmetro
const func2 = new Funcionario("Helena", 21, "portuguesa");

//Adicionar nova propriedade em todas as instâncias de um Construtor, deve usar o .prototype
Funcionario.prototype.time = "Botafogo";
console.log(func1.time);
console.log(func2.time);


//Objetos aninhados
const casa = {
    comodos: 4,
    comodo: {
        nome: "Quarto",
        lampadas: 1
    }
}

//Acessar um objeto aninhado
console.log(casa.comodo.nome);
console.log(casa["comodo"]["lampadas"]);

//Apagar propriedade
console.log(casa);
delete casa.comodos;
console.log(casa);

//For...in em um objeto
for(let f in Funcionario) {
    console.log(f); //Chave
    console.log(Funcionario[f]); //valor
}

//Jogar em um array os valores de um objeto
const pessoa1 = Object.values(pessoa);
console.log(pessoa1);
const funcionario1 = Object.values(func1);
console.log(funcionario1);

const frutas = {Bananas: 300, Laranjas: 200, Maçãs: 500};

let compra = "<ul>";
for (let [fruta, valor] of Object.entries(frutas)) {
  compra += "<li>" + fruta + ": " + valor + "</li>";
}
compra += "</ul>";

document.getElementById("compra").innerHTML = compra;

//Objetos JavaScript podem ser convertido para strings com o método JSON.stringfy()
let objTexto = JSON.stringify(jogo1);
console.log(objTexto);

//Escopo está relacionado a visibilidade de determinada variável/constante
//JavaScript tem 3 tipos de escopo: Global, de Função, de Bloco.
//Todos são Escopo Global
var x = 1;
let y = 2;
const z = 3;

//Escopo de Função
function escopoFuncao() {
    //Só funciona dentro desta função
    let escopoFunc = 1 + z;
    return escopoFunc;
}

console.log(escopoFuncao());

//Escopo de Bloco
{
    //Só funciona dentro deste bloco
    let escopoBloco = 2;
    console.log(escopoBloco + " " + (x + y + z));
}

//"strict mode"; no ínicio do script ou de uma função irá informar ao programa que não deve usar variáveis que não foram declaradas anteriormente e que estejam no mesmo bloco (anulando o var global)
//Já que através do var é possível declarar posteriormente (não recomendando, declare sempre antes e evite usar var)

function strictMode(){
    "use strict";
    var strict;
    //delete strict; dará erro
    var o = { p: 1, p: 2 };
    console.log(o); //apenas mostrará um p
}

strictMode();

//Mais detalhes em: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Strict_mode