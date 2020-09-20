package dev.lootjes.miroga.worldgen;

import net.minecraft.client.world.GeneratorType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.*;

import java.util.Collections;
import java.util.Optional;

public class MazeGeneratorType {
    protected static final GeneratorType VOID = new GeneratorType("void") {
        protected ChunkGenerator getChunkGenerator(Registry<Biome> biomeRegistry,
                                                   Registry<ChunkGeneratorSettings> chunkGeneratorSettingsRegistry, long seed) {
            FlatChunkGeneratorConfig config = new FlatChunkGeneratorConfig(
                    new StructuresConfig(Optional.empty(), Collections.emptyMap()), biomeRegistry);
            config.updateLayerBlocks();
            return new FlatChunkGenerator(config);
        }
    };
}
