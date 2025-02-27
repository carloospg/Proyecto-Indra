fun main() {

    var usuario1 = Factoria.crearUsuario("Calos", "carlos@gmail.com")
    var usuario2 = Factoria.crearUsuario()

    var org1 = Factoria.crearOrganizador("Juan", "juan@gmail.com", 123456789)
    var org2 = Factoria.crearOrganizador()

    var ubi1 = Factoria.crearUbicacion("online", "https://enlace.com")
    var ubi2 = Factoria.crearUbicacion()

    var evento1 = Factoria.crearEvento("Charla medioambiental", "conferencia", "10/05/25", "60 minutos", ubi1, usuario1)
    var evento2 = Factoria.crearEvento()

    var inscripcion1 = Factoria.crearInscripcion(usuario2, evento2)
    var inscripcion2 = Factoria.crearInscripcion()

    usuario2.cancelarInscripcion(evento2)

    usuario2.inscribirseEvento(evento2)

    evento1.aniadirUsuario(usuario2)

    evento2.cancelarEvento()

    var evento3 = org1.crearEvento()

    org1.modificarEvento(evento3)

    inscripcion1.datosEvento

    inscripcion2.datosUsuario
}