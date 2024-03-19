//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name = "Gladwell"
    var age = 23
    var city = "Nairobi"
    println("Hello my name is $name I am $age years old from $city")
    val numbers = intArrayOf(11,12,13,14,15,16,17,18,19,20)
    evenNumbers(numbers)
    val num1 = -7
    val num2 = 7
    println("$num1 is negative: ${negative(num1)}")
    println("$num2 is negative: ${negative(num2)}")
    val number = 9
    val answer = 9*9
    println(answer)
}
fun evenNumbers(numbers: IntArray){
    println("Even numbers:")
    for (number in numbers){
    if (number % 2 ==0) {
        println(number)
    }
    }
}

fun negative(num:Int):Boolean = num < 0

fun square(number:Int):Int{
    return number * number
}


