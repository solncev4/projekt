fun main() {//Главная функция
    new_year()    // Зовем побочную функцию
}

fun WhenTest() {
    var variants = readLine()!!.toInt()
    when (variants) {
        1 -> println("Привет!")
        2 -> println("Пока!")
        3 -> println("Как дела?")
        else -> println("Иди сюда!")
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
    when (Weatherman) {
        1 -> println("Советник советует посоветовать вам что-бы вы надели шубу и варежки")
        2 -> println("Советник советует посоветовать вам что-бы вы надели дождевик и взяли зонт")
        3 -> println("Советник советует посоветовать вам что-бы вы надели футболку и позагарали")
        4 -> println("Советник советует посоветовать вам что-бы вы надели куртку и ветроловку")
        5 -> println("Советник советует нифига не делать и играть в майнкрафт")
        else -> println("Советник советует посоветовать вам что у вас с наружи")
    }


}

fun Numbers999999() {
    print(
        "Case18." +
                "Дано целое число в диапазоне 1–999999.\n" +
                "Вывести строку-описание данного числа,\n" +
                "например:\n" +
                "256 — «двести пятьдесят шесть»,\n" +
                "814 — «восемьсот четырнадцать».\n"
    )
    while (true) {
        var string_description = ""

        print("Введите число[1-999999]: ")
        var numbers = readLine()!!.toInt()

        if (numbers in 1..999999) {
            println("Все Ок-с!")


            //сотни тысяч
            when (numbers / 100000) {
                1 -> string_description += "сто "
                2 -> string_description += "двести "
                3 -> string_description += "триста "
                4 -> string_description += "четыреста "
                5 -> string_description += "пятьсот "
                6 -> string_description += "шестьсот "
                7 -> string_description += "семьсот "
                8 -> string_description += "восемьсот "
                9 -> string_description += "девятьсот "
            }

            //десятки тысячи
            when (numbers % 100000 / 10000) {

                1 -> {
                    when (numbers % 100000 / 1000 % 10) {
                        0 -> string_description += "десять "
                        1 -> string_description += "одинадцать "
                        2 -> string_description += "двенадцать "
                        3 -> string_description += "тринадцать "
                        4 -> string_description += "четырнадцать "
                        5 -> string_description += "пятнадцать "
                        6 -> string_description += "шестнадцать "
                        7 -> string_description += "семнадцать "
                        8 -> string_description += "восемнадцать "
                        9 -> string_description += "девятнадцать "

                    }
                    string_description += "тысяч "

                }
                2 -> string_description += "двадцать "
                3 -> string_description += "тридцать "
                4 -> string_description += "сорок "
                5 -> string_description += "пятьдесят "
                6 -> string_description += "шестьдесят "
                7 -> string_description += "семьдесят "
                8 -> string_description += "восемьдесят "
                9 -> string_description += "девяносто "
            }

            //тысячи
            if (numbers % 100000 / 1000 in 10..19) {

            } else {
                when (numbers % 10000 / 1000) {
                    0 -> string_description += "тысяч "
                    1 -> string_description += "одна тысяча "
                    2 -> string_description += "две тысячи "
                    3 -> string_description += "три тысячи "
                    4 -> string_description += "четыре тысячи "
                    5 -> string_description += "пять тысяч "
                    6 -> string_description += "шесть тысяч "
                    7 -> string_description += "семь тысяч "
                    8 -> string_description += "восемь тысяч "
                    9 -> string_description += "девять тысяч "
                }
            }


            //сотни
            when (numbers % 1000 / 100) {
                1 -> string_description += "сто "
                2 -> string_description += "двести "
                3 -> string_description += "триста "
                4 -> string_description += "четыреста "
                5 -> string_description += "пятьсот "
                6 -> string_description += "шестьсот "
                7 -> string_description += "семьсот "
                8 -> string_description += "восемьсот "
                9 -> string_description += "девятьсот "
            }

            //десятки
            when (numbers % 100 / 10) {
                1 -> {
                    when (numbers % 10) {
                        0 -> string_description += "десять "
                        1 -> string_description += "одинадцать "
                        2 -> string_description += "двенадцать "
                        3 -> string_description += "тринадцать "
                        4 -> string_description += "четырнадцать "
                        5 -> string_description += "пятнадцать "
                        6 -> string_description += "шестнадцать "
                        7 -> string_description += "семнадцать "
                        8 -> string_description += "восемнадцать "
                        9 -> string_description += "девятнадцать "
                    }
                }
                2 -> string_description += "двадцать "
                3 -> string_description += "тридцать "
                4 -> string_description += "сорок "
                5 -> string_description += "пятьдесят "
                6 -> string_description += "шестьдесят "
                7 -> string_description += "семьдесят "
                8 -> string_description += "восемьдесят "
                9 -> string_description += "девяносто "
            }
            //единицы
            if (numbers % 100 in 10..19) {
            } else {
                when (numbers % 10) {
                    1 -> string_description += "один"
                    2 -> string_description += "два"
                    3 -> string_description += "три"
                    4 -> string_description += "четыре"
                    5 -> string_description += "пять"
                    6 -> string_description += "шесть"
                    7 -> string_description += "семь"
                    8 -> string_description += "восемь"
                    9 -> string_description += "девять"
                }
            }
        } else {
            print("А условие кто читать будет? А?")
        }
        println(string_description)
    }
}


fun new_year() {
//    print("Введите ваш бюджет на подарок: ")
//    var budget = readLine()!!.toInt()


    val num = mutableMapOf(
        1 to "один",
        2 to "два",
        3 to "три",
        4 to "четыре",
        5 to "пять",
        6 to "шесть",
        7 to "семь",
        8 to "восемь",
        9 to "девять",
        10 to "десять",
    )
while(true)
    {

        print("Выберите номер элемента, который вы хотите отредактировать[1-10]: ")
        var element_number = readLine()!!.toInt()
        print("Редактирование: ")
        num[element_number] = readLine().toString()
        println(num)
    }
}
