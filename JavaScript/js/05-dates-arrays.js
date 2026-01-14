/**
 * Existem 9 jeitos de trabalhar com datas (estáticas) em JavaScript
 * new Date()
 * new Date(date string)
 * new Date(year, month)
 * new Date(year, month, day)
 * new Date(year, month, day, hours)
 * new Date(year, month, day, hours, minutes)
 * new Date(year, month, day, hours, minutes, seconds)
 * new Date(year, month, day, hours, minutes, seconds, milliseconds)
 * new Date(milliseconds) a partir de (January 1, 1970)
 */

//Data Time atual
const data1 = new Date();
console.log("Data 1:\n" + data1);

document.getElementById("data").innerHTML = data1;

//Data Time string, só aceitam 2 formatos completos
const data2 = new Date("11-25-2026"); //mm-dd-yyyy
const data3 = new Date("2026-11-25"); //yyyy-mm-dd
console.log("Data 2:\n" + data2);
console.log("Data 3:\n" + data3);
//Pode ser passado também no formato (yyyy) e (yyyy-mm)
const data4 = new Date("2011"); //yyyy
const data5 = new Date("2012-11"); //yyyy-mm
console.log("Data 4:\n" + data4);
console.log("Data 5:\n" + data5);

//Data (yyyy, mm)
//Vale ressaltar que os meses são contados de 0 até 11
//Datas com anos reduzidos para 1 ou 2 dígitos são considerados 19xx
const data6 = new Date(9, 0); //1909
console.log("Data 6:\n" + data6);

//Data (yyyy, mm, dd)
const data7 = new Date(90, 7, 25); //1990
console.log("Data 7:\n" + data7);

//Data (yyyy, mm, dd, H)
const data8 = new Date(1954, 4, 25, 1);
console.log("Data 8:\n" + data8);

//Data (yyyy, mm, dd, H, m)
const data9 = new Date(1988, 0, 25, 1, 2);
console.log("Data 9:\n" + data9);

//Data (yyyy, mm, dd, H, m, s)
const data10 = new Date(2015, 10, 25, 1, 2, 3);
console.log("Data 10:\n" + data10);

//Data (yyyy, mm, dd, H, m, s)
const data11 = new Date(2020, 11, 25, 1, 2, 3, 4);
console.log("Data 11:\n" + data11);

//milliseconds
const data12 = new Date(345247343234);
console.log("Data 12:\n" + data12);

//Data mais legível usando toDateString()
console.log(data1.toDateString());

//Data mais legível usando toUTCString()
console.log(data2.toUTCString());

//Data mais legível usando toISOString()
console.log(data2.toISOString());

//ISO Dates podem ser escritas no formato mais completo
//YYYY-MM-DDTHH:MM:SSZ
const data13 = new Date("2015-03-25T12:00:00Z");
console.log("Data 13:\n" + data13);

const data14 = new Date("August 19, 1975 23:15:30 GMT+07:00");
console.log("Data 14:\n" + data14);

/** Meses reduzidos
 * Jan = January
 * Feb = February
 * Mar = March
 * Apr = April
 * May = May
 * Jun = June
 * Jul = July
 * Aug = August
 * Sep = September
 * Oct = October
 * Nov = November
 * Dec = December
 */

const data15 = new Date("Apr 25 2015");
console.log("Data 15:\n" + data15);

//Aceita o formato dd mm yyyy neste caso pois espeficica claramente qual é mm ou dd, o que não acontece somente com números
const data16 = new Date("19 Jun 2015");
console.log("Data 16:\n" + data16);

const data17 = new Date("2008 Mar 07");
console.log("Data 17:\n" + data17);

const data18 = new Date("April 25 2015");
console.log("Data 18:\n" + data15);

//Aceita o formato dd mm yyyy neste caso pois espeficica claramente qual é mm ou dd, o que não acontece somente com números
const data19 = new Date("19 June 2015");
console.log("Data 19:\n" + data16);

