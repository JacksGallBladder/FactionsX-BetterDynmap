package net.donut.fxbetterdynmap;

import net.prosavage.factionsx.command.engine.CommandInfo;
import net.prosavage.factionsx.command.engine.CommandRequirementsBuilder;
import net.prosavage.factionsx.command.engine.FCommand;
import net.prosavage.factionsx.core.BankAction;
import net.prosavage.factionsx.core.Faction;

public class DynmapColor extends FCommand {
    public DynmapColor() {
        getAliases().add("dynmapcolor");

        // The commandRequirements pre-check common things for you, the official way.
        // For example we could add #asFactionMember(true) if we want to make sure they're a faction member.
        // Here we do not want this executed in console, as the console cannot be teleported.
        this.commandRequirements = new CommandRequirementsBuilder()
                .asPlayer(true)
                .asLeader(true)
                .build();

    }

    public boolean execute(CommandInfo info) {
        info.message("executing dynmap color command, since you met the requirements.");
        EngineBetterDynmap dynEngine = EngineBetterDynmap.getInstance();
        dynEngine.init();
        return true;
    }

    /**
     * This is used by the command engine to tell a player what a command does in the help menu
     */
    public String getHelpInfo() {
        return Conf.dynmapColorHelpInfo;
    }
}
