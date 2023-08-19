package co.edu.usbcali.tiendaApp.service;

import co.edu.usbcali.tiendaApp.request.CrearCategoriaRequest;
import co.edu.usbcali.tiendaApp.response.CrearCategoriaResponse;

import java.util.List;

public interface CategoriaService {
    List<CategoriaDTO> obtenerTodos();

    CategoriaDTO buscarPorId(Integer id) throws Exception;

    Categoria buscarCategoriaPorId(Integer id) throws Exception;

    CategoriaDTO guardar(CategoriaDTO categoriaDTO) throws Exception;




}
