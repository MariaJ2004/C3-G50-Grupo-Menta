package com.misiontic.SistemaControlVacunacion.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.SistemaControlVacunacion.Model.registroPacienteModel;
import com.misiontic.SistemaControlVacunacion.Service.IregistroPacienteService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/registroPaciente")
public class registroPacienteController {
@Autowired 
private IregistroPacienteService serviceRP;
@GetMapping
public List<registroPacienteModel>all() {
	return serviceRP.all();
}
@GetMapping("{noDocumento}")
public Optional<registroPacienteModel>show(@PathVariable String noDocumento) {
	return serviceRP.findBynoDocumento(noDocumento);
}
@PostMapping
@ResponseStatus(code = HttpStatus.CREATED)
public registroPacienteModel update(@PathVariable String noDocumento, @RequestBody registroPacienteModel registroPacienteM) {
	Optional<registroPacienteModel> op = serviceRP.findBynoDocumento(noDocumento);
	if(!op.isEmpty()) {
		registroPacienteModel registroPacienteModelUpdate = op.get();
		registroPacienteModelUpdate.setNombres(registroPacienteM.getNombres());
		registroPacienteModelUpdate.setApellidos(registroPacienteM.getApellidos());
		registroPacienteModelUpdate.setTipoDoc(registroPacienteM.getTipoDoc());
		registroPacienteModelUpdate.setPais(registroPacienteM.getPais());
		registroPacienteModelUpdate.setDepartamento(registroPacienteM.getDepartamento());
		registroPacienteModelUpdate.setCiudad(registroPacienteM.getCiudad());
		registroPacienteModelUpdate.setFarmaceutica(registroPacienteM.getFarmaceutica());
		registroPacienteModelUpdate.setDosis(registroPacienteM.getDosis());
		registroPacienteModelUpdate.setFecha(registroPacienteM.getFecha());
		registroPacienteModelUpdate.setPuestoVacunacion(registroPacienteM.getPuestoVacunacion());
		return serviceRP.save(registroPacienteModelUpdate);
	}
	return registroPacienteM;
}
@DeleteMapping("{noDocumento}")
@ResponseStatus(code = HttpStatus.NO_CONTENT)
public void delete(@PathVariable String noDocumento) {
	serviceRP.delete(noDocumento);
}
}
