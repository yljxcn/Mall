package com.xmg.mall.base.domain;

/**
 * &：参与运算的两个数，若相应位数的值都为1，则该位结果值是1，否则是0。

 |：参与运算的两个数相应位中只要有一个1，结果就是1。

 ^：参与运算的两个数相应位相同则结果为0，否则为1。

 */
public class Mod {

	public static boolean hasMod(Long mods, long mod){
		if(((mod - 1L) & mod) != 0L)
			throw new IllegalArgumentException("mod 数非法：" + mod);

		if(mods == null)
			return false;

		return (mods & mod) != 0;
	}

	public static Long addMod(Long mods, long mod){
		return setMod(mods, mod, true);
	}

	public static Long removeMod(Long mods, long mod){
		return setMod(mods, mod, false);
	}

	public static Long setMod(Long mods, long mod, boolean b){
		
		if(mods == null)
			return b ? mod : 0L;

		if(((mod - 1L) & mod) != 0L)
			throw new IllegalArgumentException("mod 数非法：" + mod);

		if(b && hasMod(mods, mod))
			return mods;

		if(!b && !hasMod(mods, mod))
			return mods;

		return (b) ? (mods | mod) : (mods ^ mod);
		
	}
}
