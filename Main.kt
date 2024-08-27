//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // This is called as string interpolation
    // It allows to insert values direct into the string
//    val a:Int=10
//    val b:Int=20
//    val result ="The value of $a and $b is ${a+b}"
//    println(result)

//    // Kotlin Character datatype
//    val n:Char='A'
//    print("$n")
//    print('\n')
//    println("\$")
//    println("\\")
//    println("\t")
//    println("\n")
//    var name:String="""
//            Name
//        Name     Name
//            Name
//    """
//    println("$name")
//    print("\tname\nname\tname\n\tname")


//    val numbers = arrayOf(1,2,3,4,5);
//    val words:Array<String> =arrayOf("Shikhar","Puneet","Nikhil");
//    val firstNumber=numbers[0];
//    val secondNumber=numbers[1];
//    val lastNumber=numbers[4];
//    println("FirstNumber : $firstNumber");
//    println("Second Number : $secondNumber");
//    println("Last Number : $lastNumber");
//    numbers[0]=10;
//    println("Numbers of array using for loop");
//    for(num in numbers){
//        println(num);
//    }
//    for(it in words){
//        println(it);
//    }
    // Mutli-dimensional arrays
//    val first = arrayOf(1,2,3);
//    val second = arrayOf(1,2,3);
//    val third = arrayOf(1,2,3);
//    val number = arrayOf(first,second,third);
//    for(i in number) {
//        for (j in i) {
//            print("$j ");
//        }
//        print("\n");
//    }

    // Type-conversion in  kotlin
//    val x:Int =10;
//    val y:Long=x.toLong()
//    println(y);

    // Safe and unsafe casting
//    val a="hi";
//    val b:String = a as String
//    println("unsafe cast result : $b");

//    val c="hello"
//    val d:Int = c as Int
//    println("Exception case : $d");// it'll throw caseCastException error


    // Arithmetic operators
//    val a=10;
//    val b=20;
//    val res=a+b;
//    println("Addition: $a and $b = $res");
//    println("Subtraction : $a and $b = ${a-b}");
//    println("Multiplication: $a and $b = ${a*b}");
//    println("Division: $b and $a = ${b/a}");
//    println("Modulus: $a and $b = ${a%b}");

    // Relational operator

//    val x=5;
//    val y=10;
//    println("$x > $y = ${x>y}");
//    println("$x < $y = ${x<y}");
//    println("$x >= $y = ${x>=y}");
//    println("$x <= $y = ${x<=y}");
//    println("$x == $y = ${x==y}");
//    println("$x != $y = ${x!=y}");

    // Assignment operator
//    var e=10;
//    var f= 20;
//    var g=13;
//    var h=10;
//    var i=39;
//    e+=10;
//    f-=10;
//    g*=2;
//    h/=2;
//    i=i%3;
//    println("The value of e is = $e")
//    println("The value of f is = $f")
//    println("The value of g is = $g")
//    println("The value of h is = $h")
//    println("The value of i is = $i")

    // Unary operator
//    var j=10;
//    var k= 15;
//    ++j;
//    k--;
//    println("The value of j is = $j")
//    println("The value of k is = $k")


    // Logical operators

//    val isTrue =true;
//    val isFalse = false;
//    val ans = isTrue && isFalse;
//    val res1= isTrue || isFalse
//    val res2 = !isFalse
//    println("logical AND : $ans ");
//    println("logical OR : $res1 ");
//    println("logical OR : $res2 ");

    // if else
//    val temp = 25;
//    if(temp > 20){
//        println("it's a warm day");
//    }
//    else{
//        println("It's a cold day");
//    }

//    val score=56;
//    if(score>=90 && score<=100){
//        println("A");
//    }
//    else if(score>=85 && score<90){
//        println("B")
//
//    }
//    else if(score>=70 && score<85){
//        println("C")
//
//    }
//    else{
//        println("D")
//
//    }

    // create a calculator using all arithmetic operator;
//    val a=10;
//    val b=20;
//    println("Enter the operator");
//    val ch = readLine();
//    if(ch =="+"){
//        println(a+b);
//
//    }
//    else if(ch=="-"){
//        println(a-b);
//    }
//    else if(ch=="*"){
//        println(a*b);
//    }
//    else if(ch=="/"){
//        println(a/b)
//    }
//    else {
//        println("choose right option")
//    }

//    val age=56;
//    if(age>=13 && age<19){
//        println("Teenage");
//    }
//    else if(age<13){
//        println("Child")
//
//    }
//    else{
//        println("Adult")
//
//    }

//    println("Enter age");
//    val age:Int=Integer.valueOf(readLine())
//    if(age in 13..19){
//        println("Teenage");
//    }
//    else if(age<13){
//        println("Child")
//
//    }
//    else if(age in 20..64){
//        println("Adult")
//    }
//    else{
//        println("Old")
//
//    }

    // when statement in kotlin
//    println("Enter the day of week");
//    val dayOfWeek:Int=Integer.valueOf(readLine());
//    val dayName=when(dayOfWeek){
//        1->"Monday"
//        2->"Tuesday"
//        3->"Wednesday"
//        4->"Thursday"
//        5->"friday"
//        6->"Saturday"
//        7->"Sunday"
//        else->"Invalid day"
//
//    }
//    println("Day of the week:$dayName")

    println("Enter the Number");
    val num:Int=Integer.valueOf(readLine());
    when{
        num%2==0-> println(
"Even")
        num%2!=0-> println(
"Odd")
        else-> println(
"Invalid Number")

    }


}