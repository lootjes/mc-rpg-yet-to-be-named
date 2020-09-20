package dev.lootjes.miroga.scoreboard;

import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.scoreboard.ScoreboardObjective;

public class StatScores {

    public static ScoreboardObjective UNDEAD_DAMAGE = new ScoreboardObjective(Scoreboards.damagestats, "undead", ScoreboardCriterion.DUMMY, null, ScoreboardCriterion.RenderType.INTEGER);
    public static ScoreboardObjective UNDEAD_DEFENCE = new ScoreboardObjective(Scoreboards.defencestats, "undead", ScoreboardCriterion.DUMMY, null, ScoreboardCriterion.RenderType.INTEGER);

}
