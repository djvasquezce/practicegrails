package practicegrails

class Usuario {

    String nombre
    String apellido
    String correo
    String genero

    static constraints = {
        nombre(blank: false, nullable: false)
        apellido(blank: false, nullable: false)
        correo(blank: false, nullable: false, unique: true, email: true)
        genero inList: ['M', 'F']
        
    }

    static mapping = {
        table 'usuario'
        nombre column: 'nombre'
        apellido column: 'apellido'
        correo column: 'correo'
        genero column: 'genero'
    }
}
