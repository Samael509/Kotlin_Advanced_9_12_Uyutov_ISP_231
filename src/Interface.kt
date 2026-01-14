interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("останавливаемся..")
    }
}

class Car(
    override val model: String,
    override val number: String
) : Movable {
    override var speed: Int = 60
    override fun move() {
        println("едем на машине")
    }
}

class AirCraft(
    override val model: String,
    override val number: String
) : Movable {
    override var speed: Int = 600
    override fun move() {
        println("летим")
    }

    override fun stop() {
        println("приземляемся")
    }
}

fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}

interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun work() {
        println("$name работает")
    }

    override fun study() {
        println("$name учится")
    }
}

interface VideoPlayable {
    fun play(){
        println("play video")
    }
}

interface AudioPlayable {
    fun play() {
        println("play audio")
    }
}

class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}

fun main() {
    val player = MediaPlayer()
    player.play()
//    val oleg = WorkingStudent("олег")
//    oleg.work()
//    oleg.study()
//    val car = Car("LADA", "OK123B")
//    val airCraft = AirCraft("Boeing", "23KO&")
//    car.move()
//    airCraft.move()
//    travel(airCraft)
//    travel(car)
}
