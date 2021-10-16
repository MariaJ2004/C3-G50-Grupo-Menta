package com.misiontic.SistemaControlVacunacion.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misiontic.SistemaControlVacunacion.Model.usuariosModel;
import com.misiontic.SistemaControlVacunacion.Repository.Iusuarios;
@Service
public class usuariosService implements IusuariosService{
	@Autowired
	private Iusuarios repository;
	@Override
	public List<usuariosModel> all() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@Override
	public Optional<usuariosModel> findByusrname(String usrname) {
		// TODO Auto-generated method stub
		return this.repository.findByusrname(usrname);
	}

	@Override
	public usuariosModel save(usuariosModel usuariosM) {
		// TODO Auto-generated method stub
		return this.repository.save(usuariosM);
	}

	@Override
	public void delete(String usrname) {
		// TODO Auto-generated method stub
		this.repository.deleteById(usrname);
	}
	

}
