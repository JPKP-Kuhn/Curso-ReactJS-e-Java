var num = 1 //variável de escopo global
var string = "Hello World"
var bool = true
const idade = 17 //imutável, só leitura
let name = "João" //escopo limitado


//Prompt
//var n1 = prompt("Digite um número entre 1 e 3 ou outros: ") prompt para navegador
var n1 = Math.random(1, 5)
console.log(n1) //string
console.log(Number(n1)) // print como número, ou pode já ser Number(prompt())

if(bool == true){
    console.log('Verdadeiro')
}
if(n1 == 1){
    console.log('Número 1')
} else if(n1 == 2){
    console.log('Número 2')
} else if(n1 == 3){
    console.log('3')
} else{
    console.log('Outro número')
}
switch (new Date().getDay()) {
    case 4:
    case 5:
    text = "Logo logo é fim de semana!";
    break;
    case 0:
    case 6:
    text = "É fim de semana!";
    break;
    default:
    text = "Esperando pelo fim de semana";
}

for(let i = 0; i < 10; i++){
    console.log(i)
}


var myFunction = function(x, y){
    return x + y
}
console.log(myFunction(20, 30))


var Pessoa = new Object();
Pessoa.nome = "João";
Pessoa.idade = 23;
Pessoa.sexo = "masculino";
Pessoa.getDados = getDados;

function getDados(){
    return "Nome:" + this.nome +
"; Idade: " + this.idade +
" ; Sexo: " + this.sexo;
}