package ar.edu.untref.simuladordegases;

import ar.edu.untref.simuladordegases.implementacion.Contenedor;
import ar.edu.untref.simuladordegases.implementacion.Particula;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by synysterlove on 23/09/16.
 */
public class ParticulaTest {

    private Particula particula;
    private Contenedor contenedor;



    @Before
    public void inicializar() {

        this.contenedor = new Contenedor();
        this.particula = new Particula(contenedor,1,1,1);

    }

    @Test
    public void testCrearParticula() {

        Assert.assertNotNull(this.particula);

    }

    @Test
    public void testQueLaParticulaSeCreeConPosicionDefaultCeroCero() {

        Assert.assertEquals(0, this.particula.getXPosicion(), 0.0);
        Assert.assertEquals(0, this.particula.getYPosicion(), 0.0);
    }

    @Test
    public void testQueLaParticulaSeCreeConAltoYAnchoDefault10() {

        Assert.assertEquals(10, this.particula.getAncho());
        Assert.assertEquals(10, this.particula.getAlto());
    }

    @Test
    public void testQueLaParticulaSeCreeConVelocidadDefault1() {

        Assert.assertEquals(1, this.particula.getVelocidad(), 0.0);

    }

    @Test
    public void testQueLaParticulaSeCreeConMovimientoEnXDefault1() {

        Assert.assertEquals(1, this.particula.getMovimientoX(), 0.0);

    }

    @Test
    public void testQueLaParticulaSeCreeConMovimientoEnYDefault1() {

        Assert.assertEquals(1, this.particula.getMovimientoY(), 0.0);

    }

    @Test
    public void testQueSeMueva1AlEsteSinChocar() {

        this.contenedor.setAncho(200);
        this.contenedor.setAlto(200);
        this.particula.modificarMovimiento(1,0);
        this.particula.mover();
        Assert.assertEquals(1, this.particula.getXPosicion(), 0.0);

    }

    @Test
    public void testQueSeMueva1AlOesteSinChocar() {

        this.contenedor.setAncho(200);
        this.contenedor.setAlto(200);
        this.particula.setXPosicion(2);
        this.particula.modificarMovimiento(-1,0);
        this.particula.mover();
        Assert.assertEquals(1, this.particula.getXPosicion(), 0.0);

    }

    @Test
    public void testQueSeMueva1AlNorteSinChocar() {

        this.contenedor.setAncho(200);
        this.contenedor.setAlto(200);
        this.particula.modificarMovimiento(0,1);
        this.particula.mover();
        Assert.assertEquals(1, particula.getYPosicion(), 0.0);

    }

    @Test
    public void testQueSeMueva1AlSurSinChocar() {

        this.contenedor.setAncho(200);
        this.contenedor.setAlto(200);
        this.particula.setYPosicion(2);
        this.particula.modificarMovimiento(0,-1);
        this.particula.mover();
        Assert.assertEquals(1, particula.getYPosicion(), 0.0);

    }

    
}
