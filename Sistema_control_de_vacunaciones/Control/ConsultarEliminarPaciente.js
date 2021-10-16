$("#btnConsultar").on('click', function () {
    var noDocumento = document.getElementById("noDocumento").value;
    noDocumento.disabled = true;
    $.ajax({
        url: 'http://localhost:9000/api/registroPaciente/'+$("#noDocumento").val(),
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    
    }).done(function (field) {
        //Columns
    var documento =             $("#noDocumento").val(field.noDocumento)
    var susNombres =            $("#nombres").val(field.nombres)
    var susApellidos =          $("#apellidos").val(field.apellidos)
    var suTipoDoc =             $("#tipoDoc").val(field.tipoDoc)
    var suPais =                $("#pais").val(field.pais)
    var suDepartamento =        $("#departamento").val(field.departamento)
    var suCiudad =              $("#ciudad").val(field.ciudad)
    var suFarmaceutica =        $("#farmaceutica").val(field.farmaceutica)
    var suDosis =               $("#dosis").val(field.dosis)
    var suFecha =               $("#fecha").val(field.fecha)
    var suPuestoVacunacion =    $("#puestoVacunacion").val(field.puestoVacunacion)
    //Showing results
    document.getElementById('suNombre').value = susNombres;
    document.getElementById('suApellido').value = susApellidos;
    document.getElementById('noDocumento_').value = documento;
    document.getElementById('elPais').value = suPais;    
    document.getElementById('elDepartamento').value = suDepartamento;
    document.getElementById('laCiudad').value = suCiudad;
    document.getElementById('laFarmaceutica').value = suFarmaceutica;
    document.getElementById('laFecha').value = suFecha
    document.getElementById('suPuestoVac').value = suPuestoVacunacion;
    //getting number of dosis:
    if(suDosis == "1") {
        document.getElementById('d1').style.backgroundColor="#10B4B7";
        document.getElementById('d1').style.color=white;
    } else if(suDosis == "2") {
        document.getElementById('d2').style.backgroundColor="#10B4B7";
        document.getElementById('d2').style.color=white;
    }else{
        document.getElementById('d3').style.backgroundColor="#10B4B7";
        document.getElementById('d3').style.color=white;
    }
    }) 
    })
    $('btnDelete').on('click', function () {
        if(confirm("¿Está seguro que desea eliminar este paciente?")) {
            $.ajax({
                url: 'http://localhost:9000/api/registroPaciente/'+$("#noDocumento").val(),
                method:"delete",
                headers: {
                    "Content-Type": "application/json"
                }
            }).done(function() {
                alert("Registro eliminado exitosamente.");
            })
    }
    })