//Lembrando que os meses são case insensitive
const data20 = new Date("2008 March 07");
console.log("Data 20:\n" + data17);

//Formatos mais simples, usados no dia-a-dia
//Sempre no formato (mm dd yyyy) ou (yyyy mm dd)
const data21 = new Date("03/25/1996");
console.log("\n" + data21);

const data22 = new Date("1997/03/25");
console.log(data22);

const data23 = new Date("03-25-1992");
console.log(data23);

const data24 = new Date("1993-03-25");
console.log(data24);

//Date.parse() irá converter uma data para milisegundos
let data25 = Date.parse("March 21, 2012");
console.log("\n" + data25);

//Dica: É possível voltar para date, já que uma das declaraçãoes de datas é passando milliseconds apenas
const data26 = new Date(data25);

//Como extrair dados de uma data
//getFullYear()
console.log("\n" + data1.getFullYear());

//getMonth() 0 até 11
console.log(`${data1.getMonth()} lembrando que zero seria o mês de Janeiro.`);

//getDate() 1 até 31
console.log(data1.getDate());

//getDay() 0 até 6
console.log(data1.getDay());

//getHours() 0 até 23
console.log(data1.getHours());

//getMinutes() 0 até 59
console.log(data1.getMinutes());

//getSeconds() 0 até 59
console.log(data1.getSeconds());

//getMilliseconds() 0 até 999
console.log(data1.getMilliseconds());

//getTime() milisegundos de January 1, 1970
console.log(data1.getTime());

//Date.now() retorna o número de milisegundos desde January 1, 1970
console.log(Date.now());

/**
 * UTC Date Métodos (coloque UTC entre get e o nome do método)
 * getUTCDate() mesmo que getDate()
 * getUTCFullYear()
 * getUTCMonth()
 * getUTCDay()
 * getUTCHours()
 * getUTCMinutes()
 * getUTCSeconds()
 * getUTCMiliseconds()
 */

//getTimezoneOffset() é o método que retorna a diferença em minutos entre o tempo local com o tempo UTC
console.log(data1.getTimezoneOffset());

/**
 * Assim como tem os métodos GET, também há os métodos SET
 * setDate()
 * setFullYear()
 * setHours()
 * setMilliseconds()
 * setMinutes()
 * setMonth()
 * setSeconds()
 * setTime()            Milisegundos desde January 1, 1970.
 */

console.log("\nAplicando métodos set\n" + data2);
data2.setFullYear(2015);
console.log(data2);
data2.setFullYear(2002, 11, 25);
data2.setHours(12);
data2.setMinutes(30);
data2.setSeconds(15);
console.log(data2);

/**
 * Outros métodos
 * toISOString()
 * toJSON()
 * toLocaleDataString()
 * toLocaleTimeString()
 * toLocaleString()
 * toString()
 * toTimeString()
 * valueOf()
 */

console.log(data2.toJSON());
console.log(data2.toUTCString());

//Arrays
//Array é um objeto para armazenar coleções de dados
//Dois jeitos de criar um array
const vazio1 = [];
const vazio2 = new Array();

const carros = ["Fiat", "Ford", "Hyundai", "Toyota", "Honda", "BMW"];
const sorvetes = new Array("Chocolate", "Creme", "Morango", "Flocos", "Pistache");

/**
 * Elements: Um array é uma lista de valores, conhecido como elementos.
 * Ordered: Os elementos do array são baseados nos seux indexes.
 * Zero indexed: O primeiro elemento é o index 0, o segundo é o index 1, etc
 * Dynamic size: Arrays podem crescer ou ser reduzido conforme os elementos são adicionados ou removidos.
 * Heterogeneous: Arrays podem armazenar elementos de diferentes tipos de dados. (Number, String, Objects, outros Arrays, Booleans)
 */

const objeto = {
    nome: "Nome",
    sobrenome: "Sobrenome",
    idade: 25
}

const elementos = [true, "string", 123, 5.25, carros, objeto];

//Adicionar e Acessar
carros[6] = "Nissan";
console.log(carros[0]);

