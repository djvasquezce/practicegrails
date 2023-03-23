package practicegrails


class UsuarioController {

    def usuarioService

    def index() {
        def listaUsuarios = usuarioService.listarUsuarios()
        System.out.println("Lista de usuarios: " + listaUsuarios)
        render(view: "index", model: [usuarios: listaUsuarios])
    }

    def create() {
        /* [usuario: new Usuario()] */
        render(view: 'create', model: [usuario: new Usuario()])
    }

    def save() {
        def usuario = new Usuario(params)
        if (usuarioService.guardarUsuario(usuario)) {
            redirect(action: "index")
        } else {
            render(view: "create", model: [usuario: usuario])
        }
    }

    def edit() {
        def usuario = usuarioService.obtenerUsuario(params.id as Long)
        if (!usuario) {
            flash.message = "Usuario no encontrado."
            redirect(action: "index")
            return
        }
        render(view: "edit", model: [usuario: usuario])
    }

    def update() {
        def usuario = usuarioService.obtenerUsuario(params.id as Long)
        if (!usuario) {
            flash.message = "Usuario no encontrado."
            redirect(action: "index")
            return
        }
        usuario.properties = params
        if (usuarioService.guardarUsuario(usuario)) {
            redirect(action: "index")
        } else {
            render(view: "edit", model: [usuario: usuario])
        }
    }

    def delete() {
        def usuario = usuarioService.obtenerUsuario(params.id as Long)
        if (!usuario) {
            flash.message = "Usuario no encontrado."
            redirect(action: "index")
            return
        }
        usuarioService.eliminarUsuario(usuario)
        redirect(action: "index")
    }


}
