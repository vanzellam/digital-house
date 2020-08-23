function iniciaJogo(){
    
    var url = window.location.search;
    
    var nivel_jogo = url.replace("?","");
    
    var tempo_segundos = 0;
    
    if(nivel_jogo == 1){
        tempo_segundos = 120;
    }

    if (nivel_jogo == 2) {
        tempo_segundos = 60;
    }

    if (nivel_jogo == 3) {
        tempo_segundos = 30;
    }

    document.getElementById('cronometro').innerHTML = tempo_segundos;

    var qtde_baloes = 20;

    document.getElementById('baloes_inteiros').innerHTML = qtde_baloes;
    document.getElementById('baloes_estourados').innerHTML = 0;

    cria_baloes(qtde_baloes);

    contagem_tempo(tempo_segundos + 1);

}


function cria_baloes(qtde_baloes){
    
    for(var i = 1; i <= qtde_baloes; i++){
        
        var balao = document.createElement("img");
        balao.src = "imagens/balao_azul_pequeno.png";
        balao.style.margin = '10px';
        balao.id = 'b' + i;
        balao.onclick = function(){
            estourar(this);
        }

        document.getElementById('cenario').appendChild(balao);
    }
}

function contagem_tempo(segundos){

    segundos = segundos - 1;

    if(segundos == - 1){
        clearTimeout(timerId);
        game_over();
        return false;
    }
 
    document.getElementById('cronometro').innerHTML = segundos;

    timerId = setTimeout("contagem_tempo("+segundos+")", 1000);

}

function game_over(){
    remove_clicks();
    alert("Fim de jogo. Você não conseguiu estourar todos os balões.")
}

function estourar(img){

    var id_balao = img.id;
    document.getElementById(id_balao).setAttribute("onclick","");
    document.getElementById(id_balao).src = "imagens/balao_azul_pequeno_estourado.png";
    pontuacao(1);

}

function pontuacao(acao){
    var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;
    var baloes_estourados = document.getElementById('baloes_estourados').innerHTML;

    baloes_inteiros = parseInt(baloes_inteiros);
    baloes_estourados = parseInt(baloes_estourados);
    
    baloes_inteiros--;
    baloes_estourados++;

    document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;
    document.getElementById('baloes_estourados').innerHTML = baloes_estourados;

    situacao_jogo(baloes_inteiros);
}

function situacao_jogo(baloes){
    if(baloes == 0){
        alert('Parabéns! Você conseguiu estourar todos os balões a tempo.');
        pararJogo();
        
    }

}

function pararJogo(){
    clearTimeout(timerId);
}

function remove_clicks(){
    var i = 1;
    while(document.getElementById('b'+ i)){
        document.getElementById('b' + i).onclick = '';
        i++;
    }
}