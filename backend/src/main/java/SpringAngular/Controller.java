package SpringAngular;

import org.springframework.web.bind.annotation.*;

@RestController @CrossOrigin
@RequestMapping("api")
public class Controller {

    @RequestMapping("/")
    public Hello helloWorld() {
        return new Hello("Hello World from Api!");
    }

    @GetMapping("/{name}")
    public Hello helloWorld(@PathVariable String name) {
        return new Hello("Hello " + name);
    }
    /* ...
    Your other methods
    */
}
