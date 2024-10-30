import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    @BeforeAll
    static void setupAll() {
        System.out.println("Ejecutando @BeforeAll ");
        Cuenta cuenta1 = new Cuenta("elpep", "12", 120);
        Cuenta cuenta2 = new Cuenta("etesech", "120", 1000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        Banco banco =new Banco(cuentas);
    }


    @org.junit.jupiter.api.Test
    void depositarTest() {
//no me dio el tiempo :(
    }

    @org.junit.jupiter.api.Test
    void retirar() {
    }

    @org.junit.jupiter.api.Test
    void existecuenta () {
    assertTrue(true);
    }
    @org.junit.jupiter.api.Test
    void existecuentaFallido () {
        assertTrue(false);
    }
}