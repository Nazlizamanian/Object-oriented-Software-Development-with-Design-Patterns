// EncryptionEngineTest
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncryptionEngineTest {
   public EncryptionEngineTest() {
   }

   @Before
   public void setUp() throws Exception {
   }

   @Test
   public void testEncrypt() {
      Controller controller = null;
      EncryptionEngine e = new EncryptionEngine((Controller)controller);
      e.setEncryptionKey(3);
      Assert.assertEquals(e.encrypt("ABC"), "DEF");
      Assert.assertEquals(e.encrypt("XYZ"), "ABC");
   }

   @Test
   public void testDecrypt() {
      Controller controller = null;
      EncryptionEngine e = new EncryptionEngine((Controller)controller);
      e.setEncryptionKey(3);
      Assert.assertEquals(e.decrypt("KHM"), "HEJ");
      Assert.assertEquals(e.decrypt("DEF"), "ABC");
   }
}
