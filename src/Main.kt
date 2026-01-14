fun main() {
    val manager = ResourceManager()
    val gas = OutpostResource(1, "Gas", 2)
    val mineral = OutpostResource(2, "mineral", 129)
    manager.add(gas)
    manager.add(mineral)
    manager.printAll()
    val bonusMiniral = mineral.copy(id = 3, amount = mineral.amount + 60)
    println("бонусные минералы: $bonusMiniral")
}