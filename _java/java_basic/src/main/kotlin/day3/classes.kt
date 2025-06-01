package day3

sealed class Result
class Success(val data: String) : Result()
class Error(val message: String) : Result()
object Loading : Result()

fun handle(result: Result) = when (result) {
    is Success -> println("Data: ${result.data}")
    is Error -> println("Error: ${result.message}")
    Loading -> println("Loading...")
}


fun main(){
    val result1: Result = Success("Data loaded successfully")
    val result2: Result = Error("Failed to load data")
    val result3: Result = Loading

    handle(result1)
    handle(result2)
    handle(result3)
}