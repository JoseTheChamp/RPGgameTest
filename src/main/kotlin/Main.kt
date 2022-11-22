import Model.*

fun main(args: Array<String>) {
    println("Start")

    var hero = Hero("Karel","Karel je borec",100.0,10.0,0.5)
    println(hero.charisma.toString() + "  " + hero.name)

    var scenar = ScenarioJson("ahoj").loadScenarios()
    scenar[0].hero = hero
    scenar[0].playScenario()
}