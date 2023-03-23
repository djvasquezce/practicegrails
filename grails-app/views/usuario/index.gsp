<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Usuarios</title>
</head>
<body>
    <h1>Lista de usuarios</h1>

    <g:link action="create">Agregar usuario</g:link>

    <table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Email</th>
                <th>Password</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <g:each in="${usuarios}" var="usuario">
                <tr>
                    <td>${usuario.nombre}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.password}</td>
                    <td>
                        <g:link action="edit" id="${usuario.id}">Editar</g:link>
                        <g:form action="delete" method="DELETE">
                            <button type="submit">Eliminar</button>
                            <input type="hidden" name="id" value="${usuario.id}">
                        </g:form>
                    </td>
                </tr>
            </g:each>
        </tbody>
    </table>


</body>
</html>