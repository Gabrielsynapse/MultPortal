package singelagames.java.multPortal;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

public class MpManager {
    private static class RegisterMP{
        public JavaPlugin javaPlugin;
        public ListennerMP listennerMP;
    }
    private static final ArrayList<RegisterMP> events = new ArrayList<>();
    public static void registerEvents(ListennerMP listennerMP, JavaPlugin javaPlugin){
        RegisterMP registerMP = new RegisterMP();
        registerMP.javaPlugin = javaPlugin;
        registerMP.listennerMP = listennerMP;
        events.add(registerMP);
    }
}
