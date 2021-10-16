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
$("#btnRegistrarPaciente").on('click', function () {
    $.ajax({
        url: 'http://localhost:9000/api/registroPaciente',
        data: JSON.stringify({
            noDocumento: $("#numIdentificacion").val(),
            nombres: $("#susNombres").val(),
            apellidos: $("#susApellidos").val(),
            tipoDoc: $("#tipoDocOpt").val(),
            pais: $("#suPais").val(),
            departamento: $("#suDepartamento").val(),
            ciudad: $("#suCiudad").val(),
            farmaceutica: $("#suFarmaceutica").val(),
            dosis: $("#suDosis").val(),
            fecha: $("#suFechaVac").val(),
            puestoVacunacion: $("#suPuestoVacunacion").val()
        }),
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function(result)
 {
     alert("Registro realizado exitosamente.");   
})
})