import db.DBHelper;
import models.Piano;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.security.pkcs11.Secmod;

import static junit.framework.Assert.assertEquals;

public class TestPiano {

    Piano piano;


    @Before
    public void setUp() throws Exception {
        piano = new Piano("Yamaha", "Hot Pink", 1000, 1500);
        DBHelper.saveOrUpdate(piano);
    }

    @Test
    public void canSave() {
        Piano found = DBHelper.find(Piano.class, piano.getId());
        assertEquals("Yamaha", found.getManufacturer());
    }

    @Test
    public void canUpdate() {
        Piano found = DBHelper.find(Piano.class, piano.getId());
        assertEquals(piano.getId(), found.getId());
        found.setManufacturer("Steinway");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Piano.class, found.getId());
        assertEquals("Steinway", found.getManufacturer());
    }
}
