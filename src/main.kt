fun main() {//Главная функция
    For_Test() // Зовем побочную функцию
}

fun WhenTest() {
    for(schetchik in 1..4)
        {
        var variants = readLine()!!.toInt()
        when (variants) {
            1 -> println("Привет!")
            2 -> println("Пока!")
            3 -> println("Как дела?")
            else -> println("Иди сюда!")
        }
    }
}

fun Task1() {
    print(
        "Написать программу,\n" +
                "которая в зависимсоти от погоды\n" +
                "дает совет что лучше делать.\n"
    )
    print(
        "1 - снег,\n" +
                "2 - дождь,\n" +
                "3 - жара,\n" +
                "4 - сильный ветер,\n" +
                "5 - стихийное бедвствие\n" +
                "Выбeрите что у вас за окном: "
    )

    var Weatherman = readLine()!!.toInt()
when(Weatherman) {
    1 -> println("Советник советует посоветовать вам что-бы вы надели шубу и варежки")
    2 -> println("Советник советует посоветовать вам что-бы вы надели дождевик и взяли зонт")
    3 -> println("Советник советует посоветовать вам что-бы вы надели футболку и позагарали")
    4 -> println("Советник советует посоветовать вам что-бы вы надели куртку и ветроловку")
    5 -> println("Советник советует нифига не делать и играть в майнкрафт")
    else -> println("Советник советует посоветовать вам что у вас с наружи")
}
















}

fun For_Test()
{
    print("Введите начало: ")
    var start = readLine()!!.toInt()
    print("Введите конец: ")
    var finish = readLine()!!.toInt()
    for(num in start..finish)
    {
        println(num)
    }
}


