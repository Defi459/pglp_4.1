package uvsq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Personnel.
 */
public class PersonnelTest
{

    @Test
    public void PersonnelTest()
    {
        Personnel.Builder b;
        Personnel p;
        b = new Personnel.Builder("Longueville", "Edouard","Etudiant");
        b.addphone("0000");
        p = b.build();
        assertEquals("Longueville",p.getNom());
        assertEquals("Edouard",p.getPrenom());
        assertEquals("Etudiant",p.getFonction());
    }
}
