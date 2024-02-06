package ej47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
	
	private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	protected LocalDateTime fechaCreacion;
	protected LocalDateTime fechaModificacion;
	protected Cliente cliente;
	protected List<Articulo> listaArticulos;
	
	public CarritoCompra(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDateTime.now();
		fechaModificacion = LocalDateTime.now();
		listaArticulos = new ArrayList<>();
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	
	public Integer getTotal() {
		Integer total = 0;
		for (Articulo articulo : listaArticulos) {
			total += articulo.getPrecio();
		}
		return total;
	}
	
	public Integer getPrecioMedio() {
		if(!listaArticulos.isEmpty()) {
			Integer precio = this.getTotal();
			Integer cant = this.getCantidad();
			return (precio / cant);
		}
		
		return null;
		
	}

	@Override
	public String toString() {
		return cliente + " Cantidad de artículos: " + this.getCantidad() +" Precio total: "+ this.getTotal() + " Fecha modificación: " + FORMATO.format(fechaModificacion);
	}
	
	public void addArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
		fechaModificacion = LocalDateTime.now();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void borrarArticulo(Integer a){
		listaArticulos.remove(a);
		fechaModificacion = LocalDateTime.now();
	}
	
	public void vaciarCesta() {
		listaArticulos.clear();
		fechaModificacion = LocalDateTime.now();
	}
	
	

	
}
