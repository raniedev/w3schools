// Destructuring a object
// Create an Object
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50
};
let {lastName, firstName} = person;
console.log(firstName, lastName);

// Destructuring a string
let name = "W3Schools";
let [a1, a2, a3, a4, a5] = name; //deprecated
console.log(a1);
console.log(a2);
console.log(a3);

// Destructuring an array
const fruits = ["Bananas", "Oranges", "Apples", "Mangos"];
let [fruit1, fruit2] = fruits;
console.log(fruit1);

// Destructuring an array (start, end)
let [fruitA,,,fruitB] = fruits;

// Destructuring an array, using index
const {[0]:fruit_1 ,[1]:fruit_2} = fruits;

// Destructuring
const numbers = [10, 20, 30, 40, 50, 60, 70];
const [a,b, ...rest] = numbers;
console.log(a); //específico é String
console.log(b);
console.log(rest); //rest vira um array com todos os valores restantes

// Destructuring Map
const fruitsMap = new Map([
    ["apples", 500],
    ["bananas", 300],
    ["oranges", 200]
]);

let text = "";
for (const [key, value] of fruitsMap) {
    text += key + " is " + value;
}

// Swapping (troca) de variáveis
let fName = "John";
let lName = "Doe";

// Destructuring
[fName, lName] = [lName, fName];


// Data Types - Existem 8 tipos de dados, 7 são primitivos e 1 objeto

// Number
let idade = 25;

// BigInt
let x = 1234567890123456789012345n;
let y = BigInt(1234567890123456789012345);

// String
let color = "Yellow";

// Boolean
let open = true;

// Undefined
let semAtribuicao;
let lema = "";

// Null
let nulo = null;

// Symbol
const z = Symbol();

// Object
const pessoa = {firstName:"John", lastName:"Doe"};

// Array Object
const carros = ["Saab", "Volvo", "BMW"];

// Date Object
const data = new Date("2022-03-25");

// Built-in Object types
// Object, Array, Map, Set, WeakMap, WeakSet, Math, Date, RegExp, Error, JSON
// Promise, Int8Array, Int16Array, Int32Array, Float16Array, Float32Array, Float64Array, BigInt64Array

// Operador typeof, irá verificar qual é o tipo do dado
console.log(typeof x);

// Operador instanceof, confirma ou não se um objeto é uma instância de um tipo de objeto
const time = new Date();
console.log((time instanceof Date));

const frutas = ["Banana", "Melancia", "Tangerina"];
console.log(Array.isArray(frutas)); // Verifica se é um array
console.log((frutas instanceof Array));

//Diferença entre Null e Undefined
typeof undefined      // undefined
typeof null           // object

null === undefined    // false
null == undefined     // true

// Construtor
// Returns function Object() {[native code]}:
let objeto = {name:'John', age: 34}.constructor

// Returns function Array() {[native code]}:
let arr = [1,2,3,4].constructor;

// Returns function Date() {[native code]}:
new Date().constructor;

// Returns function Set() {[native code]}:
new Set().constructor;

// Returns function Map() {[native code]}:
new Map().constructor;

// toString(), converte uma variável ou valor para string
const flores = ["Margarida", "Rosa", "Tulipa", "Copo de Leite"];
let minhasFlores = flores.toString();
console.log(minhasFlores);
console.log(person.toString());

// Conversões
// String para Number
console.log("Conversões de Dados");
console.log(Number("3.14"));

//String para integer
console.log(parseInt("15"));

//String para integer
console.log(parseFloat("100"));

//unário + operador
let i = "5";      // i is a string
let j = + i;      // j is a number

//Number para String
console.log(String(1000));
let num = 212.13456;

//toExponential()
console.log(num.toExponential());

//toFixed()
console.log((123.456).toFixed(1));

const num2 = 123.45689;
console.log(num2.toPrecision(3));
console.log(num2.toPrecision(5));

//Date para Number
let d = new Date();
console.log(Number(d));
console.log(d.getTime());

//Date para String
console.log(Date().toString());

const dataHoje = new Date();
console.log(dataHoje.getDate());
console.log(dataHoje.getDay());
console.log(dataHoje.getFullYear());
console.log(dataHoje.getHours());
console.log(dataHoje.getMilliseconds());
console.log(dataHoje.getMinutes());
console.log(dataHoje.getMonth());
console.log(dataHoje.getSeconds());
console.log(dataHoje.getTime());

//Boolean para Number
console.log(Number(false));
console.log(Number(true));

//Boolean para String
console.log(String(false));
console.log(String(true));

//Conversão automática
5 + null    // returns 5         because null is converted to 0
"5" + null  // returns "5null"   because null is converted to "null"
"5" + 2     // returns "52"      because 2 is converted to "2"
"5" - 2     // returns 3         because "5" is converted to 5
"5" * "2"   // returns 10        because "5" and "2" are converted to 5 and 2