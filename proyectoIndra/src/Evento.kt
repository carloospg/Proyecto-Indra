class Evento {
    var nombre = ""
    var categoria = ""
    var fecha = ""
    var duracion = ""
    var ubicacion = Ubicacion()
    var asistente = ArrayList<Usuario>()

    constructor()

    constructor(nombre: String, categoria: String, fecha: String, duracion: String, ubicacion: Ubicacion) {
        this.nombre = nombre
        this.categoria = categoria
        this.fecha = fecha
        this.duracion = duracion
        this.ubicacion = ubicacion
    }

    fun cancelarEvento(){
        Inscripcion().borrarEvento(Evento())
    }

    fun aniadirUsuario(usuario: Usuario){
        asistente.add(usuario)
    }

}