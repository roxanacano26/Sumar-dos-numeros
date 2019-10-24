import org.junit.Assert;
import org.junit.Test;

public class TestSumarNumeros {

    @Test
     public void testQueDosNumerosSeSumen(){
        SumarDosNumeros calculadora=new SumarDosNumeros();
        Integer actual=calculadora.sumarDosNumeros(1,2);
        Integer esperado=3;
        Assert.assertEquals(esperado,actual);

        

    }

    @Test
    public  void testQueDonNumerosSeSumenMal(){
        SumarDosNumeros calculadora=new SumarDosNumeros();
        Integer actual=calculadora.sumarDosNumeros(1,2);
        Integer esperado=2;

        Assert.assertEquals(esperado,actual);
    }
}
