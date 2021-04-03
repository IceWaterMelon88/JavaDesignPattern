package memento;

import javax.crypto.Mac;

public class Memento {
    private MacroCommand state;

    public Memento(MacroCommand state) {
        this.state = state.clone();
    }

    public MacroCommand getSavedState(){
        return state;
    }
}
