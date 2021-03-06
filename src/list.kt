fun main() {
println(evenStrings(listOf("conny","sarah","katama","grace","promise","mercy","jane","mishuu","sandra","Barbra")))
    println(heights(listOf(20.00,80.00)))
    var humanList= mutableListOf<Human>(
        Human("sarah",20,34.00,60.00),
        Human("mlango",116,40.90,40.50),
        Human("panga",16,20.90,43.50),
        Human("jembee",19,490.90,60.50),
        Human("kelvin",16,34.90,48.50)
    )
    var sortedHuman=humanList.sortedByDescending { human -> human.age }
    println(sortedHuman)
    addHuman(mutableListOf<Human>(
        Human("sarah",20,34.00,60.00),
        Human("mlango",6,40.90,40.50),
        Human("panga",26,20.90,43.50),
        Human("jembee",46,490.90,60.50),
        Human("kelvin",36,34.90,48.50)
    ))

 var ava=avarageMile(listOf(
      Car("fox",120),
      Car("mazda",139),
      Car("toyota",80),
      Car("limo",200)
 ))
    println(ava)

    
println(heightss(listOf(29.496,5.909)))
}


fun evenStrings(names:List<String>):List<String> {
   return names.filterIndexed { index, name -> index%2==0 }

}
fun heights(height:List<Double>):Pair<Double,Int>{
    var sum=height.sum()
    var average=height.average()
    return Pair(average,sum.toInt())

}
data class Human(var name:String,var age:Int,var height:Double,var weight:Double)

fun addHuman(humanList:MutableList<Human>){

    humanList.addAll(
        listOf(Human("kuku",16,490.90,60.50),
        Human("umbwa",16,34.90,48.50))
    )
    println(humanList)


}
data class Car(var registration:String,var mileage:Int)
fun avarageMile(car:List<Car>):Double{
  var total=0.0000
    car.forEach { car->car.mileage
    total+=car.mileage
    }
    return total/car.count()
}

data class Avaragee(var average:Double,var total:Double)
fun heightss(heights:List<Double>):Avaragee {
    var total=heights.sum()
    var average=heights.average()         //same as  number two
    return Avaragee(average=average,total=total)
}


