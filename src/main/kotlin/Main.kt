import kotlin.math.*
fun main(args: Array<String>) {

    /* задание1 */
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1 //через инкримент

    /* задание2 */
    val age: Int = 17 //создание константы в соответствии со стандартами
    exercisesSolved += 1

    /* задание3 */
    var initialage: Int = 18
    initialage = ( initialage + 30) / 2 /* среднее арифметическое вашего возраста и
                                        человека, которому 30 лет*/
    exercisesSolved += 1

    /* задание4 */
    val testNumber: Int = 88
    var evenOdd = (testNumber % 2 )
    //testNumber остается при выводе 88, а evenOdd равняется 0, тк остаток от деления 88/2 равен 0

    /* задание5 */

    var answer: Int = 0
    answer+=1
    answer+=10
    answer*=10
    answer shr 3
    println(answer)
    exercisesSolved += 1 // что то на китайском, смещаем на 3 вправо

    /* задание6 */
    var age2: Int /* используем var, тк age переприсваивают значение,
                  что в случае с константой(val) сделать невозможно*/
    age2 = 16
    print(age2)
    age2 = 30
    print(age2)

    /* задание7 */

    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b //4610
    val answer2: Int = (a * 100) + (b * 100) //5600
    val answer3: Int = (a * 100) + (b / 10) //4601

    /* задание 8 */

    ((5*3)-((4/2)*2))

    /* задание9 */

    val a2: Double = 2.9
    val b2: Double = 3.1
    val average = (a2+b2) / 2 /* результат среднего арифмитического помещаем в конст
                              average */

    /* задание10 */

    val fahrenheit: Double = 22.9
    val celcius = (fahrenheit - 32) / 1.8
    /* что бы из  °F в °С перевести нужно поменять знаки и
    порядок действий */

    /* задание12 */

    val degrees: Double = 180.0
    var radians: Double = degrees * PI / 180
    /* присваиваем начальное значение, а потом вычисляем угол в радианах и сохраняем
    результат в новую константу */

    /* задание13 */

    val x1: Double = 4.5
    val y1: Double = 2.4
    val x2: Double = 3.4
    val y2: Double = 5.2
    val distance: Double = sqrt(((x1 - x2) * (x1 - x2)) + ((x1 - x2) * (x1 - x2)))



    println("Program arguments: ${args.joinToString()}")
}