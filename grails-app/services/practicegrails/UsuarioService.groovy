package practicegrails

import grails.gorm.transactions.Transactional

@Transactional
class UsuarioService {

    /* def serviceMethod() {

    } */

    def obtenerUsuario(Long id) {
        Usuario.get(id)
    }

    def listarUsuarios() {
        Usuario.list()
    }

    def guardarUsuario(Usuario usuario) {
        if (usuario.validate()) {
            usuario.save(failOnError: true)
            true
        } else {
            false
        }
    }
    
    def eliminarUsuario(Usuario usuario) {
        usuario.delete()
    }
}