//Converter Array em String
console.log(carros.toString());

//Tamanho do Array
console.log(carros.length);

//Retorna true se um objeto foi criado por um determinado construtor
console.log((elementos instanceof Array));

//Métodos de Array
//at() retorna o que está em um determinado index
console.log(elementos.at(2));
console.log(elementos[2]);

const salgados = new Array("Coxinha", "Risole", "Italiano", "Pastel", "Quibe", "Empadinha", "Esfirra");
//join() transforma um array em string e pode selecionar o separador
document.getElementById("salgados").innerHTML = salgados.join(" | ");

//pop() remove o último elemento de um array
salgados.pop();
console.log(salgados);

//push() adiciona um elemento ao final do array
salgados.push("Pão de Pizza");
console.log(salgados);

//shift() o método remove o primeiro array e "muda/desloca" todos os outros elementos para indexes mais baixos
salgados.shift();
console.log(salgados);

//unshift() adiciona um novo elemento a uma matriz (no início) e "muda/desloca" elementos mais antigos
salgados.unshift("Bolinha de Queijo");
console.log(salgados);

//Acessar sempre o último valor de um array
console.log(salgados[salgados.length - 1]);

//Array.isArray() para checar se um Array ou não
Array.isArray(salgados);

//concat() para juntar dois Arrays
const comidas = sorvetes.concat(salgados);
console.log(comidas);

//Juntando 3 ou mais arrays
const coisas = sorvetes.concat(salgados, carros);
console.log(coisas);

//Copiar elementos de array a custo de substituir outros
salgados.copyWithin(2, 0); //Copia os dois primeiros elementos colocando index 0 as cópias, mas perde os 2 últimos
console.log(salgados);

//flat() cria um novo array através de outros sub-arrays
const matriz = [[1,2,3], [4,5,6], [7,8,9]];
const vetor = matriz.flat();
console.log(vetor);

//flatMap() pode fazer cálculos distintos entre os elementos de um array através de "arrow function" e "parametro"
const array = vetor.flatMap(x => [x, x + 10]); //vai manter o primeiro, no segundo vai somar 10
console.log(array);

console.log(carros);
//splice() pode adicionar novos elementos em um array e escolher a sua posição, também pode escolher se irá ou não substituir antigos elementos
carros.splice(2, 0, "Audi", "Ferrari");
console.log(carros);

//pode ser usado apenas para apagar items
//(index, quantos elementos)
carros.splice(0, 2); //apagar os dois primeiros itens
console.log(carros);

//toSpliced() preserva oa array antigo e cria um novo
const meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"];
//(inicio do corte, fim do corte)
const newMeses = meses.toSpliced(0, 3, "Mês X", "Mês Y");
console.log(meses);
console.log(newMeses);

//slice() corta o array e cria um novo array
//(index de inicio, index final)
console.log(sorvetes.slice(sorvetes.length - 3, sorvetes.length)); //Os três últimos

//Search em Arrays
//indexOf() acha o index de uma palavra, se não achar retorna -1
console.log(meses.indexOf("Abril")); // index 3
console.log(meses.indexOf("Dezembro")); //-1 (não achou)
//Um segundo argumento define de onde começar a procurar
console.log(meses.indexOf("Abril", 4)); //-1 (não achou)

//lastIndexOf() é o mesmo que indexOf() mas retorna a última ocorrência
const sorteio = [3, 10, 7, 89, 843, 20, 10, 33, 77, 7, 11, 2];
console.log(sorteio.lastIndexOf(7));

//includes() boolean para mostrar se há um elemento ou não
console.log(sorvetes.includes("Creme"));

//find(), retorna o valor
const numeros = [4, 9, 16, 25, 29, 40, 53];
let primeiro = numeros.find(myFunction);  //passa o array para uma function
console.log(primeiro);

function myFunction(value, index, array) {
    //console.log(array);
    //console.log(index);
    //console.log(value);
    return value > 25; // o primeiro maior que 25 irá retornar
}

