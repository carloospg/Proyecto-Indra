class Factoria {

    companion object{

        fun crearEvento():Evento{
            var evento = Evento()
            evento.categoria = TipoCategoria.values().random().toString().lowercase()
            return evento
        }

        fun crearEvento(nombre: String,categoria: String, fecha:String, duracion:String, ubicacion: Ubicacion, asistente:Usuario):Evento{
            var evento = Evento()
            return evento
        }

        fun crearUsuario():Usuario{
            var usuario = Usuario()
            return usuario
        }

        fun crearUsuario(nombre: String, correo:String):Usuario{
            var usuario = Usuario()
            return usuario
        }

        fun crearOrganizador():Organizador{
            var organizador = Organizador()
            return organizador
        }

        fun crearOrganizador(nombre: String, correo: String, tlf:Int):Organizador{
            var organizador = Organizador()
            return organizador
        }

        fun crearInscripcion():Inscripcion{
            var inscripcion = Inscripcion()
            return inscripcion
        }

        fun crearInscripcion(usuario: Usuario, evento: Evento):Inscripcion{
            var inscripcion = Inscripcion()
            return inscripcion
        }

        fun crearUbicacion():Ubicacion{
            var ubicacion = Ubicacion()
            ubicacion.tipo = TipoUbicacion.values().random().toString().lowercase()
            return ubicacion
        }

        fun crearUbicacion(tipo:String, direccion:String):Ubicacion{
            var ubicacion = Ubicacion()
            return ubicacion
        }

        enum class TipoCategoria {
            TALLER,
            CONFERENCIA
        }

        enum class TipoUbicacion{
            ONLINE,
            FISICO
        }
    }

}