package co.edu.usbcali.tiendaApp.controller;

import co.edu.usbcali.tiendaApp.domain.TipoDocumento;
import co.edu.usbcali.tiendaApp.dto.TipoDocumentoDTO;
import co.edu.usbcali.tiendaApp.repository.TipoDocumentoRepository;
import co.edu.usbcali.tiendaApp.service.TipoDocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/tipodocumento")
public class InventarioController {

    public InventarioController(){

        this.inventario = InventarioService;
    }
}