//findIndex(), retorna o index
console.log(numeros.findIndex(myFunction));

//findLast(), uma pesquisa que começa pelo final do array
const temp = [27, 28, 11, 2, 30, 40, 42, 35, 30];
let high = temp.findLast(x => x > 40); //versão reduzida como arrow function
console.log(high);

//Da mesma forma, também há a versão que encontra o index
let index = temp.findLastIndex(x => x > 40);
console.log(index);

//Métodos de ordenação
//sort()
const bebidas = new Array("Café", "Água", "Chá", "Suco", "Vinho", "Refrigerante", "Cerveja", "Vodka", "Energético", "Caipirinha", "Cachaça");
document.getElementById("array").innerHTML = bebidas;
bebidas.sort();
document.getElementById("sort").innerHTML = bebidas; //Mudou o array original
//reverse()
document.getElementById("reverse").innerHTML = bebidas.reverse(); //Mudou o array original novamente

const sobremesas = ["Água de Coco", "Pudim", "Docinho", "Pavê", "Chocolate", "Sorvete", "Gelatina", "Bolo", "Torta", "Cocada", "Doce de Leite"];
//Métodos que não mudam o array original
//toSorted()
document.getElementById("array2").innerHTML = sobremesas;
document.getElementById("to-sorted").innerHTML = sobremesas.toSorted(); //array original segue intacto

//toReversed()
document.getElementById("to-reversed").innerHTML = sobremesas.toReversed(); //array original segue intacto

//Sort numéricos
const pontos = [-82, 40, 100, 1, 5,  -2, 25, 10,-100, 0, -8];
document.getElementById("array3").innerHTML = pontos;

const bt1 = document.getElementById("bt1");
const bt2 = document.getElementById("bt2");
const bt3 = document.getElementById("bt3");
const bt4 = document.getElementById("bt4");
const bt5 = document.getElementById("bt5");

bt1.addEventListener("click", function() {
    pontos.sort();
    document.getElementById("array3").innerHTML = pontos;
});

bt2.addEventListener("click", function() {
    pontos.sort(function(a, b){ return a - b; });
    document.getElementById("array3").innerHTML = pontos;
});

bt3.addEventListener("click", function() {
    pontos.sort(function(a, b){ return b - a; });
    document.getElementById("array3").innerHTML = pontos;
});

//Este código favorece alguns números perantes outros
bt4.addEventListener("click", function() {
    pontos.sort(function(){ return 0.5 - Math.random() });
    document.getElementById("array3").innerHTML = pontos;
});

//O método mais popular e correto se chama Fisher Yates Method, que é um é um algoritmo eficiente para embaralhar (permutar aleatoriamente)
// os elementos de uma lista ou array, garantindo que todas as permutações possíveis sejam igualmente prováveis
//Método Fisher Yates
bt5.addEventListener("click", function() {
    for (let i = pontos.length - 1; i > 0; i--) {
        let j = Math.floor(Math.random() * (i + 1));
        let k = pontos[i];
        pontos[i] = pontos[j];
        pontos[j] = k;
    }
    document.getElementById("array3").innerHTML = pontos;
});

//Encontrar o menor e maior valor de um array
//Existem 3 meios:
//- Ordenar o array e pegar o primeiro ou último item .
//- Usar Math.min() ou Math.max()
//- Usar uma função própria

const nums = new Array(1, 99, -10, 22, -50, -1, 0, 7, 56);
console.log("\nMenor para Maior valor");
nums.sort(function(a, b){ return a - b; }); //Ordenar de forma crescente
console.log(nums[0]); //Valor Mínimo
console.log(nums[nums.length - 1]); //Valor Máximo
console.log("\nMaior para Menor valor");
nums.sort(function(a, b){ return b - a; }); //Ordenar de forma decrescente
console.log(nums[0]); //Valor Mínimo
console.log(nums[nums.length - 1]); //Valor Máximo

//Usando min() / max()
function arrayMin(arr) {
    return Math.min.apply(null, arr);
}

