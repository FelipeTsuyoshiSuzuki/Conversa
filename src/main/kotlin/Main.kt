import java.util.Scanner

fun main() {

    println("Anderson - Bom dia de boas")
    println("João - Tranquilo e tu?")
    println("Anderson - to suave, eae fico sabendo da boa?")
    println("João - Fiquei não, qual é a fita")
    println("Anderson - Abriu uma lojinha na esquina com um pastel divino \n e vc n sabe qual é a melhor parte")
    println("Henrique - E qual é a melhor parte fala ai")
    println("Anderson - O pastel ta so 2,50 desse jeito vai fali, mas até la vou aproveita")
    println("João - ta maluco 2,50, se ta mentindo, se acha que engana, só acredito vendo")
    println("Anderson - Então vai la po, se acha que eu ia menti, não tenho nem pq menti")
    println("Anderson - Venho aq te conta a boa e ainda sou tachado de mentiroso ve se pode isso")
    println("João - Foi mal, mas é que isso é absurdo, o pastel da feira de quinta a mais barata ta 4 pila")
    println("João - Ai vc chega e me fala que abriu uma loja com pastel a 2,50 é logico que vo desconfia")
    println("João - Bora la se for verdade te pago um pastel, mas se for mentira se ta lascado")
    println("Anderson - Demoro")
    println("João - Fecho então")

    //Exercicio 3 da lista de exercicios
    /*var numeros = arrayOf(0,0,0,0)
    var quadrados = arrayOf(0,0,0,0)
    for(i in 0..3) {
        println("Digite um número: ")
        var reader = Scanner(System.`in`)
        numeros[i] = reader.nextInt()
        quadrados[i] = numeros[i] * numeros[i]
    }
    if(quadrados[2] >= 1000) {
        println("O quadrado de " + numeros[2] + " é " + quadrados[2])
    }else {
        for(i in 0..3) {
            println("O quadrado de " + numeros[i] + " é " + quadrados[i])
        }
    }*/

    //6 da lista de exercicios
    /*println("Escreva a idade do aluno: ")
    val reader = Scanner(System.`in`)
    val idade:Int = reader.nextInt()
    casos(idade)*/

    //exercicio 1 Enquanto
    /*var n:Int = 0
    println("Coloque um número negativo para finalizar o programa")
    while(n >= 0) {
        println("Insira um Número: ")
        var reader = Scanner(System.`in`)
        n = reader.nextInt()
    }*/

    // Calcular Porcentagem
    /*println("Qual é o numero total: ")
    val rTotal = Scanner(System.`in`)
    val total:Float = rTotal.nextFloat()
    println("Qual é a porcentagem: ")
    val rPorcentagem = Scanner(System.`in`)
    val porcentagem = rPorcentagem.nextFloat()
    percentual(porcentagem, total)*/

}

//Calcular Porcentagem
/*fun percentual(porcentagem:Float, total:Float) {
    val result:Float
    result = (porcentagem * total) / 100
    return println("$porcentagem% de $total é $result")
}*/

//6 da lista de exercicios
/*fun casos(idade:Int) {
    if(idade >= 5 && idade <= 7) {
        println("Infantil A")
    }else if(idade >= 8 && idade <= 11) {
        println("Infantil B")
    }else if(idade >= 12 && idade <= 13) {
        println("Juvenil A")
    }else if(idade >= 14 && idade <= 17) {
        println("Juvenil B")
    }else if(idade >= 18) {
        println("Adulto")
    }else {
        println("O aluno é muito novo para fazer a aula")
    }
}*/
