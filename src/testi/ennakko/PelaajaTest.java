package testi.ennakko;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class PelaajaTest {
    @org.junit.Test
    public void vari() throws Exception {

    }

    @org.junit.Test
    public void suora() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Pelaaja.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
