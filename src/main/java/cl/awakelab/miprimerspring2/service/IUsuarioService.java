package cl.awakelab.miprimerspring2.service;

import cl.awakelab.miprimerspring2.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioId(int idUsuario);
    Usuario actualizarUsuario(Usuario usuarioActualizar, int idUsuario);
    Usuario actualizarUsuario2(Usuario usuarioActualizar);
    void eliminarUsuario(int idUsuario);
}