function arrayMax(arr) {
    return Math.max.apply(null, arr);
}

const numbs = new Array(11, 9, -150, 232, -5, 7, 0, 10, 356);
console.log("\nUsando Math.min.apply() / Math.max.apply()");
console.log(arrayMin(numbs));
console.log(arrayMax(numbs));

//Math.min.apply(null, [1, 2, 3]) é equivalente à Math.min(1, 2, 3).

//Função própria
function arrayMinimo(arr) {
    let tam = arr.length;
    let min = Infinity;
    while(tam--){
        if(arr[tam] < min) {
            min = arr[tam];
        }
    }
    return min;
}

function arrayMaximo(arr) {
    let tam = arr.length;
    let max = -Infinity;
    while(tam--){
        if(arr[tam] > max) {
            max = arr[tam];
        }
    }
    return max;
}

console.log("\nUsando função própria")
console.log(arrayMinimo(numbs));
console.log(arrayMaximo(numbs));

//Ordenando Arrays de Objetos
const carros2 = [
  {tipo:"Volvo", ano:2009},
  {tipo:"Toyota", ano:2021},
  {tipo:"BMW", ano:2015},
  {tipo:"Audi", ano:2017},
  {tipo:"Fusca", ano:1991}
];

carros2.sort(function(a, b){ return a.ano - b.ano; });
console.log(carros2);

//Para comparar string, use

const carros3 = [
  {tipo:"Volvo", ano:2009},
  {tipo:"Toyota", ano:2021},
  {tipo:"BMW", ano:2015},
  {tipo:"Audi", ano:2017},
  {tipo:"Fusca", ano:1991}
];

carros3.sort(function(a, b){
    let x = a.tipo.toLowerCase();
    let y = b.tipo.toLowerCase();
    if (x < y) {return -1;}
    if (x > y) {return 1;}
    return 0;
});

console.log(carros3);

//Array Iration
//forEach()
const sorte = [45, 4, 9, 16, 25, 89, 35, 66];
let resultado = `<h4>Array: ${sorte}</h4>`;
resultado += "<ul>";

sorte.forEach(numSorte);

function numSorte(valor, index, array) {
    resultado += `<li>index: ${index}, valor: ${valor}</li>`;
}
resultado += "</ul>";

console.log(resultado);
document.getElementById("for-each").innerHTML = resultado;

//map(), retorna true | false para cada item se tiver uma condicional no return
//exemplo: return > 5, resultaria em [false, false, false, false, true, true, true, true, false, true, false]
const sorte2 = [5, 1, 3, 2, 6, 8, 9, 10, 4, 7, 0];
let resultado2 = `<h4>Array: ${sorte2}</h4>`;
resultado2 += "<ul>";

sorte2.map(numSorte2);

function numSorte2(valor, index, array) {
    resultado2 += `<li>index: ${index}, valor: ${valor}</li>`;
}
resultado2 += "</ul>";

console.log(resultado2);
document.getElementById("map").innerHTML = resultado2;

//Dobrar os valores
const sorte3 = sorte2.map(dobrarValores);

function dobrarValores(value) {
    return value * 2;
}

console.log(sorte3);

//Usando flatMap() o método primeiro mapeia todos os elementos de uma matriz e depois cria uma nova matriz
const meuArr = [1, 2, 3, 4, 5, 6];
const novoArr = meuArr.flatMap((x) => x * 2);

console.log(meuArr);
console.log(novoArr);

//filter() é um método que cria um novo array com elementos que passem em um "teste"
const meuArr2 = [45, 4, 9, 16, 25];
const maior18 = meuArr2.filter(maiores18);

function maiores18(value, index, array) {
  return value > 18;
}

console.log(maior18);

//reduce(), essa função recebe 4 ragumentos (total, value, index e o array passado) varre da esquerda para à direita
const meuArr3 = [45, 4, 9, 16, 25];
let soma = meuArr3.reduce(acumulador);

