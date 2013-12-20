package bashful.bankcraft;

//Let the imports BEGIN!
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
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
import bashful.bankcraft.block.*;
import bashful.bankcraft.item.*;
import bashful.bankcraft.tileentity.*;


@Mod(modid="Bankcraft", name="Bankcraft", version="0.0.3")
@NetworkMod(clientSideRequired=true)
public class Bankcraft {
	public static final String modid = "Bashful_Bankcraft";
	//Blocks
	public static Block ATM = new ATM(2550, Material.rock);
	public static TileEntity TileEntityCashRegister = new TileEntityCashRegister();
	public static Block SafeDoorLocked = new SafeDoorLocked(2551, Material.rock);
	public static Block SafeDoorOpen = new SafeDoorOpen(2552, Material.rock);
	public static Block Mint = new Mint(2553, Material.rock);
	public static Block PiggyBank = new PiggyBank(2554, Material.rock);
	public static Block Print = new Print(2555, Material.rock);
	public static Block CashRegister = new CashRegister(2556, Material.rock);
	//Items
	public static Item CreditCard = new CreditCard(2557).setTextureName("Bankcraft:CreditCard");
	public static Item FiftycCoin = new FiftycCoin(2558).setTextureName("Bankcraft:FiftycCoin");
	public static Item FiftydNote = new FiftydNote(2559).setTextureName("Bankcraft:FiftydNote");
	public static Item FivecCoin = new FivecCoin(2560).setTextureName("Bankcraft:FivecCoin");
	public static Item FivedNote = new FivedNote(2561).setTextureName("Bankcraft:FivedNote");
	public static Item HundreddNote = new HundreddNote(2562).setTextureName("Bankcraft:HundreddNote");
	public static Item OnecCoin = new OnecCoin(2563).setTextureName("Bankcraft:OnecCoin");
	public static Item OnedNote = new OnedNote(2564).setTextureName("Bankcraft:OnedNote");
	public static Item TencCoin = new TencCoin(2565).setTextureName("Bankcraft:TencCoin");
	public static Item TendNote = new TendNote(2566).setTextureName("Bankcraft:TendNote");
	public static Item TwentycCoin = new TwentycCoin(2567).setTextureName("Bankcraft:TwentycCoin");
	public static Item TwentydNote = new TwentydNote(2568).setTextureName("Bankcraft:TwentydNote");
	public static Item TwocCoin = new TwocCoin(2569).setTextureName("Bankcraft:TwocCoin");
	public static Item RawPiggyBank = new RawPiggyBank(2570).setTextureName("Bankcraft:RawPiggyBank");
	public static Item Coin = new Coin(2571);
	
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
                //Blocks
                GameRegistry.registerBlock(ATM, "ATM"); LanguageRegistry.addName(ATM, "ATM");
                GameRegistry.registerBlock(SafeDoorLocked, "SafeDoorLocked"); LanguageRegistry.addName(SafeDoorLocked, "Safe Door Locked");
                GameRegistry.registerBlock(SafeDoorOpen, "SafeDoorOpen"); LanguageRegistry.addName(SafeDoorOpen, "Safe Door Open");
                GameRegistry.registerBlock(Mint, "Mint"); LanguageRegistry.addName(Mint, "Mint");
                GameRegistry.registerBlock(PiggyBank, "PiggyBank"); LanguageRegistry.addName(PiggyBank, "Piggy Bank");
                GameRegistry.registerBlock(Print, "Print"); LanguageRegistry.addName(Print, "Money Printing Machine");
                GameRegistry.registerBlock(CashRegister, "CashRegister"); LanguageRegistry.addName(CashRegister, "Cash Register");
                //Items
                GameRegistry.registerItem(CreditCard, "CreditCard"); LanguageRegistry.addName(CreditCard, "CreditCard");
                GameRegistry.registerItem(FiftycCoin, "FiftycCoin"); LanguageRegistry.addName(FiftycCoin, "Fifty Cent Coin");
                GameRegistry.registerItem(FiftydNote, "FiftydNote"); LanguageRegistry.addName(FiftydNote, "Fifty Dollar Note");
                GameRegistry.registerItem(FivecCoin, "FivecCoin"); LanguageRegistry.addName(FivecCoin, "Five Cent Coin");
                GameRegistry.registerItem(FivedNote, "FivedNote"); LanguageRegistry.addName(FivedNote, "Five Dollar Note");
                GameRegistry.registerItem(HundreddNote, "HundreddNote"); LanguageRegistry.addName(HundreddNote, "One Hundred Dollar Note");
                GameRegistry.registerItem(OnecCoin, "OnecCoin"); LanguageRegistry.addName(OnecCoin, "One Cent Coin");
                GameRegistry.registerItem(OnedNote, "OnedNote"); LanguageRegistry.addName(OnedNote, "One Dollar Note");
                GameRegistry.registerItem(TencCoin, "TencCoin"); LanguageRegistry.addName(TencCoin, "Ten Cent Coin");
                GameRegistry.registerItem(TendNote, "TendNote"); LanguageRegistry.addName(TendNote, "Ten Dollar Note");
                GameRegistry.registerItem(TwentycCoin, "TwentycCoin"); LanguageRegistry.addName(TwentycCoin, "Twenty Cent Coin");
                GameRegistry.registerItem(TwentydNote, "TwentydNote"); LanguageRegistry.addName(TwentydNote, "Twenty Dollar Note");
                GameRegistry.registerItem(TwocCoin, "TwocCoin"); LanguageRegistry.addName(TwocCoin, "Two Cent Coin");
                GameRegistry.registerItem(RawPiggyBank, "RawPiggybank"); LanguageRegistry.addName(RawPiggyBank, "Uncooked Piggy Bank");
                GameRegistry.registerItem(Coin, "Coin"); LanguageRegistry.addName(Coin, "Coin");
                
