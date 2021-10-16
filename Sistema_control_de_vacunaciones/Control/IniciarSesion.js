/*
#Fields:
id int primary key not null auto_increment,
usrname varchar(30) not null,
email varchar(50) not null,
passwrd varchar(20) not null 
 */
$("#btnIniciarSesion").on('click', function () {
    //getting values from inputs:
    var user = document.getElementById("userName").value();
    var pass = document.getElementById("contrasenia").value();
    if(user == null || user == "") {
        alert("USUARIO ES UN CAMPO OBLIGATORIO");
        user.focus();
    }else if(pass == null || pass == "") {
        alert("CONTRASEÑA ES UN CAMPO OBLIGATORIO ES UN CAMPO OBLIGATORIO");
        pass.focus();
    }else if ((user =="" || user == null) && (pass == "" || pass == null)) {
        alert("USUARIO Y CONTRASEÑA ESTÁN VACÍOS");
        user.focus();
        pass.focus();
    }else {
    $.ajax({
        url: 'http://localhost:9000/api/usuarios/'+$("#userName").val(),
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done( function(field) {
        var usuario = $("#usrname").val(field.usrname)
        var contra = $("#passwrd").val(field.passwrd)
        if((usuario != null || usuario != "") && (contra != null || contra !="")) {
            alert(`Hola, ${usuario}, ha iniciado sesión correctamente.`);
            document.location.href='../View/index.html';
        }else if(usuario == null || usuario == "") {
            alert("Usuario incorrecto, verifique nuevamente.");
            user.focus();
        }else if(contra == null || contra =="") {
            alert("Contraseña incorrecta, verifique nuevamente.");
            pass.focus();
        }else if((usuario == null || usuario == "") && (contra == null || contra =="")) {
            alert("Usuario y Contraseña son incorrectos, verifique nuevamente.");
            user.focus();
            pass.focus();
        }
    })
    }
})