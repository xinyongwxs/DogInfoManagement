package doubler.impl;

import management.web.service.Doubler;
import management.web.service.impl.DoublerImpl;

import org.junit.Test;

public class DoublerImplTest {
    
    @Test
    public void testIt() {
        Doubler doubler = new DoublerImpl();
        assert doubler.doubleIt(2) == 4;
    }
}
