package place.ian.davos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BaseRestController {
    @Value("${hello.world}")
    private String output;
    
    // expose "/" to return "Hello World"
    @GetMapping("/")
    public String hello() {
        return output;
    }

    @GetMapping("/workout")
    public String workout() {
        return "Workout";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "Today is your lucky day.";
    }

    private Game myGame;

    @Autowired
    public BaseRestController(Game theGame) {
        myGame = theGame;
    }

    @GetMapping("/games/psx")
    public String getGame() {
        return myGame.getConsole();
    }
    
}
