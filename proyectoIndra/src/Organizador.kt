class Organizador {
    var nombre = ""
    var correo = ""
    var tlf = 0
        set(value){
            if (value > 0 || value < 999999999){
                tlf = value
            } else {
                tlf = 0
            }
        }

    constructor()

    constructor(nombre: String, correo: String, tlf: Int) {
        this.nombre = nombre
        this.correo = correo
        this.tlf = tlf
    }

    fun crearEvento():Evento{
        var evento = Factoria.crearEvento()
        return evento
    }

    fun modificarEvento(evento: Evento):Evento{
        var nuevoEvento = evento
        var cont = true
        var buclePreguntaSeguir = true
        var respuestaSeguir = 0

        do {
            Preguntas.preguntaGeneral
            var respuesta = readln().toInt()
            when(respuesta){
                1-> {
                    Preguntas.preguntaNombre
                    nuevoEvento.nombre = readln().lowercase()
                }
                2-> {
                    var bucleCategoria = true
                    var respuestaCategoria = 0
                    while (bucleCategoria){
                        Preguntas.preguntaCategoria
                        respuestaCategoria = readln().toInt()
                        if (respuestaCategoria == 1){
                            nuevoEvento.categoria = "taller"
                            bucleCategoria = false
                        } else if (respuestaCategoria == 2){
                            nuevoEvento.categoria = "conferencia"
                            bucleCategoria = false
                        } else {
                            Preguntas.respuestaError
                        }
                    }

                }
                3->{
                    Preguntas.preguntaFecha
                    nuevoEvento.fecha = readln()
                }
                4->{
                    Preguntas.preguntaDuracion
                    nuevoEvento.duracion = readln()
                }
                5->{
                    var bucleUbicacion = true
                    var respuestaUbicacion = 0
                    while (bucleUbicacion){
                        Preguntas.preguntaUbicacion
                        respuestaUbicacion = readln().toInt()
                        if (respuestaUbicacion == 1){
                            nuevoEvento.ubicacion.tipo = "online"
                            bucleUbicacion = false
                        } else if (respuestaUbicacion == 2){
                            nuevoEvento.ubicacion.tipo = "direccion"
                            Preguntas.preguntaDireccion
                            nuevoEvento.ubicacion.direccion = readln()
                            bucleUbicacion = false
                        } else {
                            Preguntas.respuestaError
                        }
                    }
                }
            }
            while (buclePreguntaSeguir){
                Preguntas.preguntaSeguirModificando
                respuestaSeguir = readln().toInt()
                if (respuestaSeguir == 1){
                    buclePreguntaSeguir = false
                } else if (respuestaSeguir == 2){
                    buclePreguntaSeguir = false
                    cont = false
                } else {
                    Preguntas.respuestaError
                }
            }

        } while (cont)

        return nuevoEvento
    }
}