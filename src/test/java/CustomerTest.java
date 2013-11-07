import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CustomerTest {
    @Test
    public void statementTest() throws Exception {

        //given
        Customer customer = new Customer("Cherish");
        customer.addRental(new Rental(new Movie("movie one", 2),3));
        customer.addRental(new Rental(new Movie("movie two", 2),1));
        String resust1="Rental Record for Cherish\n\tmovie one\t1.5\n\tmovie two\t1.5\nAmount owed is 3.0\nYou earned 2 frequent renter points";
        //when
        String result = customer.statement();
       //then
        assertThat(result, is(resust1));
    }
}
