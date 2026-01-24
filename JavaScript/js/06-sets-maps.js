// Como criar um novo Set
// Através do comando new Set() e passndo os valores através de add()

const letras = new Set(['a', 'b', 'c']);
const vazio = new Set();

//.add()
letras.add('d');

//Passando valores iguais não irá gerr erro, mas apenas um valor será gravado
letras.add('e');
letras.add('e');
letras.add('e');

//Pode passar valores através de variáveis
let f = 'f';
letras.add(f);

console.log(letras);

let texto = "";
//Listando os elementos com for
for (const l of letras){
    texto += l;
}

console.log(texto);
console.log(typeof letras);

/**
 * O operador instanceof do JavaScript testa se um objeto tem a propriedade de protótipo 
 * de um determinado construtor em toda a sua cadeia de protótipos. 
 * Ele retorna um valor booleano (verdadeiro ou falso).
*/
console.log(letras instanceof Set);

//Métodos do Set
//.size
console.log(letras.size);

//has()
let procurar1 = "E";
let procurar2 = "m";
let resposta1 = letras.has(procurar1.toLowerCase());
let resposta2 = letras.has(procurar2.toLowerCase());
console.log(`Dentro do Set tem a letra: ${procurar1}? ${resposta1 ? "Sim" : "Não" }`);
console.log(`Dentro do Set tem a letra: ${procurar2}? ${resposta2 ? "Sim" : "Não" }`);

//forEach
let texto2 = "";
letras.forEach(function(valor){
    texto2 += valor;
});

console.log(texto2);

//values() com for/of

//Ex 1
let texto3 = "";
const iterador = letras.values();
for (const l of iterador) {
    texto3 += l;
}

//Ex 2
let texto4 = "";
for (const l of letras.values()) {
    texto4 += l;
}

//keys() retorna o mesmo que os values()
const numeros = new Set([1, 7, 3, 9, 6, 2, 5]);
//Criar um iterador
const iterador2 = numeros.keys();

//Lista de todos os elementos
let texto5 = "";
for (const i of iterador2) {
    texto5 += i + " ";
}

for (const i of numeros.keys()) {
    texto5 += i + " ";
}

console.log(texto5);

//Método entries()
const entradas = numeros.entries();
console.log(entradas);

//Método union(), retorna a união de dois Sets
const salgados = new Set(["Coxinha", "Empada", "Pastel"]);
const bebidas = new Set(["Refrigerante", "Suco", "Caldo de Cana"]);

//union() une todos elementos
const uniao = salgados.union(bebidas);
console.log(uniao);

//intersection() apenas elementos que estão em ambos sets
const sorteio1 = new Set([1, 2, 21, 55, 77, 100]);
const sorteio2 = new Set([1, 3, 7, 15, 55, 99]);
const intersecao = sorteio1.intersection(sorteio2);
console.log(intersecao);

//difference() elemento que está apenas no primeiro set mas não no segundo
const diferenca = sorteio1.difference(sorteio2);
console.log(diferenca);

//symmetricDifference() elementos que não fazem parte da interção
const diferencaSimetrica = sorteio1.symmetricDifference(sorteio2);
console.log(diferencaSimetrica);

//isSubsetOf() retorna se um conjunto de elementos está contido dentro (filho) de outro conjunto de elementos (pai)
//Logo, o retorno é um boolean
const sorteio3 = new Set([1, 7]);
let subset = sorteio3.isSubsetOf(sorteio2);
console.log(subset);

//isSupersetOf() retorna se um conjunto de elementos é um superset (pai) de outro conjunto de elementos (filho)
const superset = sorteio2.isSupersetOf(sorteio3);
console.log(superset);

//isDisjointFrom() retorna booleano se todos os elementos são diferentes ou não
let disjuncao = sorteio1.isDisjointFrom(sorteio2);
console.log(disjuncao);