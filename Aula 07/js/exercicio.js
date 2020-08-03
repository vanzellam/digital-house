//1 - número par ou ímpar
/*
function funcNum(num) {
    if (num == 0) {
        console.log('O número', num, 'é zero!');
    } else if (num % 2 == 0) {
        console.log('O número', num, 'é par');
    } else {
        console.log('O número', num, 'é ímpar');
    }
}
funcNum(10);
*/

//2 - arrow function números primos
/*
var funcArrow = (num) => {
    let count = 0;
    for (let i = 2; i < num; i++) {
        if (num % i == 0) {
            count++;
        } else {
            continue;
        }

    }
    if (num != 1 && (count == 0)) {
        console.log(num, 'é primo');
    } else {
        console.log(num, 'não é primo');
    }
}
funcArrow(0);
*/

// 3 - imprime de 10 até 1 e depois “feliz ano novo” callback
/*
function anoNovo(){
    
    console.log('Feliz ano novo!');
}

function counter(callback){
    for (let i=10;i>0; i--){
        console.log(i);
    }
    callback();
}

counter(anoNovo);
*/

// 4 - promise + concatenação de then





//5 - método async/await



//6 - notas > 7
/*
var arr = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0]
var over7 = arr.filter(func);

function func(value){
    return value > 7;
}

console.log(over7);
*/

//7 - produtos de supermercado e preço - soma
/*
let somaTotal = 0;
var produtosSuper = {arroz: 3.25, feijao: 5.49, banana: 1.5, carne: 25.9};
var preco = Object.values(produtosSuper);
preco.forEach(soma);

function soma(v){
    somaTotal += v;
}

console.log(somaTotal);
*/


//8 - alunos 8 e 9 ano
/*
var alunos = [['João', 8], ['José', 9], ['Pedro', 9], ['Paulo', 8], ['Luiz', 9]];

function aulaQuarta(aluno){
    for(let i = 0; i < aluno.length; i++){
        if (aluno[i][1] == 8) {
            aluno[i].push('História');
        }
        else if (aluno[i][1] == 9) {
            aluno[i].push('Física');
        }  
    }
    return aluno;
}

console.log(aulaQuarta(alunos));
*/