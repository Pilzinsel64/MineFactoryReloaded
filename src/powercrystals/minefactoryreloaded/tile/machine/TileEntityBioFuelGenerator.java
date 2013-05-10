package powercrystals.minefactoryreloaded.tile.machine;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import powercrystals.minefactoryreloaded.gui.client.GuiBioFuelGenerator;
import powercrystals.minefactoryreloaded.gui.client.GuiFactoryInventory;
import powercrystals.minefactoryreloaded.gui.container.ContainerBioFuelGenerator;
import powercrystals.minefactoryreloaded.tile.base.TileEntityLiquidGenerator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityBioFuelGenerator extends TileEntityLiquidGenerator
{
	public TileEntityBioFuelGenerator()
	{
		super(1, 160, 9);
	}
	
	@Override
	protected LiquidStack getLiquidType()
	{
		return LiquidDictionary.getLiquid("biofuel", 1);
	}
	
	@Override
	public int getSizeInventory()
	{
		return 0;
	}
	
	@Override
	public String getInvName()
	{
		return "BioFuel Generator";
	}
	
	@Override
	public String getGuiBackground()
	{
		return "biofuelgenerator.png";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public GuiFactoryInventory getGui(InventoryPlayer inventoryPlayer)
	{
		return new GuiBioFuelGenerator(getContainer(inventoryPlayer), this);
	}
	
	@Override
	public ContainerBioFuelGenerator getContainer(InventoryPlayer inventoryPlayer)
	{
		return new ContainerBioFuelGenerator(this, inventoryPlayer);
	}
}
