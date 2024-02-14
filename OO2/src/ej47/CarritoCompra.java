package ej47;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class CarritoCompra {
	
	private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	protected LocalDateTime fechaCreacion;
	protected LocalDateTime fechaModificacion;
	protected Cliente cliente;
	protected Set<Articulo> listaArticulos;
	
	public CarritoCompra(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDateTime.now();
		fechaModificacion = LocalDateTime.now();
		listaArticulos = new HashSet<>();
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

	public Set<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	
	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Articulo articulo : listaArticulos) {
			total.add(articulo.getPrecio());
		}
		return total;
	}
	
	public BigDecimal getPrecioMedio() {
		if(!listaArticulos.isEmpty()) {
			BigDecimal precio = this.getTotal();
			BigDecimal cant = new BigDecimal(this.getCantidad());
			return precio.divide(cant, 2, RoundingMode.HALF_DOWN);
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
	public void borrarArticulo(Integer a){ //Para listas
		listaArticulos.remove(a);
		fechaModificacion = LocalDateTime.now();
	}
	
	public void borrarArticulo(Articulo articulo) { //Para sets
		listaArticulos.remove(articulo);
		fechaModificacion = LocalDateTime.now();
	}
	
	public void vaciarCesta() {
		listaArticulos.clear();
		fechaModificacion = LocalDateTime.now();
	}
	
	

	
}
