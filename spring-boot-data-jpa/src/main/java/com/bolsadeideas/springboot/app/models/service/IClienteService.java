package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.entity.Producto;

public interface IClienteService {

	public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);

	public List<Producto> findByNombre(String term);

	public void saveFactura(Factura factura);

	public Producto findProductoById(Long id);

	public  Factura findFacturaById(long id);

	public void deleteFactura(long id);

}