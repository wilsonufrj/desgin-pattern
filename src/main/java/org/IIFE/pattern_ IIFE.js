//Sem o padrão de Projeto
function soma(a,b){
    console.log(a+b)
}

soma(10,20)

//Com o padrão de Projeto

((a,b)=>{
    console.log(a+b)
})(10,20)

