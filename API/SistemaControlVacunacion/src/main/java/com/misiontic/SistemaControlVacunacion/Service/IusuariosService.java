package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import com.misiontic.SistemaControlVacunacion.Model.usuariosModel;
public interface IusuariosService {
	public List<usuariosModel> all();
	public Optional<usuariosModel>findByusrname(String usrname);
	public usuariosModel save(usuariosModel usuariosM);
	public void delete(String usrname);

}
