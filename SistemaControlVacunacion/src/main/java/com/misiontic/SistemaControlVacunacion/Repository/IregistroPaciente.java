package com.misiontic.SistemaControlVacunacion.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.SistemaControlVacunacion.Model.registroPacienteModel;
public interface IregistroPaciente extends JpaRepository<registroPacienteModel,String>{
Optional<registroPacienteModel> findBynoDocumento(String noDocumento);

}
