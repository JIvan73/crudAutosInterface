
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Coleccion de objetos
		
		///////SE AGREGAN PRUEBAS EN CLASE PRINCIPAL
		
		
		
		Autos auto1 = new Autos(1234, "Mazda", "gt1", 100000000);
		Autos auto2 = new Autos(456, "bmw", "atb", 500000000);
		Autos auto3 = new Autos(987, "Audi", "opj", 30000000);
		
		////Instancia de clase --- Ya se tiene acceso a todo lo que contenga la clase
		LogicaMetodos imp = new LogicaMetodos();
		
		///Guardar
		imp.guardar(auto1);
		imp.guardar(auto2);
		imp.guardar(auto3);
		
		////////////Mostrar
		System.out.println(imp.mostrar());
		
		//////Buscar
		Autos autoEn = imp.buscar(1);
		System.out.println("Es: "+ autoEn);
		
		
		/////Editar
		autoEn.setModelo("Corolla  ");
		imp.editar(1, autoEn);
		/////Muestra
		System.out.println(imp.mostrar());
		
		
		
		//////eliminar
		imp.eliminar(0);
		
		System.out.println(imp.mostrar());
		
		
		///////////////Contar
		System.out.println(imp.tamanoLista());
		

	}

}
