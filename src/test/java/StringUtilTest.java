import com.existmaster.study.StringUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by existmaster on 2015. 12. 6..
 */
public class StringUtilTest {

    private StringUtil stringUtil;

    @Before
    public void setUp() throws Exception {
        stringUtil = new StringUtil();

    }

    @Test
    public void inputvalue(){
        assertEquals("0012", stringUtil.convertIntToString(12, 4));
        assertEquals("00000350", stringUtil.convertIntToString(350, 8));
    }

    @Test
    public void InputWrongValue(){
        wrongValueCheck(350, 2);
    }

    private void wrongValueCheck(int value, int digit) {
        try{
            stringUtil.convertIntToString(value, digit);
            fail();
        }catch (IllegalArgumentException e){
            return;
        }

    }

}
