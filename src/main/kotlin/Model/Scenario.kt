package Model

class Scenario (var name : String,var hero: Hero , var events : List<Event>) {


    fun playScenario(){
        var pokracuj = 0
        var next : Event
        while (pokracuj >= 0){
            next = findScenario(pokracuj)
            if (next.id == -1){
                println("Nenasel se scenar ----------------------")
                break
            }
            pokracuj = next.run(hero)
        }
        println("Konec scenare.")
    }

    fun findScenario(index : Int) : Event{
        for (ev in events){
            if (ev.id == index){
                return ev
            }
        }
        return StoryEvent(-1,"","", listOf<EventOption>(EventOption(0,"","")))
    }

}