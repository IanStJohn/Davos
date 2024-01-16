package place.ian.davos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseRestController {
    @Value("${hello.world}")
    private String output;
    
    // expose "/" to return "Hello World"
    @GetMapping("/")
    public String hello() {
        return output;
    }
}
