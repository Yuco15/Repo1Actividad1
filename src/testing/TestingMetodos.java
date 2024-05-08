package testing;

import ana.Ana;
import andres.Andres;
import bryan.Bryan;
import pedro.Pedro;

public class TestingMetodos {

	public static void main(String[] args) {
		Ana ana = new Ana(); 
		ana.LlamarPersona();
		
		Andres andres = new Andres();
		andres.llamarPersona();
		
		Bryan bryan = new Bryan();
		bryan.llamar_persona();
		
		Pedro pedro = new Pedro();
		pedro.llamar_persona();
		
		
	}
}
