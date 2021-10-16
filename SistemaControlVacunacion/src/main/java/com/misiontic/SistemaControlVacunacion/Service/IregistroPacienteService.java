package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;

import com.misiontic.SistemaControlVacunacion.Model.registroPacienteModel;
public interface IregistroPacienteService {
	public List<registroPacienteModel> all();
	public Optional<registroPacienteModel>findBynoDocumento(String noDocumento);
	public registroPacienteModel save(registroPacienteModel registroPacienteM);
	public void delete(String noDocumento);
	

}
