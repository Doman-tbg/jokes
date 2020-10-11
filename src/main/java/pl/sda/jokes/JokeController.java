package pl.sda.jokes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class JokeController {

    private final JokeRepository jokeRepository;

    @GetMapping
    public String allJokes(Model model){
        model.addAttribute ( "jokes", jokeRepository.getAll());
        return "alljokes";
    }


    @GetMapping("/joke")
    public String joke(Model model){
        String randomJoke = jokeRepository.getRandomJoke ();
        log.info(randomJoke);
        model.addAttribute ("joke", randomJoke);
        return "joke";
    }
    @PostMapping("/joke")
    public String addJoke( @RequestParam String newJoke ){
        jokeRepository.add(newJoke);
        log.info("Jokes in repe {}", jokeRepository.jokesCount());
        return "redirect:/joke";
    }

}
