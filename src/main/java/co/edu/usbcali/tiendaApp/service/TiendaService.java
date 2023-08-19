package co.edu.usbcali.tiendaApp.service;


import co.edu.usbcali.tiendaApp.response.CrearCategoriaResponse;

import java.util.List;

public interface TiendaService {
    List<CategoriaDTO> obtenerTodos();

    public String eliminarById(Integer id) throws Exception;

    List<CategoriaDTO> buscarPorNombreLike(String nombre) throws Exception;

    CrearCategoriaResponse crearCategoria(CrearCategoriaRequest crearCategoriaRequest) throws Exception;
}



