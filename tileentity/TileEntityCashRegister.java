package bashful.bankcraft.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCashRegister extends TileEntity {

		private int timer;
		
		public void TileEntityBomb()
		{
			timer = 100;
		}
		
		@Override
		public void updateEntity() {
			if (timer == 0 && !worldObj.isRemote)
			{
				
				
			}
			timer --;
		}
		
	private void spread(int x, int y, int z)
	{
		if (worldObj.isAirBlock(x,  y,  z))
		{
			worldObj.setBlock(x, y, z, CashRegister)
		}
	}
}
