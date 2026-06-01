package org.example.app

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
    fun date(){
        val fecha = Fecha(2026, "Mayo", 29)
        fecha.mostrar()
    }
}