package dev.lootjes.miroga.worldgen;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.Heightmap;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.StructuresConfig;

import java.util.Random;

public class MazeChunkGenerator extends ChunkGenerator {
    public MazeChunkGenerator(BiomeSource biomeSource, StructuresConfig structuresConfig) {
        super(biomeSource, structuresConfig);
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return null;
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return null;
    }

    @Override
    public void buildSurface(ChunkRegion region, Chunk chunk) {
    }

    @Override
    public void populateNoise(WorldAccess world, StructureAccessor accessor, Chunk chunk) {
    }

    @Override
    public int getHeight(int x, int z, Heightmap.Type heightmapType) {
        return 0;
    }

    @Override
    public BlockView getColumnSample(int x, int z) {
        return null;
    }
}
