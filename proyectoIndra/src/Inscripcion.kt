class Inscripcion {
    var datosUsuario = ArrayList<Usuario>()
    var datosEvento = ArrayList<Evento>()

    constructor()
    constructor(datosUsuario: ArrayList<Usuario>, nombreEvento: ArrayList<Evento>) {
        this.datosUsuario = datosUsuario
        this.datosEvento = nombreEvento
    }


    fun borrarUsuario(usuario: Usuario, evento: Evento){
        for (i in datosUsuario){
            if (datosUsuario.equals(usuario) && datosEvento.equals(evento)){
                datosUsuario.remove(usuario)
            }
        }

    }

    fun borrarEvento(evento: Evento){
        for (i in datosEvento){
            if (datosEvento.equals(evento)){
                datosEvento.remove(evento)
            }
        }
    }
}