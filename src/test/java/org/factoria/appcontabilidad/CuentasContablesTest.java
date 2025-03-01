package org.factoria.appcontabilidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuentasContablesTest {

    @Test
    public void devuelve_el_nombre_de_una_cuenta() {
        CuentaContable c = new CuentaContable();

        assertEquals("PROVISIONES PARA RIESGOS Y GASTOS",
                c.nombreDeCuenta(14));
        assertEquals("OBLIGACIONES Y BONOS",
                c.nombreDeCuenta(150));
        assertEquals("PROVISIÓN PARA RESPONSABILIDADES",
                c.nombreDeCuenta(142));
        assertEquals("MERCADERIAS",
                c.nombreDeCuenta(300));
    }

    @Test
    public void devuelveelid(){
        CuentaContable c = new CuentaContable();
        assertEquals(14, c.id("PROVISIONES PARA RIESGOS Y GASTOS"));
        assertEquals(142, c.id("PROVISIÓN PARA RESPONSABILIDADES"));
        assertEquals(150, c.id("OBLIGACIONES Y BONOS"));
        assertEquals(300, c.id("MERCADERIAS"));
    }
}
