package bankkata;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ClockShould {

    @Test
    public void
    return_todays_date_in_dd_MM_yyyy_format(){
        Clock clock = new TestableClock();

        String date = clock.todayDateAsString();

        assertThat(date, is("20/05/2016"));
    }

    private class TestableClock extends Clock {
        @Override
        protected LocalDate today() {
            return LocalDate.of(2016, 5, 20);
        }
    }
}