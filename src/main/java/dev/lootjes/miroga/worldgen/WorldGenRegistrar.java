package dev.lootjes.miroga.worldgen;

import dev.lootjes.miroga.mixin.GeneratorTypeAccessor;
import dev.lootjes.miroga.worldgen.MazeGeneratorType;

public class WorldGenRegistrar {
    public static void register(){
        GeneratorTypeAccessor.getValues().add(MazeGeneratorType.VOID);
    }
}