                //entities
                GameRegistry.registerTileEntity(CashRegister.class, "TileEntityCashRegister"); LanguageRegistry.addName(TileEntityCashRegister, "TileEntityCashRegister");
                               
                
                //Recipes
                ItemStack ATMStack = new ItemStack(ATM);
                ItemStack SafeDoorOpenStack = new ItemStack(SafeDoorOpen);
                ItemStack DoorStack = new ItemStack(Item.doorIron);
                ItemStack MintStack = new ItemStack(Mint);
                ItemStack PrintStack = new ItemStack(Print);
                ItemStack CashRegisterStack = new ItemStack(CashRegister);
                ItemStack CreditCardStack = new ItemStack(CreditCard);
                ItemStack PiggyBankStack = new ItemStack(PiggyBank);
                ItemStack RawPiggyBankStack = new ItemStack(RawPiggyBank);
                ItemStack IronStack = new ItemStack(Item.ingotIron);
                ItemStack EnderchestStack = new ItemStack(Block.enderChest);
                ItemStack RedstoneStack = new ItemStack(Item.redstone);
                ItemStack IronBlockStack = new ItemStack(Block.blockIron);
                ItemStack DispenserStack = new ItemStack(Block.dispenser);
                ItemStack PlankStack = new ItemStack(Block.planks);
                ItemStack GlassStack = new ItemStack(Block.glass);
                ItemStack ChestStack = new ItemStack(Block.chest);
                ItemStack ChestTStack = new ItemStack(Block.chestTrapped);
                ItemStack ClayStack = new ItemStack(Item.clay);

                GameRegistry.addRecipe (ATMStack, "iri", "rer", "iri",'i', IronStack, 'r', RedstoneStack, 'e', EnderchestStack);
                GameRegistry.addRecipe (SafeDoorOpenStack, "III", "IdI", "III",'I', IronBlockStack, 'd', DoorStack);
                GameRegistry.addRecipe (MintStack, "iri", "rdr", "iri", 'i', IronStack, 'r', RedstoneStack, 'd', DispenserStack);
                GameRegistry.addRecipe(PrintStack, "IrI", "rdr", "IrI", 'I', IronBlockStack, 'r', RedstoneStack, 'd', DispenserStack);
                GameRegistry.addRecipe(CashRegisterStack, "pgp", "pcp", "prp", 'p', PlankStack, 'g', GlassStack, 'r', RedstoneStack, 'c', ChestStack);
                GameRegistry.addRecipe(CashRegisterStack, "pgp", "pcp", "prp", 'p', PlankStack, 'g', GlassStack, 'r', RedstoneStack, 'c', ChestTStack);
                GameRegistry.addRecipe(RawPiggyBankStack, "ccc", "c c", "ccc", 'c', ClayStack);
                GameRegistry.addSmelting(RawPiggyBank.itemID, PiggyBankStack, 0f);
                //debug recipes
                
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
        }
}

