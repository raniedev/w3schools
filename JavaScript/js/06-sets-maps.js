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

//WeakSet é uma coleção de valores onde esses valores devem ser objetos
//Um WeakSet mantém referências fracas dos seus valores
let meuSet = new WeakSet();

//Criar um objeto
let obj1 = { nome: "Ana", sobrenome: "Maria" };
let obj2 = { nome: "Carlos", sobrenome: "Jorge" };
let obj3 = { nome: "Rui", sobrenome: "Henrique" };

//Adicionar objetos
meuSet.add(obj1);
meuSet.add(obj2);
meuSet.add(obj3);

//Verificar se há um objeto dentro do WeakSet
let resposta3 = meuSet.has(obj1);
console.log(resposta3);

//Apagar objeto do WeakSet
meuSet.delete(obj2);
console.log(meuSet);

/** 
 * Gargabe Collection
 * porque mantém referências fracas para os objetos que armazena, permitindo que o coletor de lixo (garbage collector) 
 * do JavaScript remova automaticamente o objeto da memória se não houver outras referências fortes a ele. 
 * Diferente de um Set comum, ele não impede a liberação de memória.
 * 
 * Um WeakSet é similar ao Set, mas grava apenas objetos e os mantém como referência fraca. 
 * Se não há outras referências para o objeto, o lixo é coletado automaticamente.
 * 
 * Muito útil para trackear visitantes, como abaixo:
 */

const pessoas = new WeakSet();

// Criar Objetos (Visitantes)
const Aline = {nome:"Aline", idade:40};
const Paulo = {nome:"Paulo", idade:41};
const Camila = {nome:"Camilla", idade:42};
const Jorge = {nome:"Jorge", idade:43};

let retorno = "";
// Trackear visitantes
track(Paulo);
track(Camila);
track(Paulo);

console.log(retorno);
// Função para checar visitantes
function track(visitante) {
    if (pessoas.has(visitante)) {
        retorno += visitante.nome + " está visitando novamente.\n";
    } else {
        pessoas.add(visitante);
        retorno += visitante.nome + ", que tem " + visitante.idade +" anos, está visitando pela primeira vez.\n";
    }
}
// Note que: Para fazer contagem de visitantes utilize WeakMap


const persons = new WeakSet();
let Joao = { name: "Joao" };
persons.add(Joao);

// Remove a Referência
Joao = null; //Automatic Cleanup
console.log(persons);

// WeakSet é não iterável, não são enumeráveis
// Também não há propriedade de tamanho (size, length)
// Apenas tem add(), delete() e has()


// O objeto Map
// É um objeto que armazena coleções de pares chave-valor, similar a um dicionário (comum em outras linguagens de programação)
// Características do Map
// - Tipos de chaves: string, numbers, object, etc
// - Ordem de inserção: o Map irá lembrar da inserção original das chaves
// - Tamanho: É possível obter o size de um Map
// - Performance: Maps são otimizados para frequentes adições ou remoções de pares de chave-valor.
// - Iteração: Maps são iteráveis, permite o uso de for...of loops e métodos como forEach()
// - Ordem de Iteração: A ordem original é preservada durante a iteração

//Criando um Map
const frutas = new Map();
//Adicionando com .set()
frutas.set("Pêssego", 100);
frutas.set("Laranja", 150);
frutas.set("Limão", 200);
frutas.set("Tangerina", 300);

//Passando um array para um Map
const jogos = new Map([
    ["GTA San Andreas", "PlayStation 2"],
    ["Resident Evil 2", "PlayStation 1"],
    ["Sonic the Hedgehog", "Mega Drive"],
    ["Super Mario World", "Super Nintendo"]
]);

console.log(frutas);
console.log(jogos);

//Método Get
console.log(frutas.get("Tangerina"));

console.log(frutas instanceof Map);

/**
 * JavaScript Objects vs Maps
 * Diferença entre Objetos JavaScript e Mapas:
 * [Object]	                                [Map]
 * Não é diretamente iterável               Diretamente iterável
 * Não tem a propriedade size     	        Tem a propriedade size
 * Chaves devem ser strings (ou símbolos)   Chaves podem ser qualquer tipo de dado
 * Chaves não são bem ordenados	            Chaves são ordenadas pela inserção
 * Tem chave padrão                         Não tem chave padrão
 */

//.delete() irá apagar um item específico
console.log(frutas);
frutas.delete("Tangerina");
console.log(frutas);

