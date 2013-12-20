package bashful.bankcraft.Config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import bashful.bankcraft.block.BlockInfo;
import bashful.bankcraft.item.ItemInfo;

public class ConfigHandler {

	
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.ATM_ID = config.getBlock(BlockInfo.ATM_KEY, BlockInfo.ATM_DEFAULT) .getInt() - 256;
		BlockInfo.CASHREGISTER_ID = config.getBlock(BlockInfo.CASHREGISTER_KEY, BlockInfo.CASHREGISTER_DEFAULT) .getInt() - 256;
		BlockInfo.MINT_ID = config.getBlock(BlockInfo.MINT_KEY, BlockInfo.MINT_DEFAULT) .getInt() - 256;
		BlockInfo.PIGGYBANK_ID = config.getBlock(BlockInfo.PIGGYBANK_KEY, BlockInfo.PIGGYBANK_DEFAULT) .getInt() - 256;
		BlockInfo.PRINT_ID = config.getBlock(BlockInfo.PRINT_KEY, BlockInfo.PRINT_DEFAULT) .getInt() - 256;
		BlockInfo.SAFEDOORLOCKED_ID = config.getBlock(BlockInfo.SAFEDOORLOCKED_KEY, BlockInfo.SAFEDOORLOCKED_DEFAULT) .getInt() - 256;
		BlockInfo.SAFEDOOROPEN_ID = config.getBlock(BlockInfo.SAFEDOOROPEN_KEY, BlockInfo.SAFEDOOROPEN_DEFAULT) .getInt() - 256;
		ItemInfo.COIN_ID = config.getItem(category, ItemInfo.COIN_KEY, ItemInfo.COIN_DEFAULT, comment)
		
		
		config.save();
		
		
	}
}
