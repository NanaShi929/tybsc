import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Square_Area_Test {

    @Test
    void getArea() {
        Square r1=new Square();
        assertEquals(r1.getArea(10,10),100);
    }

}