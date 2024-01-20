package place.ian.davos;

import org.springframework.stereotype.Component;

@Component
public class PSXGame implements Game {
    @Override
    public String getConsole() {
        return "PlayStation 1";
    }
    
}
