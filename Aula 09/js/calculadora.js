function calcular(){

    var operacao = document.getElementById('operacao').value;

    var num1 = document.getElementById('num1').value;

    var num2 = document.getElementById('num2').value;

    if(num1 == '' || num1 == null){
        alert('Favor digitar um número válido para a operação!')
        return false;
    }

    if (num1 == '' || num1 == null){
        alert('Favor digitar um número válido para a operação!')
        return false;
    }

    var resultado = null;

    // forçar tipo de variável
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    switch(operacao){
        case '1':
            resultado = num1 - num2;
            break;
        
        case '2':
            resultado = num1 + num2;
            break;

        case '3':
            resultado = num1 * num2;
            break;

        case '4':
            resultado = num1 / num2;
            break;


        default:
            alert('A opção selecionada é inválida');
            return false;
    }

    document.getElementById('resultado').value = resultado;

}