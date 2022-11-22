package Model

class ScenarioJson (var path : String) {
    lateinit var scenarios : List<Scenario>

    fun loadScenarios() : List<Scenario> {
        // TODO loading scenarios from JSOn
        // load scenario - load name, load list of events, load event, load .......
        return listOf(
            Scenario("scenar1",listOf(
                StoryEvent(0,"Katastrofa1","Lorem ipsum dolor sit amet. Alar valhi si dela morgulis.",listOf<EventOption>(EventOption(-5,"Konec","Dal to nepovede."),EventOption(2,"Staty","Dostanes mozna staty."),EventOption(1,"Vyzva","Asi bude vyzva."))),
                ChallengeEvent(1,"Katastrofa2","Lorem ipsum dolor sit amet. Alar valhi si dela morgulis.",
                    EventOption(0,"Na rozcesti","Bude to dobre"),EventOption
                        (0,"Na zocesti","Bude to bolet"),listOf(StatValue(Stat.INTELIGENCE,50.0))),
                StatsEvent(2,"Studium","Dlouhým studiem si získal znalosti. A ty knížky taky něco váží.",EventOption(0,"Na rozcesti","Hadej kam to povede."), listOf(StatValue(Stat.INTELIGENCE,0.5),
                    StatValue(Stat.STRENGTH,0.1)
                ))))
        )
    }
}