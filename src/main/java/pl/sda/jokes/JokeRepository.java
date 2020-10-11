package pl.sda.jokes;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Random;

@Controller
public class JokeRepository {

    private final Random RANDOM = new Random (  );
    private final List<String> jokes = ArrayList<>(List.of("abc", "def"))

            public String getRandomJoke(){
        return jokes.get ( RANDOM.nextInt( jokes.size ()));
            }

            public String add ( String newJoke ) {
                jokes.add(joke);
                return getRandomJoke ();
            }

            public int jokesCount(){
                return
            }

            public String getAll(){
                System.out.println ( );
            }
}