//.clear() irá remover todos os elementos de um Map
jogos.clear();

//Assim como Set, o Map também tem o método .has()
frutas.has("Caju");

//forEach()
const cores = new Map();
cores.set("Blue", "Azul");
cores.set("Red", "Vermelho");
cores.set("Green", "Verde");
cores.set("Yellow", "Amarelo");
cores.set("Orange", "Laranja");
cores.set("Pink", "Rosa");

cores.forEach(function(valor, chave){
    console.log(`English: ${chave} = Português: ${valor}`);
});

//entries(), mostra as chaves e valores
for (const x of cores.entries()) {
    console.log(x);
}

//keys(), mostra apenas as chaves
for (const y of cores.keys()) {
    console.log(y);
}

//keys(), mostra apenas as chaves
for (const z of cores.values()) {
    console.log(z);
}

//Map.groupBy() método agrupa elementos de um objeto
//o Map.grouBy() não muda o array original
const doces = [
  {nome:"Bala", quantidade: 300},
  {nome:"Jujuba", quantidade: 500},
  {nome:"Bombom", quantidade: 200},
  {nome:"Ciclete", quantidade: 150}
];

// Função para agrupar elementos
function myCallback({ quantidade }) {
  return quantidade > 200 ? "Nível Normal" : "Nível Baixo";
}

// Agrupar por quantidade
const resultado = Map.groupBy(doces, myCallback);

console.log(resultado);

//The WeakMap Object 
//É uma coleção de pares chave/valor onde as chaves devem ser objetos
//Um WeakMap tem referência fraca para suas chaves

// Criar um WeakMap
let wm = new WeakMap();

// Criar um Objeto
let meuObj = {nome:"Ana", sobrenome:"Silva"};

// Por um valor em WeakMap com .set()
wm.set(meuObj, "Secretária");

// Get o valor WeakMap
let tipo = wm.get(meuObj);

console.log(wm);
console.log(meuObj);
console.log(tipo);

//Garbage Collection
// Eficiente uso dos recursos de memória
// Reinvindicação de memória ocupada por valores que não estão mais em uso
// Prevenção de memory leak (vazamento de memória)
// Ocorre quando o aplicativo mantém referências a objetos que não são mais necessários, impedindo o GC de liberar essa memória.

//Weak Reference
// Ao contrário de um mapa normal, um WeakMap não impede que suas chaves sejam coletadas como lixo.
// Se uma chave (um objeto) não tiver referências a ela em um programa, ela se tornará elegível para coleta de lixo.
// Quando a chave é coletada como lixo, seu par chave-valor é removido do WeakMap.

//Chaves devem ser Objetos
// As chaves devem ser objetos ou símbolos não registrados
// Esta restrição está vinculada ao mecanismo de coleta de lixo;
// Primitivos não são lixo coletado da mesma forma que objetos

//Trackeando Objetos (Visitantes)
let text = "";

// Create a WeakMap to store visit counts
const visitsCount = new WeakMap();

// Create Visitor Objects
const John = {name:"John", age:40};
const Paul = {name:"Paul", age:41};
const Ringo = {name:"Ringo", age:42};
const George = {name:"George", age:43};

// Track visits
track(Paul);
track(Ringo);
track(Paul);
track(Paul);
track(John);

// Function to track visitors
function track(visitor) {
    let count = visitsCount.get(visitor) || 0;
    count++;
    visitsCount.set(visitor, count);
    text += visitor.name + ", age " + visitor.age + ", has visited " + count + " time(s).<br>";
}

//Se você remover todas as referências para um objeto
John = null;

//Não iterável, WeakMaps não são enumeráveis
//Você não pode iterar através das chaves e valores com "for" loops, forEach(), ou keys()
//Você não pode acessar o tamanho (size)

//Métodos Limitados
//new WeakMap(), get(), set(), delete(), has()

// Criar WeakMap
const myMap = new WeakMap();

// Private Fields Simulation
class User {
  constructor(name) {
  myMap.set(this, {secret:"hidden data"});
  this.name = name;
 }
 getSecret() {
  return myMap.get(this).secret;
  }
}

const user1 = new User("John");
secret = user1.getSecret();

//Privacidade
//O WeakMap foi projetado intencionalmente para privacidade: você pode definir, obter,
// ter e excluir usando uma chave de objeto, mas não inspecionar o que está dentro.
// Esta foi uma ótima ferramenta para simular propriedades privadas em classes JavaScript 
// (antes que campos #private fossem adicionados à linguagem).