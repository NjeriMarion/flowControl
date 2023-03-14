fun main(){
    oddNumbers()
    println(namecharacters (arrayOf("Maria", "Esther", "Veronica", "mary" )))
    guests(3)
    guests(8)
    guests(20)
    replacesNumbers()

}
//prints out all odd numbers between 1 and 100
fun oddNumbers(){
    for (numbers in 1..100){
        if (numbers % 2 != 0  ){
            println(numbers)

        }
    }

}
// returns the number of names longer than 5 characters
fun namecharacters(names:Array<String>):Int{
    var length = 0
    for (x in names){
        if( x.count() > 5){
            length += 1
        }
    }
    return length
}
//serves drinks according to age
fun guests(age:Int){
    if (age in 1..6){
        println("Milk")
    }
    else if (age in 6..15){
        println("Fanta Orange")
    }
    else{
        println("Coca cola")
    }
}
//prints out all numbers from 1 to 100
fun replacesNumbers(){
    for (number in 1..100){
        if (number % 3 == 0  && number % 5 ==0){
            println("FizzBuzz")
        }
        else if(number % 5 == 0 ){
            println("Buzz")
        }
        else if ((number % 3 ==0)){
            println("Fizz")
        }
        else{
            println(number)
        }
    }
}

