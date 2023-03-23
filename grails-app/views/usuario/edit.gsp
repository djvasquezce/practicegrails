<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Crear usuario</title>
</head>
<body>
    <h1>Crear usuario</h1>
    <g:form controller="usuario" action="update">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre" value="${usuario.nombre}" required/><br/><br/>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="${usuario.email}" required/><br/><br/>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" value="${usuario.password}" required/><br/><br/>

        <button type="submit">Guardar</button>
    </g:form>
</body>
</html>