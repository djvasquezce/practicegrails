package practicegrails

class Usuario {

    String nombre
    String email
    String password

    static constraints = {
        nombre blank: false, nullable: false
        email blank: false, nullable: false, unique: true, email: true
        password blank: false, nullable: false, password: true
    }

    static mapping = {
        table 'usuario'
        nombre column: 'nombre'
        email column: 'email'
        password column: 'password'
    }
}
