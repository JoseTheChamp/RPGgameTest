package Model

class FightEvent (override var id : Int, override var name : String, override var story : String, var enemy: Enemy, var optionWon : EventOption, var optionLost : EventOption): Event() {

   fun vypis(hero: Hero) : EventOption{
       println("------------------------------")
       println(id.toString() + name + " - " + story)
       println("Stoji před tebou " + enemy.name)
       // TODO - boj
            if (true){
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
}