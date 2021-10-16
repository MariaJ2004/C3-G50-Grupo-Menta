package com.misiontic.SistemaControlVacunacion.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic.SistemaControlVacunacion.Model.usuariosModel;
public interface Iusuarios  extends JpaRepository<usuariosModel,String>{
Optional<usuariosModel> findByusrname(String usrname);

}
