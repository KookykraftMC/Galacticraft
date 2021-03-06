package micdoodle8.mods.galacticraft.core.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.entities.player.IPlayerServer;
import micdoodle8.mods.galacticraft.core.entities.player.PlayerServer;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommonProxyCore
{
    public IPlayerServer player = new PlayerServer();

    public void preInit(FMLPreInitializationEvent event)
    {
    }

    public void registerVariants()
    {

    }

    public void init(FMLInitializationEvent event)
    {
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    }

    public int getBlockRender(Block blockID)
    {
        return 3;
    }

    public World getClientWorld()
    {
        return null;
    }

    public void spawnParticle(String particleID, Vector3 position, Vector3 motion, Object[] otherInfo)
    {
    }

    public World getWorldForID(int dimensionID)
    {
        MinecraftServer theServer = FMLCommonHandler.instance().getMinecraftServerInstance(); 
    	if (theServer == null) return null;
    	return theServer.worldServerForDimension(dimensionID);
    }

    public EntityPlayer getPlayerFromNetHandler(INetHandler handler)
    {
        if (handler instanceof NetHandlerPlayServer)
        {
            return ((NetHandlerPlayServer) handler).playerEntity;
        }
        else
        {
            return null;
        }
    }

    public void postRegisterBlock(Block block) { }

    public void postRegisterItem(Item item) { }
}
