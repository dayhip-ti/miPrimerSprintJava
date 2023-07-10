package cl.awakelab.miprimerspring2.service.serviceimpl;

import cl.awakelab.miprimerspring2.entity.Usuario;
import cl.awakelab.miprimerspring2.repository.IUsuarioRepository;
import cl.awakelab.miprimerspring2.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("usuarioImpl")
public class UsuarioImpl implements IUsuarioService {
    @Autowired
    IUsuarioRepository objUsuarioRepo;
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return objUsuarioRepo.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return objUsuarioRepo.findAll();
    }

    @Override
    public Usuario buscarUsuarioId(int idUsuario) {
        return objUsuarioRepo.findById(idUsuario).orElseThrow(()->new NoSuchElementException("Usuario no Encontrado"));
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuarioActualizar,int idUsuario) {
        Usuario usuario = objUsuarioRepo.findById(idUsuario).orElseThrow(()->new NoSuchElementException("No se encontro el Usuario"));
        usuario.setRut(usuarioActualizar.getRut());
        usuario.setContrasenia(usuarioActualizar.getContrasenia());
        usuario.setPerfil(usuarioActualizar.getPerfil());
        return objUsuarioRepo.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario2(Usuario usuarioActualizar) {
        Usuario usuario = objUsuarioRepo.findById(usuarioActualizar.getIdUsuario()).orElseThrow(()->new NoSuchElementException("No se encontro el Usuario"));
        return objUsuarioRepo.save(usuarioActualizar);
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        objUsuarioRepo.deleteById(idUsuario);
    }

    @Override
    public void eliminarUsuario2(Usuario usuario) {
        objUsuarioRepo.delete(usuario);
    }
}
