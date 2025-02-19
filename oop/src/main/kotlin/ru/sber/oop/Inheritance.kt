package ru.sber.oop

open class Room(
    val name: String,
    val size: Int,
    val monster: Monster = Goblin("Levi", "Big goblin", "Fire", 90)
) {

    protected open val dangerLevel = 5

    constructor(name: String) : this(name, 100)

    fun description() = "Room: $name"

    open fun load() = "Nothing much to see here...\nGrrr, ${monster.getSalutation()}"

}

open class TownSquare : Room("Town Square", 1000) {
    override val dangerLevel = super.dangerLevel - 3

    final override fun load() = "Town Square is loading..."
}