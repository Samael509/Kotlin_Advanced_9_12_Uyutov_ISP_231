class ResearchLab : OutpostModule(
    "исследовательская лаборатория"
) {
    override fun performAction(manager: ResourceManager) {
        val minerals = manager.get("minerals")

        if(minerals == null || minerals.amount < 30){
            println("недостаточно минералов для исслдования")
            return
        } else{
            minerals.amount -= 30
            println("лаборатория проводит исследование (минералы - 30)")
        }
    }
}