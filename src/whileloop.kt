fun main() {
    var x=1
    while(x<=10){
        println("It is a chili morning")
        x++
    }
var h=100
    while (h>=12){
        if (h%3!=0){//use a while loop to print out all the old numbures form 100 to 12
            println(h)
        }
        h--
    }
    var j=1
    do{//do while loop
        println(j)
        j++
    }while (j<=100)


    //use a do while loop to print out the square of all positive int to a max square of 1800
var m=1
    do {
        println(m*m)
        m++
    }while (m*m<=1800)



    var names= listOf("qw","lkj","yht","gsnf","htk")
    for (name in names){

        if(name=="yht"){
            println("found him!!!")
            break
        }
        println(name)
    }
    var noice= listOf("kate","diana","jane","sandra","gilly","babra","akal")
    for(name in noice) {
        if (name == "jane"||name=="sandra") {
            continue
        }
        println(name)
    }
    var friends= listOf("kate","diana","jane","sandra","gilly","babra","akal")
    for (names in friends){
        if (friends.contains(names)){
            continue
        }
        println(names)
    }

}