package singelagames.java.multPortal;

import org.bukkit.entity.Player;

public abstract class MpEvent {
    private boolean cancelable = false;

    //metodos getters
    public boolean isCancelable(){
        return cancelable;
    }
    //metodos setters
    public void setCancelable(boolean cancelable){
        this.cancelable = cancelable;
    }
    public Player getPlayer(){
        return null;
    }
}
