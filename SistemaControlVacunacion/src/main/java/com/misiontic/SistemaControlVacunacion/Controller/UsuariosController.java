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
import com.misiontic.SistemaControlVacunacion.Model.usuariosModel;
import com.misiontic.SistemaControlVacunacion.Service.IusuariosService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {
@Autowired
private IusuariosService serviceUS;
public List<usuariosModel>all() {
	return serviceUS.all();
}
@GetMapping("{usrname}")
public Optional<usuariosModel>show(@PathVariable String usrname) {
	return serviceUS.findByusrname(usrname);
}
@PostMapping
@ResponseStatus(code = HttpStatus.CREATED)
public usuariosModel update(@PathVariable String usrname, @RequestBody usuariosModel usuariosM) {
Optional<usuariosModel> op = serviceUS.findByusrname(usrname);
if(!op.isEmpty()) {
	usuariosModel UsuariosModelUpdate = op.get();
	UsuariosModelUpdate.setPasswrd(usuariosM.getPasswrd());
	return serviceUS.save(UsuariosModelUpdate);
}
return usuariosM;
}
@DeleteMapping("{usrname}")
@ResponseStatus(code = HttpStatus.NO_CONTENT)
public void delete(@PathVariable String usrname) {
	serviceUS.delete(usrname);
}
}