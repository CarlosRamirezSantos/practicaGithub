fun main() {
    println("Vamos a averiguar el area y el perímetro de un cuadrado")
    var lado=pedirDatos()
    area(lado)
    perimetro(lado)
}
fun pedirDatos():Int{
    var dato =  0
    println("Dame el lado del cuadrado ")
    dato= readln().toInt()
    return dato
}
fun area(l:Int){
    println("el area es ${l*l}")

}
fun perimetro(l:Int){
    println("el perimetro es ${l*4}")

}