$(document).ready(function() {
    $('#form-nuevo-usuario').on('submit', function(e) {
        e.preventDefault();

        // Obtener los valores de los campos
        var nombre = $('#nombre').val();
        var email = $('#email').val();
        var confirmEmail = $('#confirm-email').val();
        var password = $('#password').val();
        var confirmPassword = $('#confirm-password').val();

        // Verificar que los correos sean iguales
        if (email !== confirmEmail) {
            alert('Los correos electrónicos no coinciden.');
            return;
        }

        // Verificar que las contraseñas sean iguales
        if (password !== confirmpassword) {
            alert('Las contraseñas no coinciden.');
            return;
        }

        // Realizar la llamada AJAX para crear el usuario
        $.ajax({
            url: '/api/administradores', // Endpoint del backend
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                nombre: nombre,
                correo: email,
                password: password
            }),
            success: function(response) {
                alert('Usuario creado exitosamente.');
                // Redirigir o mostrar mensaje de éxito
            },
            error: function(xhr, status, error) {
                alert('Error al crear el usuario: ' + xhr.responseText);
            }
        });
    });
});
