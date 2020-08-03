/*function dizerTchau(nome){
    console.log("bye bye", nome);
}

dizerTchau('John');

function funcNum(num){ 
    if(num == 0){
        console.log('O número', num, 'é zero!');
    } else if (num % 2 == 0){
        console.log('O número', num, 'é par');
    } else {
        console.log('O número', num, 'é ímpar');
    }
}


funcNum(15);


function parImpar(){
    for(let i=1;i<=15;i++){
        funcNum(i);
    }
}

parImpar();*/


// função anônima
/*
var dizerOla = function(nome){
    return 'Olá ' + nome;
}

console.log(dizerOla('Mary'));
*/

//callback: executa a função somente quando
// a outra terminar
/*
function a(callback){
    setTimeout( function(){
        console.log('a vem primeiro');
        callback();
    }, 3000 );

}
    
function b(){
    console.log('b vem depopis');
}

a(b);
*/

// promise & reject




// call & apply
/*function dizerOi(nome){
    console.log(nome);
}

dizerOi.call({}, "Paul");

dizerOi.apply({}, ['George']);
*/

/*
//declaração de objetos
var obj ={
    nome: 'Jon',
    sobrenome: 'Snow',
    idade: 16,
    apresentar: apresentacao
};

function apresentacao(){
    console.log('Olá, eu sou ' + this.nome + ' '+ this.sobrenome +'.');
}

console.log(obj.sobrenome);

obj.apresentar();
*/
/*
//prototype
String.prototype.apagar = function(){
    return '';
}

console.log('oi'.apagar());
*/

//função arrow
/*
var funcArrow = (num) =>{
    let count = 0;
    for(let i=2;i<num;i++){
        if(num%i==0){
            count++;
        } else{
            continue;
        }

    }
    if(num != 1 && (count==0)){
        console.log(num, 'é primo');
    } else{
        console.log(num, 'não é primo');
    }
}
funcArrow(0);
*/
/*
var d = new Date('2020-07-31');
console.log(d);
*/

//String
var s = 'The winter is coming.'

//console.log(s.length);
//console.log(s.indexOf('coming'));
//console.log(s.lastIndexOf('coming'));
//console.log(s.slice(4,10));
//console.log(s.substr(4,6));
//console.log(s.split(','));

//array
var array = 'Ned Jon Robb Bran Rickon'.split('');
//console.log(array.toString());
//console.log(array.join(':'));
//array.push('Sansa');
// array.unshift('Arya') -> coloca no início
//array.pop(); -> retira o último elemento e retorna o valor
//array.shift(); -> retira do início
