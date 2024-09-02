import java.util.ArrayList;
import java.util.List;

public class LogicaMetodos implements Metodos, Metodos2{
	/////////////LOGICA DE METODOS
	/////////Declarar lista
	
	List<Autos> lista = new ArrayList<Autos>();

	@Override
	public void guardar(Autos auto) {
		// TODO Auto-generated method stub
		lista.add(auto);
	}

	@Override
	public List<Autos> mostrar() {
		// TODO Auto-generated method stub
		
		return lista;
	}

	@Override
	public Autos buscar(int indice) {
		// TODO Auto-generated method stub
		
		Autos autoEncontrado = null;
		autoEncontrado = lista.get(indice);
		return autoEncontrado;
	}

	@Override
	public void editar(int indice, Autos auto) {
		// TODO Auto-generated method stub
		lista.set(indice, auto);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

	@Override
	public int tamanoLista() {
		// TODO Auto-generated method stub
		return lista.size();
	}
	

}
