/*
#Fields
noDocumento varchar(10) not null primary key,
nombres varchar(30) not null,
apellidos varchar(30) not null,
tipoDoc varchar(3) not null,
pais varchar(40) not null,
departamento varchar(40) not null,
ciudad varchar(40) not null,
farmaceutica varchar(10) not null,
dosis varchar(2) not null,
fecha date not null, Year-month-day
puestoVacunacion varchar(100) not null
*/
$("#btnActualizar").on("click", function () {
    var noDocumento = document.getElementById("sIdentificacion").value;
    noDocumento.disabled = true;
    $.ajax({
        url: 'http://localhost:9000/api/registroPaciente/'+ $("#sIdentificacion").val(),
        data: JSON.stringify({
            nombres: $("#sNombres").val(),
            apellidos: $("#sApellidos").val(),
            tipoDoc: $("#sTipoDocOpt").val(),
            pais: $("#sPais").val(),
            departamento: $("#sDepartamento").val(),
            ciudad: $("#sCiudad").val(),
            farmaceutica: $("#sFarmaceutica").val(),
            dosis: $("#sDosis").val(),
            fecha: $("#sFechaVac").val(),
            puestoVacunacion: $("#sPuestoVac").val()
        }),
        method: "put",
        headers: {
            "Content-Type": "application/json"
        }

    }).done(function (result) {
        alert("Paciente actualizado correctamente");
    })

})