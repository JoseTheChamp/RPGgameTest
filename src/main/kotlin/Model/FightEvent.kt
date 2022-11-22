package Model

class FightEvent (override var id : Int, override var name : String, override var story : String, var enemy: Enemy, var optionWon : EventOption, var optionLost : EventOption): Event() {

   fun vypis(hero: Hero) : EventOption{
       println("------------------------------")
       println(id.toString() + name + " - " + story)
       println("Stoji před tebou " + enemy.name)
       // TODO - boj
        if (boj(hero)){
            println("Won")
            return optionWon
        }
       println("Lost")
       return optionLost
   }

    override fun run(hero: Hero): Int {
        var option = vypis(hero)
        readln()
        return option.targetId;
    }

    fun boj(hero: Hero) : Boolean{
        // TODO Boj Logika
        return true;
    }

    override fun getAllEventoptions(): List<EventOption> {
        return listOf(optionWon,optionLost)
    }

    override fun getEventOptionsPossible(hero: Hero): List<Boolean> {
        if (boj(hero)) return listOf(true,false)
        return listOf(false,true)
    }
}