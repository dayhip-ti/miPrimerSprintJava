package cl.awakelab.miprimerspring2.controller;

import cl.awakelab.miprimerspring2.entity.Usuario;
import cl.awakelab.miprimerspring2.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario") //redireccion para la clase Usuario
public class UsuarioController {
    @Autowired
    IUsuarioService objUsuarioService;
    @PostMapping //tipo de request  --- envia informacion
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return objUsuarioService.crearUsuario(usuario);
    }
    @GetMapping("/{idUsuario}") //trae informacion
    public Usuario buscarUsuarioPorId(@PathVariable int idUsuario){
        return objUsuarioService.buscarUsuarioId(idUsuario);
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return objUsuarioService.listarUsuario();
    }
    @PutMapping("/{idUsuario}")
    public Usuario actualizarusuario(@RequestBody Usuario usuarioActualizar, int idUsuario){
        return objUsuarioService.actualizarUsuario(usuarioActualizar,idUsuario);
    }
    @PutMapping //Put se usa para actualizar
    public Usuario actualizarusuario(@RequestBody Usuario usuarioActualizar){
        return objUsuarioService.actualizarUsuario2(usuarioActualizar);
    }

    @DeleteMapping("/{idUsuario}")  //Delete se usa para eliminar
    public void eliminarUsuario(int idUsuario){
        objUsuarioService.eliminarUsuario(idUsuario);
    }
    @DeleteMapping
    public void eliminarUsuario(@RequestBody Usuario usuario){
        objUsuarioService.actualizarUsuario2(usuario);
    }
}
