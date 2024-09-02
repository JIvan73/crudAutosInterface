import java.util.List;

public interface Metodos {
	///////metodos del CRUD   funcion - retorna algo       ----------procedimiento no retorna nada
	
	public void guardar(Autos auto);
	
	public List<Autos> mostrar();
	
	public Autos buscar (int indice);
	
	public void editar (int indice, Autos auto);
	
	public void eliminar (int indice);
	
	

}
