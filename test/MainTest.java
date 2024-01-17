import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void filtrarMulheresTest() {
        List<Pessoa> listaPessoas = new ArrayList<>(Arrays.asList(
                new Pessoa("Maria", "F"),
                new Pessoa("João", "M"),
                new Pessoa("Ana", "F")
        ));

        List<String> listaMulheres = Main.filtrarMulheres(listaPessoas);

        List<String> listaBase = new ArrayList<>(Arrays.asList("Maria", "Ana"));

        Assert.assertEquals("As listas não são iguais", listaBase, listaMulheres);
    }
}
