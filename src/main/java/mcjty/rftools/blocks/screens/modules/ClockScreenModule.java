package mcjty.rftools.blocks.screens.modules;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ClockScreenModule implements ScreenModule {

    public static final int RFPERTICK = 1;

    @Override
    public Object[] getData(long millis) {
        return null;
    }

    @Override
    public void setupFromNBT(NBTTagCompound tagCompound, int dim, int x, int y, int z) {

    }

    @Override
    public int getRfPerTick() {
        return RFPERTICK;
    }

    @Override
    public void mouseClick(World world, int x, int y, boolean clicked) {

    }
}
