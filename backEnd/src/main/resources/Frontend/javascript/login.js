$(document).ready(function() {
    $('#loginForm').on('submit', function(e) {
        e.preventDefault();
        var email = $('#email').val();
        var contrasena = $('#contrasena').val();

        $.ajax({
            url: '/api/administradores', // Cambia esta URL al endpoint correcto de tu backend
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                email: email,
                contrasena: contrasena
            }),
            success: function(response) {
                if (response.success) {
                    alert('Inicio de sesión exitoso');
                    window.location.href = '/bienvenido.html'; // Redirige a la página de bienvenida
                } else {
                    alert('Credenciales incorrectas');
                }
            },
            error: function(xhr, status, error) {
                alert('Error al iniciar sesión');
                console.error('Error:', error);
            }
        });
    });
});

