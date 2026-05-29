package com.victor.completedblocksets.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WeatheringCopperPressurePlateBlock extends PressurePlateBlock implements WeatheringCopper
{
    private BlockSetType type() { return this.type; }

    private final WeatheringCopper.WeatherState weatherState;

    public WeatheringCopperPressurePlateBlock(final BlockSetType type, final WeatherState weatherState, final Properties properties)
    {
        super(type, properties);
        this.weatherState = weatherState;
    }

    @Override
    public void randomTick(final BlockState state, final ServerLevel level, final BlockPos pos, final RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(final BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatheringCopper.WeatherState getAge() { return this.weatherState; }
}