function acumulador(total, value, index, array) {
  return total + value;
}

console.log(`Todos os valores somados: ${soma}`);

//reduceRight(), essa função não irá reduzir a matriz original, varre da direita para esquerda
const meuArr4 = [11, 2, 19, 21, 54];
let soma2 = meuArr4.reduceRight(acumulador2);

function acumulador2(total, value, index, array) {
  return total + value;
}

console.log(`Todos os valores somados: ${soma2}`);

//every(), checa se todos os valores passa no teste determinado
//retorna um booleano: true ou false
const meuArr5 = [45, 4, 9, 16, 25];
let testar = meuArr5.every(testaTodos);

function testaTodos(value, index, array) {
    return value > 18;
}

console.log(testar);

//some(), checa se pelo menos um passa no teste determinado
//retorna um booleano: true ou false
let testar2 = meuArr5.some(testaTodos);
console.log(testar2);

//from() transforma cada caractere de uma string, inclusive os espaços, em uma posição do array
let br = "Ordem e Progresso";
console.log(Array.from(br));

//keys() retorna as chaves de um array
const frutas = ["Banana", "Laranja", "Morango", "Manga"];
const chaves = frutas.keys();

for (let chave of chaves) {
    console.log(chave);
}

//entries() retorna os indexes e  valores de um array
const chaves2 = frutas.entries();

for (let ch of chaves2) {
    console.log(ch);
}

//with() é um jeito de atualizar elementos de um array sem alterar o array original, cria uma cópia
const months = ["Jan", "Fev", "Mar", "Abr", "Mai"];
const m = months.with(1, "Fevereiro");

//Array Spread (...), permite "espalhar" elementos de um iterável (como arrays, strings e objetos)
//em locais onde múltiplos elementos ou propriedades são esperados, sendo ótimo para copiar, mesclar e expandir dados de forma concisa e legíve
const arr1 = [1, 2, 3, -10];
const arr2 = [4, 55, 6, 7];
const arr3 = [...arr1, ...arr2];

console.log(arr3);
console.log(Math.min(...arr3));
console.log(Math.max(...arr3));

//Array Rest (...), nos permite destruir um array e coletar as sobras
let a, b, resto;
const arr4 = [1,2,3,4,5,6,7,8];

[a, b, ...resto] = arr4;
console.log(`elemento A: ${a} elemento B: ${b}`);
console.log(`O resto do array é: ${resto}`);

//.copyWithin(), copia uma sequência de elementos de um array para outra posição dentro do mesmo array
//não altera o tamanho do array, sobreescreve os valores existentes
const frutas2 = ['tangerina', 'banana', 'laranja', 'uva', 'manga'];

// Copia 'banana', 'laranja', 'uva' (do índice 1 ao 4) para começar no índice 0
frutas2.copyWithin(0, 1, 4); // seria como >= 1 e < 4
console.log(frutas2);

//Encontra os elementos em um array com valor estático
frutas2.fill("Amora");
console.log(frutas2);

//of() cria um array de qualquer número de argumentos
let doces = Array.of("Beijinho", "Brigadeiro", "Cajuzinho", "Quindim");

//prototype() cria um método próprio dentro da classe Array
Array.prototype.caixaAlta = function() {
    for (let i = 0; i < this.length; i++) {
        this[i] = this[i].toUpperCase();
    }
}

console.log(doces);
doces.caixaAlta();
console.log(doces);

//valueOf(), retorna o valor primitivo de um array
console.log(doces.valueOf());

//A importância da palavra reservada const
//Os valores não podem ser reatribuídos com novos valores
const constante = [1, 2, 3, 4, 5];
//constante = [6, 7, 8, 9, 10]; Causará um erro

//Vale ressaltar que elementos podem ser reatribuídos
constante[0] = 100;

//Pode adicionar mais itens
constante.push(25);

//Uma const não pode ser declarada sem nenhuma atribuição inicial, pois posteriormente não teria como adicionar novos elementos
//const constante2; Já causa erro