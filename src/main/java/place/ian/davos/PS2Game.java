package place.ian.davos;

import org.springframework.stereotype.Component;

@Component
public class PS2Game implements Game {
    @Override
    public String getConsole() {
        return "PlayStation 2";
    }
    
}
