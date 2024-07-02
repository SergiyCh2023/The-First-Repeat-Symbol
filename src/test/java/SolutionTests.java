
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    private Solution solution;

    @BeforeEach
    private void setup(){
        solution = new Solution();
    }

    @Test
    public void findFirstRepeatingSymbolsTest1(){
        char repeat = solution.findFirstNoRepeatingSymbols("abb");
        Assertions.assertEquals('b', repeat);
    }


    @Test
    public void findFirstRepeatingSymbolsTest2(){
        char repeat = solution.findFirstNoRepeatingSymbols("abcc");
        Assertions.assertEquals('c', repeat);
    }


    @Test
    public void findFirstRepeatingSymbolsTest3(){
        char repeat = solution.findFirstNoRepeatingSymbols("aabcc");
        Assertions.assertEquals('a', repeat);
    }


}
