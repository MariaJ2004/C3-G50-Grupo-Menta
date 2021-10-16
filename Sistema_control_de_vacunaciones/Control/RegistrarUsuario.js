/*
#Fields:
id int primary key not null auto_increment,
usrname varchar(30) not null,
email varchar(50) not null,
passwrd varchar(20) not null 
 */
$("#btnRegistrarUsuario").on("click", function() {
    var contra = document.getElementById("contrasea").value();
    var contraConfirm = document.getElementById("contraConfirm").value();
    if(contra == contraConfirm) {
        $.ajax({
            url:'http://localhost:9000/api/usuarios',
            data: JSON.stringify({
                usrname: $("#username").val(),
                email: $("#correo").val(),
                passwrd: $("#contraConfirm").val()
            }),
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            }
        }).done(function(result) {
            alert("Autoridad sanitaria registrada con éxito.");
        })
    }else{
        alert("ERROR, LAS CONTRASEÑAS NO COINCIDEN.");
        document.getElementById("contrasea").focus();
        document.getElementById("contraConfirm").focus();
    }

    

})