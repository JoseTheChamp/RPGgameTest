import Model.*

fun main(args: Array<String>) {
    println("Start")

    var hero = Hero("Karel","Karel je borec",100.0,10.0,0.5)
    println(hero.charisma.toString() + "  " + hero.name)

    var list = listOf<EventOption>(EventOption(-5,"Konec","Dal to nepovede."),EventOption(2,"Staty","Dostanes mozna staty."),EventOption(1,"Vyzva","Asi bude vyzva."))
    var se1 : Event = StoryEvent(0,"Katastrofa1","Lorem ipsum dolor sit amet. Alar valhi si dela morgulis.",list)
    var se2 : Event = ChallengeEvent(1,"Katastrofa2","Lorem ipsum dolor sit amet. Alar valhi si dela morgulis.",
        EventOption(0,"Na rozcesti","Bude to dobre"),EventOption
    (0,"Na zocesti","Bude to bolet"),listOf(StatValue(Stat.INTELIGENCE,50.0)))
    var se4 : Event = StatsEvent(2,"Studium","Dlouhým studiem si získal znalosti. A ty knížky taky něco váží.",EventOption(0,"Na rozcesti","Hadej kam to povede."), listOf(StatValue(Stat.INTELIGENCE,0.5),
        StatValue(Stat.STRENGTH,0.1)
    ))

    var scenar = Scenario("scenar1",hero,listOf(se1,se2,se4))
    scenar.playScenario()
}