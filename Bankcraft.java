package bashful.bankcraft;

//Let the imports BEGIN!
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler; 
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import bashful.bankcraft.blocks.*;
import bashful.bankcraft.items.*;


@Mod(modid="Bankcraft", name="Bankcraft", version="0.0.1")
@NetworkMod(clientSideRequired=true)
public class Bankcraft {
	public static Block ATM = new ATM(2550, Material.rock);
	public static Block SafeDoorLocked = new SafeDoorLocked(2551, Material.rock);
	public static Block SafeDoorOpen = new SafeDoorOpen(2552, Material.rock);
	public static Block Mint = new Mint(2553, Material.rock);
	public static Block PiggyBank = new PiggyBank(2554, Material.rock);
	public static Block Print = new Print(2555, Material.rock);
	public static Block CashRegister = new CashRegister(2556, Material.rock);
	public static Item CreditCard = new CreditCard(2557).setTextureName("m3:IronPanel");
	public static Item FiftycCoin = new FiftycCoin(2558).setTextureName("m3:IronPanel");
	public static Item FiftydNote = new FiftydNote(2559).setTextureName("m3:IronPanel");
	public static Item FivecCoin = new FivecCoin(2560).setTextureName("m3:IronPanel");
	public static Item FivedNote = new FivedNote(2561).setTextureName("m3:IronPanel");
	public static Item HundreddNote = new HundreddNote(2562).setTextureName("m3:IronPanel");
	public static Item OnecCoin = new OnecCoin(2563).setTextureName("m3:IronPanel");
	public static Item OnedNote = new OnedNote(2564).setTextureName("m3:IronPanel");
	public static Item SafeDoor = new SafeDoor(2565).setTextureName("m3:IronPanel");
	public static Item TencCoin = new TencCoin(2566).setTextureName("m3:IronPanel");
	public static Item TendNote = new TendNote(2567).setTextureName("m3:IronPanel");
	public static Item TwentycCoin = new TwentycCoin(2568).setTextureName("m3:IronPanel");
	public static Item TwentydNote = new TwentydNote(2569).setTextureName("m3:IronPanel");
	public static Item TwocCoin = new TwocCoin(2570).setTextureName("m3:IronPanel");
	
	
        // The instance of your mod that Forge uses.
        @Instance(value = "Bankcraft")
        public static Bankcraft instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="bashful.bankcraft.client.ClientProxy", serverSide="bashful.bankcraft.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                GameRegistry.registerBlock(ATM, "ATM"); LanguageRegistry.addName(ATM, "ATM");
                GameRegistry.registerBlock(SafeDoorLocked, "SafeDoorLocked"); LanguageRegistry.addName(SafeDoorLocked, "Safe Door Locked");
                GameRegistry.registerBlock(SafeDoorOpen, "SafeDoorOpen"); LanguageRegistry.addName(SafeDoorOpen, "Safe Door Open");
                GameRegistry.registerBlock(Mint, "Mint"); LanguageRegistry.addName(Mint, "Mint");
                GameRegistry.registerBlock(PiggyBank, "PiggyBank"); LanguageRegistry.addName(PiggyBank, "Piggy Bank");
                GameRegistry.registerBlock(Print, "Print"); LanguageRegistry.addName(Print, "Money Printing Machine");
                GameRegistry.registerBlock(CashRegister, "CashRegister"); LanguageRegistry.addName(CashRegister, "Cash Register");
                
                GameRegistry.registerItem(CreditCard, "CreditCard"); LanguageRegistry.addName(CreditCard, "CreditCard");
                GameRegistry.registerItem(FiftycCoin, "FiftycCoin"); LanguageRegistry.addName(FiftycCoin, "Fifty Cent Coin");
                GameRegistry.registerItem(FiftydNote, "FiftydNote"); LanguageRegistry.addName(FiftydNote, "Fifty Dollar Note");
                GameRegistry.registerItem(FivecCoin, "FivecCoin"); LanguageRegistry.addName(FivecCoin, "Five Cent Coin");
                GameRegistry.registerItem(FivedNote, "FivedNote"); LanguageRegistry.addName(FivedNote, "Five Dollar Note");
                GameRegistry.registerItem(HundreddNote, "HundreddNote"); LanguageRegistry.addName(HundreddNote, "One Hundred Dollar Note");
                GameRegistry.registerItem(OnecCoin, "OnecCoin"); LanguageRegistry.addName(OnecCoin, "One Cent Coin");
                GameRegistry.registerItem(OnedNote, "OnedNote"); LanguageRegistry.addName(OnedNote, "One Dollar Note");
                GameRegistry.registerItem(SafeDoor, "SafeDoor"); LanguageRegistry.addName(SafeDoor, "Safe Door");
                GameRegistry.registerItem(TencCoin, "TencCoin"); LanguageRegistry.addName(TencCoin, "Ten Cent Coin");
                GameRegistry.registerItem(TendNote, "TendNote"); LanguageRegistry.addName(TendNote, "Ten Dollar Note");
                GameRegistry.registerItem(TwentycCoin, "TwentycCoin"); LanguageRegistry.addName(TwentycCoin, "Twenty Cent Coin");
                GameRegistry.registerItem(TwentydNote, "TwentydNote"); LanguageRegistry.addName(TwentydNote, "Twenty Dollar Note");
                GameRegistry.registerItem(TwocCoin, "TwocCoin"); LanguageRegistry.addName(TwocCoin, "Two Cent Coin");
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        }
}

