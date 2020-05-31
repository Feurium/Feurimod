package fr.luky.feurimod.blocks.tileentity;

import fr.luky.feurimod.energy.FeurinergyStorage;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;

import javax.annotation.Nullable;

public class TileEntityFeurinergy extends TileEntity implements ITickable {

    private FeurinergyStorage storage = new FeurinergyStorage(10000);

    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY) return (T)this.storage;
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY) return true;
        return super.hasCapability(capability, facing);
    }

    @Override
    public void update() {
        this.storage.receiveEnergy(100, false);
        this.storage.extractEnergy(200, false);

    }
}
