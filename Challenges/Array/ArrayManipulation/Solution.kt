import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the arrayManipulation function below.
// Note: Based on prefix sum array  logic
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
val dataArray = LongArray(n)
var upper:Int
var lower:Int
var sum:Long


    for (itemindex in queries.indices) {
 val currentQueryArray = queries[itemindex]
    lower=currentQueryArray[0]
    upper=currentQueryArray[1]
    sum=currentQueryArray[2].toLong()
    dataArray[lower-1]+=sum
    if(upper<n)
    dataArray[upper]-=sum

    } 
var temp:Long =0
var max:Long  =0
         for(i in dataArray.indices){
         temp += dataArray[i]
    if(temp> max)
    max=temp
     }
return max
}

fun main1(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nm = scan.nextLine().split(" ")
    val n = nm[0].trim().toInt()
    val m = nm[1].trim().toInt()
    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })
    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}

fun main(args: Array<String>){
    val array1 = arrayOf(1,2,100)

val array2 = arrayOf(1,5,100)
val array3 = arrayOf(3,4,100)

     val queries = arrayOf(array1,array2,array3)

     val result =arrayManipulation(5,queries)
      println("retruned vale-->"+result)
}
