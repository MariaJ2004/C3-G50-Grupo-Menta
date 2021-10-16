package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.SistemaControlVacunacion.Model.registroPacienteModel;
import com.misiontic.SistemaControlVacunacion.Repository.IregistroPaciente;
@Service
public class registroPacienteService  implements IregistroPacienteService{
@Autowired
private IregistroPaciente repository;

@Override
public List<registroPacienteModel> all() {
	// TODO Auto-generated method stub
	return this.repository.findAll();
}

@Override
public Optional<registroPacienteModel> findBynoDocumento(String noDocumento) {
	// TODO Auto-generated method stub
	return this.repository.findBynoDocumento(noDocumento);
}

@Override
public registroPacienteModel save(registroPacienteModel registroPacienteM) {
	// TODO Auto-generated method stub
	return this.repository.save(registroPacienteM);
}

@Override
public void delete(String noDocumento) {
	// TODO Auto-generated method stub
	this.repository.deleteById(noDocumento);
}
}
