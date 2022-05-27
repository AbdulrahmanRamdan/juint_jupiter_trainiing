package juinttest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class training {
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void parametermethod(int param){
        System.out.println(param);
    }
    @ParameterizedTest
    @CsvSource(value = {"1,2","3,4","5,6"})
    void str(String param1,String param2){
        System.out.println(param1+" : "+param2);
    }
}
