
public class ArrayClientes
{
  	private Cliente[] clientes;
	private int quantidade;
	
	public ArrayClientes(int x) {
		Cliente[] a = new Cliente[x];
		this.clientes = a;
	}
	public int getQuantidade() {
		return quantidade;
	}  
	public boolean adicionaCliente(Cliente a) {
		boolean result = false;
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				clientes[i] = a;
				result = true;
				quantidade++;
				break;
			}
			else if (a == null) {
				result = false;
			}
		}
		return result;
	}
	public Cliente buscaPorld(int id) {
		for(int i = 0; i< clientes.length; i++) {
		    Cliente[] a = new Cliente[clientes.length];
			if(clientes[i].getId() == id) {
				clientes[i] = a[i];
				break;
			}
			else {
				clientes[i];
			}
		}
	}
	
		
	
}
