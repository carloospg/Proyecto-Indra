class Usuario {
    var nombre = ""
    var correo = ""

    constructor()

    constructor(nombre: String, correo: String) {
        this.nombre = nombre
        this.correo = correo
    }

    fun cancelarInscripcion(evento: Evento){
        Inscripcion().borrarUsuario(Usuario(), evento)
    }

    fun inscribirseEvento(evento: Evento){
        evento.aniadirUsuario(Usuario())
    }

    override fun toString(): String {
        return "Usuario(nombre= $nombre, correo= $correo)"
    }

}