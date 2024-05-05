import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Square_Perimeter_Test {

    @Test
    void getPerimeter() {
        Square r2=new Square();
        assertEquals(r2.getPerimeter(10,10),40);
    }
}